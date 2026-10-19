# [LAB-8]: Hola Mundo – Primer proyecto

## Prerequisitos

1. Git. [Link de Descarga](https://git-scm.com/install/). Desgarcar el instalador según su sistema operativo y seguir las instrucciones de instalación por defecto (Siguiente, siguiente, etc.).
2. Visual Studio Code. [Link de Descarga](https://code.visualstudio.com/download). Descargar el instalador según su sistema operativo y seguir las instrucciones de instalación por defecto (Siguiente, siguiente, etc.).
3. Java. Usar la versión que ya tienen instalada en sus equipos, no es necesario volver a instalarla.
4. Cuenta de GitHub. [Link de Registro](https://github.com/signup). Crear una cuenta con su correo electrónico y una contraseña segura. Puede usar su cuenta personal o la de la universidad. 

## Instrucciones generales

Estas instrucciones aplican para todos los ejercicios en este curso, se recomienda aprender estos pasos.

## 1. Clonar el repositorio

Copie la URL de **su** repositorio (botón verde **Code** en GitHub) y ejecute:

```bash
git clone <URL-DE-SU-REPOSITORIO>
```

Luego abra el repositorio desde VSCode (o su editor de preferencia).

## 2. Crear una rama nueva

**No trabaje sobre `main`.** Cree una rama para su ejercicio. 

```bash
git checkout -b LAB-8-juan-perez
```

## 3. Hacer cambios, probarlos y guardarlos (commit)

1. Edite `Calculadora.java`.
2. Ejecute las pruebas **en su computador** antes de subir los cambios.
3. Revise qué cambió:
   ```bash
   git status
   ```
4. Agregue y guarde los cambios con un mensaje claro. El mensaje debe estar en infinitivo y responder a la pregunta: "¿Qué hizo?"

   ```bash
   git add src/main/java/co/umariana/Calculadora.java
   git commit -m "Agregar solución de ejercicios 1, 2 y 3"
   ```

5. Puede hacer varios commits pequeños a medida que resuelve cada ejercicio, o puede hacer unn solo commit con la solución de todos los ejercicios, eso depende de usted.

## 4. Subir la rama (push)

```bash
git push origin LAB-8-juan-perez
```


## 5. Abrir el Pull Request (PR)

Una vez subida la rama, abra un Pull Request hacia `main`.
**El paso a paso de cómo abrirlo se explica en clase.**

El PR debe cumplir este formato (una acción automática lo verifica y marca ❌ si falta algo):

- **Título:** empieza con `LAB-N`, donde N es el número de la práctica. Ejemplo: `LAB-1: calculadora`.
- **Descripción:** incluye una línea `Nombre: Su Nombre Completo`.

Si el formato falla, edite el título o la descripción del PR (botón **Edit**) y la validación se ejecuta de nuevo sola.

Cuando el PR esté abierto, para ejecutar las pruebas en GitHub:

1. En la columna derecha del PR, abra **Labels** y agregue **`Running Tests`**.
2. Espere a que termine (1–2 minutos). Aparecerá una etiqueta con el resultado:
   - 🟢 **`Test Passing`**: todas las pruebas pasan.
   - 🔴 **`Broken Test suite`**: alguna prueba falla o el proyecto no compila. Abra la pestaña **Checks → Pruebas** para ver el error.
3. Si falló, tiene la opción de corregir y subir nuevos cambios en otro commit.

> Las pruebas solo se ejecutan cuando usted agrega la etiqueta `Running Tests`.

---

## Evaluación

Nota de 0.0 a 5.0. Este ejercicio evalúa tanto el código como **el flujo de trabajo con Git y GitHub**.

| # | Criterio | Peso |
|---|---|---|
| 1 | Pruebas aprobadas | 40% |
| 2 | Rama | 10% |
| 3 | Commits | 20% |
| 4 | Pull Request | 20% |
| 5 | Puntualidad | 10% |

### 1. Pruebas aprobadas (40%)

Se calcula con el resultado de las pruebas en GitHub Actions:

```
nota = (pruebas aprobadas / total de pruebas) × 5.0
```

Ejemplo: 8 de 11 pruebas aprobadas → 3.6. El puntaje aparece en el resumen de la ejecución del workflow.

### 2. Rama (10%)

| Nota | Descripción |
|---|---|
| 5.0 | Rama con nombre `LAB-N-nombre-apellido` en minúscula y con guiones (ej.: `LAB-8-juan-perez`). |
| 4.0 | Trabajó en una rama propia, pero el nombre no sigue la convención. |
| 0.0 | Trabajó directamente sobre `main`. |

### 3. Commits (20%)

Se evalúa la calidad de los mensajes, no la cantidad de commits.

| Nota | Descripción |
|---|---|
| 5.0 | Mensajes claros y acordes al cambio realizado. |
| 4.0 | Hay commits, pero los mensajes son vagos ("cambios", "listo") o no siguen el formato. |
| 0.0 | Sin commits propios. |

### 4. Pull Request (20%)

| Nota | Descripción |
|---|---|
| 5.0 | PR hacia `main`, con título claro, incluye id del taller, sin conflictos, y ejecutó las pruebas con la etiqueta `Running Tests`. |
| 4.0 | PR correcto, pero sin título descriptivo o sin haber usado la etiqueta. |
| 3.5| PR con conflictos o dirigido a una rama equivocada. |
| 0.0 | No abrió el PR. |

### 5. Puntualidad (10%)

Se mide con la fecha y hora de **creación del Pull Request**, comparada con la fecha límite indicada en clase.

| Nota | Descripción |
|---|---|
| 5.0 | PR abierto antes de la fecha y hora límite. |
| 4.0 | PR abierto hasta 24 horas después de la fecha límite. |
| 3.5 | PR abierto entre 24 y 72 horas después de la fecha límite. |
| 0.0 | PR abierto con más de 72 horas de retraso, o sin entrega. |


