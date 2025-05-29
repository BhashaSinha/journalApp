📓 JournalApp - Secure & Scalable Backend API
A fully-featured, backend-only journal management system built with Spring Boot, featuring RESTful APIs, MongoDB Atlas integration, JWT authentication, Redis caching, and robust role-based access control.

⚙️ This project is designed for developers and teams who need a secure and scalable journaling backend system without a frontend. Ideal for integration into any frontend stack (React, Angular, etc.).

🔧 Features
📑 CRUD operations for journal entries via RESTful APIs.

🧾 MongoDB Atlas for persistent and scalable data storage.

⚡ Redis caching to accelerate weather data retrieval, improving response times by 40%.

🔐 JWT-based authentication with Spring Security — battle-tested for protection against unauthorized access.

👥 Role-based access control (Admin/User).

📬 Email notifications for users via JavaMailSender and scheduled tasks.

📉 Swagger documentation with OAS 3.0, enabling easy API testing and peer review.

🧹 Lombok integration to reduce boilerplate code and improve maintainability.

✅ SonarQube Cloud code analysis to ensure high code quality, identifying 10+ potential issues early.

🖥️ Swagger API UI (https://github.com/user-attachments/assets/70c3e5db-e7c5-41ce-a057-d75610af65ae)

The APIs are well-documented using Swagger, enabling developers to interact and test endpoints effortlessly.


🔐 Debugging JWT Authentication
Insight into the secure login flow with JWT generation and Spring Security authentication logic.


🛠️ Tech Stack
Layer	Technology
Backend Framework	Spring Boot
Security	Spring Security + JWT
Cache	Redis
Database	MongoDB Atlas
Docs & Testing	Swagger UI (OAS 3.0)
Code Quality	SonarQube Cloud
Boilerplate Reduction	Lombok
Email Handling	JavaMailSender + Scheduler

📦 Installation & Setup
⚠️ This project was deployed locally and connected to an external (now expired) MongoDB cluster. Make sure to update environment variables and configurations accordingly.

Prerequisites
Java 17+

Maven

Redis server (optional for caching)

MongoDB Atlas or local MongoDB instance

🚀 API Endpoints
🔐 Admin APIs
Method	Endpoint	Description
POST	/admin/create-admin-user	Register an admin user
GET	/admin/clear-app-cache	Clear Redis cache
GET	/admin/all-users	View all registered users

👤 User APIs
Method	Endpoint	Description
GET	/user	Get user details
POST	/login	User login (JWT)

📬 Email & Scheduling
The application automatically sends notification emails on specific user actions using JavaMailSender and runs periodic tasks via @Scheduled jobs.

✅ Code Quality
Analyzed using SonarQube Cloud to maintain clean, secure, and efficient code. Caught and resolved over 10+ potential bugs and security vulnerabilities during development.

🧪 Testing
✅ Tested extensively using Postman.

✅ JWT authentication verified.

✅ API caching performance validated.

🧠 Learnings & Highlights
Integration of multiple Spring modules and external services like Redis and MongoDB Atlas.

Emphasis on clean architecture and maintainability with Lombok and SonarQube.

Real-world authentication and authorization scenarios using JWT.

Production-level documentation with Swagger.

📌 Note
The backend is standalone and currently not connected to any frontend due to expired third-party services (MongoDB, email SMTP). You can integrate this backend with any UI of your choice.

📫 Contact
Created by Bhasha – feel free to reach out or contribute!
