# Student API
## 📋 Description:
API REST de gestion d'étudiants développée avec Spring Boot. Cette application permet d'effectuer des opérations CRUD sur 
des étudiants avec une base de données MySQL.

## 🛠 Technologies utilisées
Java 17

Spring Boot

Spring Web

Spring Data JPA

MySQL

Swagger / OpenAPI

Maven

## 📁 Structure du projet
src/main/java/ma/fst/studentapi/

controller/ : Gestion des requêtes HTTP

dto/ : Objets de transfert de données

entity/ : Entités JPA

exception/ : Gestion des erreurs

mapper/ : Conversion entre entités et DTO

repository/ : Accès à la base de données

service/ : Logique métier

## ⚙ Configuration
Base de données MySQL
Nom de la base : student_db

Utilisateur : root

Mot de passe : 

Port : 3306

Application
Port : 8081

Swagger UI : http://localhost:8081/swagger-ui/index.html

## 📡 Endpoints disponibles
Étudiants
POST /api/students : Créer un étudiant

GET /api/students : Lister tous les étudiants

GET /api/students/{id} : Rechercher par ID

GET /api/students/major/{major} : Rechercher par filière

PUT /api/students/{id} : Modifier un étudiant

DELETE /api/students/{id} : Supprimer un étudiant

## 🧪 Tests et captures d'écran
### Test 1 - Création d'un étudiant



Test 2 - Liste de tous les étudiants
GET /api/students
Statut attendu : 200 OK
Retourne tous les étudiants au format JSON.

Test 3 - Recherche par ID
GET /api/students/1
Statut attendu : 200 OK
Retourne l'étudiant avec l'identifiant 1.

Test 4 - Recherche par filière
GET /api/students/major/Génie Informatique
Statut attendu : 200 OK
Retourne tous les étudiants de la filière Génie Informatique.

Test 5 - Mise à jour d'un étudiant
PUT /api/students/1
Statut attendu : 200 OK
Met à jour les informations de l'étudiant avec l'ID 1.

Test 6 - Suppression d'un étudiant
DELETE /api/students/2
Statut attendu : 204 No Content
Supprime l'étudiant avec l'ID 2.

Test 7 - Gestion des erreurs
Erreur de validation
POST /api/students avec âge = 15
Statut attendu : 400 Bad Request
Message : L'âge minimum pour s'inscrire est 17 ans

Ressource non trouvée
GET /api/students/999
Statut attendu : 404 Not Found
Message : Aucun étudiant trouvé avec l'identifiant 999

Email en double
POST /api/students avec email déjà existant
Statut attendu : 409 Conflict
Message : Un étudiant avec l'adresse xxx existe déjà

📊 Aperçu des fonctionnalités
L'API offre une gestion complète des étudiants avec :

Validation des données entrantes

Messages d'erreur personnalisés en français

Documentation interactive via Swagger

Architecture en couches bien séparée

Connexion à une base de données MySQL

🚀 Comment exécuter le projet
Démarrer MySQL

Lancer l'application avec la commande : ./mvnw spring-boot:run

Accéder à Swagger UI : http://localhost:8081/swagger-ui/index.html

Tester les différents endpoints

✅ Fonctionnalités validées
Création d'étudiants

Consultation individuelle et collective

Recherche par filière

Modification des informations

Suppression d'étudiants

Validation des champs obligatoires

Gestion des erreurs avec codes HTTP appropriés

Interface de test Swagger

📝 Notes importantes
L'application utilise Hibernate pour la persistance

La base de données est créée automatiquement au premier démarrage

Les messages d'erreur sont en français pour une meilleure expérience utilisateur

L'architecture suit les bonnes pratiques de séparation des responsabilités
