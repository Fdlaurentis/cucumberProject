# language: es
@addAddress

Característica: Agregar una nueva dirección
  El usuario registra una dirección

  Escenario: Inicio de sesión y agregar direcciones
    Dado que el usuario esta en la pagina de inicio de sesión "https://juice-shop.herokuapp.com/#/login"
    Cuando el usuario ingresa credenciales correctas "<email>" "<password>"
    Y da click en el botón log in
    Entonces El usuario iniciara sesión
    Y el usuario dara clic en account
    Y da clic en el botón para agregar nueva dirección
    Cuando el usuario agrega la dirección "Ecuador" "Dirección de prueba" "5939999999" "031234" "Dirección de prueba Quito" "Quito" "Pichincha"
    Y da clic en el botón de submit
    Entonces el usuario debería ver la nueva dirección en la lista
    Y da clic en el botón para agregar nueva dirección nuevamente
    Cuando el usuario agrega una nueva dirección "Ecuador" "Dirección de prueba 2" "5939999999" "031234" "Dirección de prueba Quito 2" "Quito" "Pichincha"
    Y da clic en el botón de submit para nueva dirección
    Entonces el usuario debería ver la segunda nueva dirección en la lista

    Ejemplos:
      | email                 | password |
      | pruebaosbe03@test.com | Pass1234 |
