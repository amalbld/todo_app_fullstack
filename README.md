# Todo App Fullstack 📝

Application web fullstack de gestion de tâches — API REST Spring Boot + interface Angular.

---

## 🛠 Stack technique

| Côté | Technologies |
|------|-------------|
| **Backend** | Java 17 · Spring Boot · Spring Data JPA · REST API |
| **Frontend** | Angular |
| **Base de données** | MySQL / H2 (dev) |
| **Outils** | Maven · npm · Git |

---

## ✨ Fonctionnalités

- ✅ Créer une tâche
- 📋 Lister toutes les tâches
- ✏️ Modifier une tâche existante
- 🗑️ Supprimer une tâche
- 🔗 Communication Frontend ↔ Backend via API REST

---

## 📁 Structure du projet

```
todo_app_fullstack/
├── backend/          # API REST Spring Boot
│   ├── src/
│   │   └── main/java/...
│   └── pom.xml
├── frontend/         # Interface Angular
│   ├── src/
│   └── package.json
└── README.md
```

---

## 🚀 Lancer le projet

### Prérequis

- Java 17+
- Node.js 18+ & npm
- Maven

### 1. Backend (Spring Boot)

```bash
cd backend
./mvnw spring-boot:run
```

L'API démarre sur **http://localhost:8080**

### 2. Frontend (Angular)

```bash
cd frontend
npm install
ng serve
```

L'interface démarre sur **http://localhost:4200**

---

## 🔌 Endpoints API

| Méthode | Endpoint | Description |
|---------|----------|-------------|
| `GET` | `/api/tasks` | Récupérer toutes les tâches |
| `GET` | `/api/tasks/{id}` | Récupérer une tâche |
| `POST` | `/api/tasks` | Créer une tâche |
| `PUT` | `/api/tasks/{id}` | Modifier une tâche |
| `DELETE` | `/api/tasks/{id}` | Supprimer une tâche |

---

## 👤 Auteur

**Amal** — [GitHub](https://github.com/amalbld) · [LinkedIn](https://www.linkedin.com/in/amal-boulaaid-a976ba1b9/)
