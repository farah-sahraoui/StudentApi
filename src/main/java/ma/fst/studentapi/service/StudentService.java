package ma.fst.studentapi.service;

import ma.fst.studentapi.dto.StudentRequestDTO;
import ma.fst.studentapi.dto.StudentResponseDTO;
import ma.fst.studentapi.entity.Student;
import ma.fst.studentapi.exception.ResourceNotFoundException;
import ma.fst.studentapi.mapper.StudentMapper;
import ma.fst.studentapi.repository.StudentRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRepository;
    private final StudentMapper studentMapper;

    public StudentService(StudentRepository studentRepository, StudentMapper studentMapper) {
        this.studentRepository = studentRepository;
        this.studentMapper = studentMapper;
    }

    @Transactional
    public StudentResponseDTO addStudent(StudentRequestDTO dto) {

        if (studentRepository.existsByEmail(dto.email())) {
            throw new RuntimeException("Un étudiant avec l'adresse " + dto.email() + " existe déjà dans le système");
        }

        Student student = studentMapper.toEntity(dto);
        Student savedStudent = studentRepository.save(student);
        return studentMapper.toResponseDTO(savedStudent);
    }

    public List<StudentResponseDTO> getAllStudents() {
        List<Student> students = studentRepository.findAll();
        return students.stream()
                .map(studentMapper::toResponseDTO)
                .toList();
    }

    public StudentResponseDTO getStudentById(Long id) {

        Student student = studentRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(
                        "Aucun étudiant trouvé avec l'identifiant " + id));

        return studentMapper.toResponseDTO(student);
    }

    public List<StudentResponseDTO> getStudentsByMajor(String major) {
        return studentRepository.findAll().stream()
                .filter(s -> s.getMajor().equalsIgnoreCase(major))
                .map(studentMapper::toResponseDTO)
                .toList();
    }

    @Transactional
    public StudentResponseDTO updateStudent(Long id, StudentRequestDTO dto) {

        Student student = studentRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(
                        "Impossible de mettre à jour : étudiant avec l'ID " + id + " n'existe pas"));

        if (!student.getEmail().equals(dto.email()) && studentRepository.existsByEmail(dto.email())) {
            throw new RuntimeException("L'adresse " + dto.email() + " est déjà attribuée à un autre étudiant");
        }

        studentMapper.updateEntityFromDTO(dto, student);
        Student updatedStudent = studentRepository.save(student);

        return studentMapper.toResponseDTO(updatedStudent);
    }

    @Transactional
    public void deleteStudent(Long id) {

        Student student = studentRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(
                        "Suppression impossible : étudiant avec l'identifiant " + id + " introuvable"));

        studentRepository.delete(student);
    }
}