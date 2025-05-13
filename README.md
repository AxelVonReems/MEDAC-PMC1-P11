# Adivinador

**Adivinador** es una aplicación sencilla desarrollada en Java utilizando Swing, que intenta adivinar qué ciclo formativo está cursando el usuario a partir de sus respuestas a una serie de preguntas.

## Características

* Interfaz gráfica creada con Java Swing
* Cuestionario de cinco preguntas con botones de opción y botones de navegación
* Uso de `CardLayout` para gestionar el cambio de paneles en la interfaz
* Muestra un resultado final según las respuestas seleccionadas
* Permite reiniciar el cuestionario o salir de la aplicación
* Muestra un logotipo en el panel de resultados

## Estructura del proyecto

```text
.
├── Main.java                # Punto de entrada de la aplicación
├── MainForm/
│   └── MainForm.java        # Lógica de la interfaz gráfica y eventos
│   └── MainForm.form        # Interfaz gráfica de la aplicación
└── logoSite.jpg             # Imagen del logotipo que se muestra al final
```

## Cómo ejecutar la aplicación

### Requisitos previos

* Java JDK 8 o superior
* Un entorno de desarrollo (por ejemplo, IntelliJ IDEA, Eclipse) o compilación desde terminal

### Instrucciones

1. Clona o descarga el repositorio.
2. Asegúrate de que los archivos `Main.java`, `MainForm.java`, `MainForm.form` y `logoSite.jpg` estén en las rutas adecuadas.
3. Compila y ejecuta el archivo `Main.java`:

## Notas adicionales

* El archivo `logoSite.jpg` debe estar disponible en el directorio raíz para que se muestre correctamente en la interfaz.
* Las preguntas y respuestas están diseñadas para adivinar entre ciclos como DAW, DAM, SMR, Marketing, Salud o Finanzas.