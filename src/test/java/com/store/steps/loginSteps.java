package com.store.steps;

import com.store.utils.Base;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

public class loginSteps extends Base {

    @Dado("que el usuario esta en la pagina de inicio de sesión {string}")
    public void que_el_usuario_esta_en_la_pagina_de_inicio_de_sesión(String url) {
        driver.get(url);
    }
    @Cuando("el usuario ingresa credenciales correctas {string} {string}")
    public void el_usuario_ingresa_credenciales_correctas(String email, String password) {
        loginFactory.loginForm(email, password);
    }
    @Cuando("da click en el botón log in")
    public void da_click_en_el_botón_log_in() {
        loginFactory.clickLogin();
    }
    @Entonces("El usuario iniciara sesión")
    public void el_usuario_iniciara_sesión() {
        loginFactory.clickLoginSuccess();
    }

    @Cuando("el usuario ingresa credenciales incorrectas {string} {string}")
    public void el_usuario_ingresa_credenciales_incorrectas(String email, String password) {
        loginFactory.loginForm(email, password);
    }

    @Entonces("El usuario visualiza alerta de email o password incorrectos")
    public void el_usuario_visualiza_alerta_de_email_o_password_incorrectos() {
        loginFactory.setLoginError();
    }

}
