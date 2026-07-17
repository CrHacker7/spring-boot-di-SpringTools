# Documentation
- Change the application.properties configuration to UTF-8, like this you do not brake the app.
- So, to solve this issue you need to change the vowel with accent:
- `&aacute;` -->  `&a + acute;` 
- `&eacute;` --> `&e + acute;` 
- And change the html too adding "u" in front of text: `th:utext=` this mean not to escape the special char.

#### Bean Scope
- Methods PostConstruct and PreDestroy are by default Singleton. 
- **Singleton (default):** One shared instance is created for the entire Spring container lifecycle.
- **@RequestScope:** creates a new bean instance for each HTTP request. The bean exists during the request lifecycle and is destroyed when the request is completed. A new instance is created for each new request (for example, when refreshing a page).
- **@SessionScope:** Creates a bean instance per user session. It is commonly used for objects like a shopping cart. The bean remains available while the session is active and is destroyed when the session expires, the user logs out, or the session is invalidated. It may need to implement `Serializable` if the session data has to be stored or replicated. 
1. After implements Serializable in Invoice class, you need to add generated serial version ID. 