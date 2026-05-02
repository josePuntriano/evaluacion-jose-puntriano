# Evaluación José Puntriano — QA Automation

Proyecto de automatización de pruebas desarrollado con
Serenity BDD, Screenplay, Cucumber y Java.

## Tecnologías utilizadas

- Java 11
- Maven 3.9.3
- Serenity BDD 4.1.20
- Cucumber 7.15.0
- Screenplay Pattern
- Rest Assured

## Casos de prueba

### Web — selenium.dev
- CP01: Validar carga correcta de la página de inicio
- CP02: Verificar navegación a Documentation
- CP03: Validar flujo de búsqueda

### API — reqres.in
- CP04: Validar listado de usuarios
- CP05: Validar creación de usuario
- CP06: Validar actualización de usuario

## Requisitos previos

1. Java 11 instalado
2. Maven 3.9.3 instalado
3. Google Chrome instalado
4. API Key de reqres.in — regístrate gratis en
   https://reqres.in/signup

## Configuración

1. Clona el repositorio:
```bash
git clone https://github.com/josePuntriano/evaluacion-jose-puntriano.git
```

2. Reemplaza tu API key en `ApiReqresSteps.java`:
```java
.header("x-api-key", "TU_API_KEY_AQUI")
```

## Ejecución

```bash
mvn clean verify
```

## Reporte

Al finalizar la ejecución abre:
```
target/site/serenity/index.html
```