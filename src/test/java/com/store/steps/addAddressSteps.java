package com.store.steps;

import com.store.utils.Base;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

public class addAddressSteps extends Base {

    @Entonces("el usuario dara clic en account")
    public void el_usuario_dara_clic_en_account() {
        addAddressFactory.setClicAccount();
    }

    @Entonces("da clic en el botón para agregar nueva dirección")
    public void da_clic_en_el_botón_para_agregar_nueva_dirección() {
        addAddressFactory.setClicNewAddress();
    }
    @Cuando("el usuario agrega la dirección {string} {string} {string} {string} {string} {string} {string}")
    public void el_usuario_agrega_la_dirección(String country, String name, String mobile, String zip, String address, String city, String state) {
        addAddressFactory.setAddressForm(country, name, mobile, zip, address, city, state);
    }
    @Cuando("da clic en el botón de submit")
    public void da_clic_en_el_botón_de_submit() {
        addAddressFactory.setClicSubmit();
    }
    @Entonces("el usuario debería ver la nueva dirección en la lista")
    public void el_usuario_debería_ver_la_nueva_dirección_en_la_lista() {
        System.out.print("Dirección guardada");
    }
    @Entonces("da clic en el botón para agregar nueva dirección nuevamente")
    public void da_clic_en_el_botón_para_agregar_nueva_dirección_nuevamente() {
        addAddressFactory.setClicNewAddress();
    }

    @Cuando("el usuario agrega una nueva dirección {string} {string} {string} {string} {string} {string} {string}")
    public void el_usuario_agrega_una_nueva_dirección(String country, String name, String mobile, String zip, String address, String city, String state) {
        addAddressFactory.setAddressForm(country, name, mobile, zip, address, city, state);
    }

    @Cuando("da clic en el botón de submit para nueva dirección")
    public void da_clic_en_el_botón_de_submit_para_nueva_dirección() {
        addAddressFactory.setClicSubmit();
    }
    @Entonces("el usuario debería ver la segunda nueva dirección en la lista")
    public void el_usuario_debería_ver_la_segunda_nueva_dirección_en_la_lista() {
        System.out.print("Dirección guardada");
    }

}
