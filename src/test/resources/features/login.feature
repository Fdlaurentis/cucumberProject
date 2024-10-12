#language:es
@login

Característica: Inicio de sesión
  El usuario realiza login

  Escenario: Inicio de sesión con credenciales correctas
    Dado que el usuario esta en la pagina de inicio de sesión "https://juice-shop.herokuapp.com/#/login"
    Cuando el usuario ingresa credenciales correctas "<email>" "<password>"
    Y da click en el botón log in
    Entonces El usuario iniciara sesión
    Ejemplos:
      | email                 | password |
      | pruebaosbe03@test.com | Pass1234 |

  Escenario: Inicio de sesión con credenciales incorrectas
    Dado que el usuario esta en la pagina de inicio de sesión "https://juice-shop.herokuapp.com/#/login"
    Cuando el usuario ingresa credenciales incorrectas "<email>" "<password>"
    Y da click en el botón log in
    Entonces El usuario visualiza alerta de email o password incorrectos
    Ejemplos:
      | email                 | password |
      | pruebaosbe03@test.com | Pass1235 |