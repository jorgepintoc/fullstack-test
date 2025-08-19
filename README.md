# Full-Stack Technical Test

This exercise is designed to evaluate your **Spring Boot** and **Angular** skills.  
You should be able to complete the **core requirements** within ~1 hour.  
The **bonus section** is optional and can be attempted if time allows.

---

## Requirements

### Spring Boot Backend
- Create a REST API with the following endpoints:

  - `GET /api/user/random`  
    - Fetches:
      1. A random user from [randomuser.me](https://randomuser.me/api)  
      2. A random dog image from [dog.ceo](https://dog.ceo/api/breeds/image/random)  
    - Combines the user + dog image into a JSON response.  
    - Example response:
      ```json
      {
        "name": "Marina Šijan",
        "email": "marina.sijan@example.com",
        "dogImage": "https://images.dog.ceo/breeds/husky/n02110185_1469.jpg"
      }
      ```
    - Handle errors gracefully if one of the APIs fails.

---

### Angular Frontend
- Build a single-page app that:
  - Calls `GET /api/user/random`.
  - Uses the random user’s **first name** to call **[api.agify.io](https://api.agify.io)** directly from the frontend:
    - Example: `https://api.agify.io/?name=marina`
  - Combines the backend response with the predicted age and displays it.
  - Uses RxJS in handling API calls.
  - The UI can be minimal but should clearly display:
    - User’s name  
    - Email  
    - Predicted age  
    - Dog image  

---

## Bonus (Optional)
If you have extra time, extend the project with persistence and search:

### Backend
- Use **H2 Database** with **Spring Data JPA**.
- Save fetched users into the database.
- Add endpoint:  
  `GET /api/user/search?name=...`  
  Returns all users whose names contain the given string.
- Enable H2 console at:  
  [http://localhost:8080/h2-console](http://localhost:8080/h2-console).

### Frontend
- Add a search input field (with debounce).
- When the user types, call `/api/user/search?name=...` and display the results.

---

## Instructions
1. **Run the backend**  
   - Navigate to `backend/` and run:  
     ```bash
     ./gradlew bootRun
     ```
   - The API should be available at `http://localhost:8080/api`.

2. **Run the frontend**  
   - Navigate to `frontend/` and run:  
     ```bash
     npm install
     ng serve
     ```
   - Open [http://localhost:4200](http://localhost:4200).

3. **Deliverables**
   - A working backend and frontend implementation.
   - Clean, readable, and maintainable code.
   - Bonus features if you choose to implement them.

---

## Notes
- Focus on correctness and code quality.  
- The **bonus** is not mandatory but helps showcase advanced skills.  
- Keep track of time — aim to have the core solution done within an hour.
