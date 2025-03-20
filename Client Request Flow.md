# Request Flow in Spring Boot

Whenever a user requests an API, it follows a structured path:

1. Client (Frontend or API Consumer) → Sends an HTTP request.
2. Dispatcher Servlet → Core component that intercepts requests.
3. Filter & Interceptor → Pre-processing like authentication, logging, etc.
4. Controller Layer (@RestController) → Handles API logic.
5. Service Layer (@Service) → Business logic.
6. Repository Layer (@Repository) → Fetches/stores data in the database.
7. Database → Stores and retrieves data.
8. Response Sent Back → API returns a response to the client.

```
+-------------+       +-----------------+       +----------------+       +------------------+       +-----------+
|  Client     | --->  | Dispatcher      | --->  |  Controller    | --->  |  Service Layer   | --->  | Database  |
|  (Browser,  |       | Servlet         |       |  (@RestController) |       |  (@Service)      |       | (MySQL,   |
|  Postman)   |       | (Spring MVC)    |       |                |       |                  |       |  MongoDB)  |
+-------------+       +-----------------+       +----------------+       +------------------+       +-----------+
                            |                          |                           |
                            |                          |                           |
                     +-------------+           +---------------+          +-----------------+
                     |  Filters    |           | Interceptors  |          | Repositories   |
                     | (Security,  |           | (Logging,     |          | (@Repository)  |
                     | CORS, etc.) |           |  Metrics)     |          |               |
                     +-------------+           +---------------+          +-----------------+

```

# Step-by-Step Request Handling

Step 1: User Makes API Request

Step 2: Dispatcher Servlet Receives the Request
Spring Boot uses DispatcherServlet to handle all incoming requests.
It acts as a front controller and delegates requests.
Key Responsibilities: ✔️ Routes request to the correct controller.
✔️ Applies Filters & Interceptors (authentication, logging, etc.).

Step 3: Filters & Interceptors Process the Request
Filters (javax.servlet.Filter): Handles security (JWT, OAuth), CORS, logging.
Interceptors (HandlerInterceptor): Executes code before and after controllers (e.g., logging, authentication).

Step 4: Controller Layer Handles the Request
The Controller Layer (@RestController) processes the request.
Calls Service Layer to fetch user details.

Step 5: Service Layer Applies Business Logic
The Service Layer processes logic (validations, transformations).
Calls Repository Layer to fetch data from the database.

Step 6: Repository Layer Fetches Data from Database
The Repository Layer (@Repository) interacts with the database using JPA.

Step 7: Data is Sent Back to Client
The User object is converted to JSON.
Spring Boot automatically serializes Java objects into JSON format.

# Summary of API Request Flow

1️⃣ User sends request (GET /users/1).
2️⃣ DispatcherServlet processes request and routes it.
3️⃣ Filters & Interceptors handle logging/security.
4️⃣ Controller handles request and calls the Service Layer.
5️⃣ Service Layer fetches data from Repository.
6️⃣ Repository Layer gets user from database.
7️⃣ Response is sent back in JSON format.
