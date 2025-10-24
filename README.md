# HelloFormXML

## 🎉 Descripción
HelloFormXML es una aplicación sencilla de Android que permite capturar tu nombre y mostrar un saludo personalizado.  
Al ingresar tu nombre y pulsar el botón **“Saludar”**, la app muestra un mensaje de saludo en la pantalla.

---

## ✨ Funcionalidades
- Captura de texto mediante `EditText`.
- Botón **Saludar** que responde al evento `onClick`.
- Validación del campo:
  - Si está vacío → muestra `"Introduce tu nombre"`.
  - Si contiene texto → muestra `"Hola, <nombre>"`.
- Contador de caracteres dinámico (`0 / 20`) mientras escribes.
- Botón deshabilitado si no hay texto.
- Oculta el teclado al pulsar el botón.
- La interfaz se reinicia automáticamente al salir de la app o pasarla a segundo plano.

---

## 📝 Cómo probar la app
1. Abre la aplicación en un **emulador** o **dispositivo Android**.
2. Escribe tu nombre en el campo de texto.
3. Observa cómo se habilita el botón **Saludar**.
4. Pulsa el botón y verifica que aparece el mensaje de saludo.
5. Observa el contador de caracteres mientras escribes.
6. Sal de la app o cámbiala a segundo plano y vuelve: la UI se reiniciará.

---
