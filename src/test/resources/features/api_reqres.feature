@regression
Feature: Validaciones API en Reqres.in

  @smoke
  Scenario: Validar listado de usuarios
    Given el cliente consume el endpoint de listado de usuarios
    Then la respuesta debe ser exitosa y contener usuarios

  @smoke
  Scenario: Validar creación de usuario
    Given el cliente envía una solicitud para crear un usuario
    Then el usuario debe ser creado correctamente

  @smoke
  Scenario: Validar actualización de usuario
    Given el cliente envía una solicitud para actualizar un usuario
    Then los datos del usuario deben actualizarse correctamente