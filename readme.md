# Documentation
- Change the application.properties configuration to UTF-8, like this you do not brake the app.
- So, to solve this issue you need to change the vowel with accent:
- `&aacute;` -->  `&a + acute;` 
- `&eacute;` --> `&e + acute;` 
- And change the html too adding "u" in front of text: `th:utext=` this mean not to escape the special char.