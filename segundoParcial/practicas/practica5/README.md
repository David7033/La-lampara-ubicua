PRÁCTICA No. 5.- Desarrollo de aplicación para móviles con formularios
- DESARROLLO DE LA PRÁCTICA
Toda aplicación con un mínimo de seguridad necesita una pantalla de autenticación de usuario
(Login) que nos da como resultado dos respuestas: pantalla de bienvenida si el usuario existe o
pantalla de error si el usuario no existe.
1. De acuerdo al planteamiento, crear una aplicación en eclipse de tipo J2ME en el que se definirán tres pantallas: formLogin, formLoginOk y formLoginError.
2. También se definen dos cajas de texto y una etiqueta para mostrar la petición al usuario o el mensaje de error: txtUsuario, txtPassword, strMensaje.
3. También se definen los comandos o acciones a realizar sobre las pantallas: cmdEntrar, cmdSalir y cmdAtras.
4. Define un método mostrarPantalla (Displayable nextDisplay) que recibe la siguiente pantalla a mostrar.
5. Implementa un método validarUsuario que obtiene los valores de las cajas de texto y compara con los valores definidos para ser correctos y llama al método dentro del commandAction.
6. Muestra los resultados con pantallas que demuestren su funcionamiento.