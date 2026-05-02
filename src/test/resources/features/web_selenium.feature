@regression
Feature: Validaciones Web en Selenium.dev

  @smoke
  Scenario: Validar que la página de inicio carga correctamente
    Given el usuario abre la página de inicio de Selenium
    Then el título de la página debe ser el esperado

  @smoke
  Scenario: Verificar navegación al apartado de Documentation
    Given el usuario abre la página de inicio de Selenium
    When el usuario navega a la sección de Documentation
    Then la página de Documentation debe cargarse correctamente

  @smoke
  Scenario: Validar el flujo de búsqueda
    Given el usuario abre la página de inicio de Selenium
    When el usuario realiza una búsqueda con el término "WebDriver"
    Then los resultados deben contener información relacionada a "WebDriver"