package org.example;
import java.util.ArrayList;
import java.util.List;

/**
 * Esta es una clase llamada Persona que contiene nombres de contactos
 * y una lista de números asociados a dicho contacto.
 * @author Marta Sánchez Gea
 * @version 1.0
 * 29/02/2024
 */

class Persona {
    private String name;
    private List<String> phones;

    /**
     * Este constructor crea un nuevo objeto Persona y crea una lista de teléfonos,
     * agregando el número de teléfono también proporcionado.
     * @param name: indica el nombre del contacto al que se va a referir
     * @param phone: va a indicar la lista de números telefónicos
     */
    public Persona(String name, String phone) {
        this.setName(name);
        this.setPhones(new ArrayList<>());
        this.getPhones().add(phone);
    }

    /**
     * @return  Devuelve el valor del nombre de contacto.
     */

    public String getName() {
        return this.name;
    }

    /**
     * @return Devuelve el valor de la lista de teléfonos.
     */
    public List<String> getPhones() {
        return this.phones;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }
}
