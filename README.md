# 🧪 Full-Stack Coding Test – Angular + Spring Boot (with H2 + Search)

### ⏱ Estimated Time: 1 Hour

## 🎯 Objective
Build a full-stack application that:
- Fetches and stores a random user in an H2 database
- Fetches a random dog image and combines it with the user
- Allows searching stored users by name
- Displays everything in Angular using RxJS

---

## 🧰 Technologies Required
- **Backend**: Java, Spring Boot, Spring Data JPA, H2, WebClient
- **Frontend**: Angular, RxJS

---

## ✅ Backend Requirements (Spring Boot)

1. Implement the following endpoint:
   ```http
   GET /api/user/random
   ```
   - Fetches a user from [https://randomuser.me/api](https://randomuser.me/api)
   - Stores the user in an H2 in-memory database
   - Fetches a dog image from [https://dog.ceo/api/breeds/image/random](https://dog.ceo/api/breeds/image/random)
   - Returns a combined response:
     ```json
     {
       "user": {
         "uuid": "user-id",
         "name": "John Doe",
         "email": "john@example.com",
         "pictureUrl": "https://..."
       },
       "dogImageUrl": "https://..."
     }
     ```

2. Implement the following search endpoint:
   ```http
   GET /api/user/search?name=John
   ```
   - Searches for users whose name contains the given string (case-insensitive)

---

## 💻 Frontend Requirements (Angular)

1. Call `/api/user/random` and display:
   - User name
   - Email
   - Profile picture
   - Dog image

2. Implement a search box that calls `/api/user/search?name=...` on user input and displays matching users.

3. Use **RxJS operators** (e.g., `switchMap`, `mergeMap`, `concatMap`, `exhaustMap`, etc.) to handle the data flow.

4. Avoid using nested `subscribe()` calls.

---

## 🖥 Backend Setup
```bash
cd backend
./mvnw spring-boot:run
```
- Base URL: `http://localhost:8080`
- H2 Console: `http://localhost:8080/h2-console`

---

## 🌐 Frontend Setup
```bash
cd frontend
npm install
ng serve
```
- App runs at: `http://localhost:4200`

---

## 🎁 Bonus Points (Optional)
- Use Angular Material or Bootstrap for styling
- Add basic exception handling with `@ControllerAdvice`
- Implement unit tests for backend or frontend
- Use localStorage or service caching

---

## 📤 Submission Instructions
- Push your completed project to a GitHub repository (public or private)
- Or send a `.zip` of your project folder
- Include a `README.md` with any notes or assumptions
