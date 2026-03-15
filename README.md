
# Student API

##  Description
API REST de gestion d'étudiants développée avec Spring Boot. Cette application permet d'effectuer des opérations CRUD sur des étudiants avec une base de données MySQL.

##  Technologies utilisées
- Java 17
- Spring Boot
- Spring Web
- Spring Data JPA
- MySQL
- Swagger / OpenAPI
- Maven

##  Structure du projet
src/main/java/ma/fst/studentapi/
- controller/ : Gestion des requêtes HTTP
- dto/ : Objets de transfert de données
- entity/ : Entités JPA
- exception/ : Gestion des erreurs
- mapper/ : Conversion entre entités et DTO
- repository/ : Accès à la base de données
- service/ : Logique métier

## ⚙ Configuration

### Base de données MySQL
- Nom de la base : student_db
- Utilisateur : root
- Mot de passe : root123
- Port : 3306

### Application
- Port : 8081
- Swagger UI : http://localhost:8081/swagger-ui/index.html

## 📡 Endpoints disponibles

### Étudiants
- POST /api/students : Créer un étudiant
- GET /api/students : Lister tous les étudiants
- GET /api/students/{id} : Rechercher par ID
- GET /api/students/major/{major} : Rechercher par filière
- PUT /api/students/{id} : Modifier un étudiant
- DELETE /api/students/{id} : Supprimer un étudiant

##  Tests et captures d'écran

### Test 1 - Création d'un étudiant
<img width="1782" height="882" alt="Image" src="https://github.com/user-attachments/assets/823d84fd-c80b-45dc-a8e7-847346b67868" />
<img width="1756" height="431" alt="Image" src="https://github.com/user-attachments/assets/0f9eb234-d124-428b-84a1-3a13897acf1f" />

### Test 2 - Liste de tous les étudiants
<img width="1807" height="394" alt="Image" src="https://github.com/user-attachments/assets/76345ac6-cbc1-41d2-a298-1ef44ebfd39e" />
<img width="1777" height="630" alt="Image" src="https://github.com/user-attachments/assets/6147505a-9b2b-4bfe-a4b3-50abf8d60bb2" />

### Test 3 - Recherche par ID

<img width="1780" height="521" alt="Image" src="https://github.com/user-attachments/assets/f28bfeab-44f2-47e8-ab1f-fd778f9166d7" />
<img width="1773" height="590" alt="Image" src="https://github.com/user-attachments/assets/e0069ca5-fc12-4f39-a25f-928f3d63cde9" />

### Test 4 - Recherche par filière
<img width="1777" height="521" alt="Image" src="https://github.com/user-attachments/assets/70666bcc-553e-40d4-99f3-fad26b3abd92" />
<img width="1789" height="637" alt="Image" src="https://github.com/user-attachments/assets/5dfa9236-0455-4215-a030-84d469a738aa" />


### Test 5 - Mise à jour d'un étudiant
<img width="1775" height="710" alt="Image" src="https://github.com/user-attachments/assets/ce50d387-9896-47f9-a054-c2e1e64f2067" />
<img width="1766" height="719" alt="Image" src="https://github.com/user-attachments/assets/b4281c3d-7bd5-4e9d-8dfc-61ce16a19647" />

### Test 6 - Suppression d'un étudiant
<img width="1817" height="523" alt="Image" src="https://github.com/user-attachments/assets/2a60b8e5-84b5-40e6-a9be-97ec06be7688" />
<img width="1773" height="705" alt="Image" src="https://github.com/user-attachments/assets/534c8251-00e2-4861-9c01-0e0aa13fecc4" />

### Test 7 - Gestion des erreurs

<img width="918" height="879" alt="Image" src="https://github.com/user-attachments/assets/1fb7547b-4086-4605-a7f8-1cfad1486986" />
<img width="926" height="224" alt="Image" src="https://github.com/user-attachments/assets/158cc6b4-7726-49ec-9fad-29cac761d13a" />


<img width="919" height="874" alt="Image" src="https://github.com/user-attachments/assets/2f3cbf4b-5b23-4bf1-8844-4870c444ae02" />
<img width="921" height="260" alt="Image" src="https://github.com/user-attachments/assets/e2e3849c-c424-4b41-8be7-ca5f51d8c742" />




##  Aperçu des fonctionnalités

L'API offre une gestion complète des étudiants avec :
- Validation des données entrantes
- Messages d'erreur personnalisés en français
- Documentation interactive via Swagger
- Architecture en couches bien séparée
- Connexion à une base de données MySQL

##  Comment exécuter le projet

1. Démarrer MySQL
2. Lancer l'application avec la commande : ./mvnw spring-boot:run
3. Accéder à Swagger UI : http://localhost:8081/swagger-ui/index.html
4. Tester les différents endpoints

##  Fonctionnalités validées

- Création d'étudiants
- Consultation individuelle et collective
- Recherche par filière
- Modification des informations
- Suppression d'étudiants
- Validation des champs obligatoires
- Gestion des erreurs avec codes HTTP appropriés
- Interface de test Swagger

## 📝 Notes importantes

- L'application utilise Hibernate pour la persistance
- La base de données est créée automatiquement au premier démarrage
- Les messages d'erreur sont en français pour une meilleure expérience utilisateur
- L'architecture suit les bonnes pratiques de séparation des responsabilités
