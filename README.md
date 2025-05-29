📓 JournalApp - Secure & Scalable Backend API
A fully-featured backend-only journal management system built with Spring Boot, offering:

RESTful APIs

MongoDB Atlas integration

JWT-based authentication

Redis caching

Role-based access control (RBAC)

⚙️ Ideal for integration with frontend stacks like React, Angular, or Vue. No frontend included — just the backend engine, ready to power any journal application.



🔧 Features
📑 CRUD operations for journal entries via REST APIs

🧾 MongoDB Atlas for persistent, scalable cloud storage

⚡ Redis caching to accelerate weather data retrieval (up to 40% faster response)

🔐 JWT authentication with Spring Security

👥 Role-based access control for Admins and Users

📬 Email notifications via JavaMailSender with scheduled tasks

📉 Swagger UI (OAS 3.0) documentation for interactive API testing

🧹 Lombok integration to reduce boilerplate Java code

✅ SonarQube Cloud integration for static code analysis and quality assurance





🖥️ Swagger API Documentation
Interact with the API using Swagger UI (OpenAPI 3.0) [a2](https://github.com/user-attachments/assets/3a8716e9-e359-428f-ab2b-9d30baf7e9d3)

🔐 JWT Authentication Debug View
Visual of secure JWT generation and authentication with Spring Security


| Layer             | Technology                 |
| ----------------- | -------------------------- |
| Backend Framework | Spring Boot                |
| Security          | Spring Security + JWT      |
| Cache             | Redis                      |
| Database          | MongoDB Atlas              |
| API Docs          | Swagger UI (OAS 3.0)       |
| Code Quality      | SonarQube Cloud            |
| Email             | JavaMailSender + Scheduler |
| Dev Convenience   | Lombok                     |

| Method | Endpoint                   | Description            |
| ------ | -------------------------- | ---------------------- |
| POST   | `/admin/create-admin-user` | Register an admin user |
| GET    | `/admin/clear-app-cache`   | Clear Redis cache      |
| GET    | `/admin/all-users`         | View all users         |

| Method | Endpoint | Description      |
| ------ | -------- | ---------------- |
| GET    | `/user`  | Get user details |
| POST   | `/login` | User login (JWT) |

