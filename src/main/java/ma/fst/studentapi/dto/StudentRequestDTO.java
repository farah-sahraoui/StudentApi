package ma.fst.studentapi.dto;

import jakarta.validation.constraints.*;

public record StudentRequestDTO(

        @NotBlank(message = "Le champ prénom ne peut pas être vide")
        @Size(min = 2, max = 100, message = "Le prénom doit contenir entre 2 et 100 caractères")
        String firstName,

        @NotBlank(message = "Le champ nom ne peut pas être vide")
        @Size(min = 2, max = 100, message = "Le nom doit contenir entre 2 et 100 caractères")
        String lastName,

        @NotBlank(message = "L'adresse email est requise")
        @Email(message = "Le format de l'email n'est pas valide")
        String email,

        @NotBlank(message = "La filière est obligatoire")
        @Size(min = 3, max = 100, message = "La filière doit contenir entre 3 et 100 caractères")
        String major,
        @NotNull(message = "L'âge est un champ requis")
        @Min(value = 17, message = "L'âge minimum pour s'inscrire est 17 ans")
        @Max(value = 60, message = "L'âge maximum autorisé est 60 ans")
        Integer age
) {}
