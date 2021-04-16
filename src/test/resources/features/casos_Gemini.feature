# se puede utilizar los terminos en espñol indicando al principio # language: es
  # Feature = Caracteristica, Scenario = Escenario, Given = Dado, When = Cuando, Then = Entonces

Feature: Hacer el ingreso al Gemini correctamente
  Debe realizar el ingreso a la plataforma correctamente con el fin de subir los tiempos.

  Scenario: Ingreso al Gemini
    Given El usuario entra a la URL Gemini
    When El usuario debe ingresar a la plataforma Gemini

  Scenario: Ingreso al DashBoard
    Given El usuario entra a la URL Gemini
    When El usuario debe ingresar a la plataforma Gemini
    Then El usuario debe poder ingrear al DashBoard y ejecutar distintas acciones