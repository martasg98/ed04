package org.example;
import java.util.*;

/**
 * Esta es una clase llamada Agenda que contiene una lista de contactos
 * y tiene la posibilidad de añadir nuevos contactos, eliminar y modificar el número de teléfono de un contacto concreto.
 * @author Marta Sánchez Gea
 * @version 1.0
 * 29/02/2024
 */

public class Agenda implements IAgenda {
    private List<Persona> contacts; // Lista de Persona

    public Agenda() {
        this.contacts = new ArrayList<>();
    }

    /**
     * Este método busca un contacto en una lista por nombre. Si encuentra un contacto con el mismo nombre, agrega un nuevo número de teléfono a ese contacto.
     * Si no encuentra un contacto con el mismo nombre, crea un nuevo contacto con el nombre y el número de teléfono y lo agrega a la lista.
     * @param name
     * @param phone
     */
    @Override
    public void addContact(String name, String phone) {
        boolean exists = false;
        for (Persona c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                exists = true;
                c.getPhones().add(phone);
                break;
            }
        }

        if (!exists) {
            Persona newContact = new Persona(name, phone);
            contacts.add(newContact);
        }
    }

    /**
     *Este método tiene como objetivo eliminar un contacto de la lista según el nombre dado.
     * @param name
     */
    @Override
    public void removeContact(String name) {
        Iterator<Persona> it = contacts.iterator();

        while (it.hasNext()) {
            Persona c = it.next();

            if (c.getName().equalsIgnoreCase(name)) {
                it.remove();
            }
        }
    }

    /**
     *Este método tiene como objetivo modificar el número de teléfono de un contacto. Busca un contacto con el nombre proporcionado y, si lo encuentra,
     * busca el índice del antiguo número de teléfono en la lista de teléfonos de ese contacto. Si encuentra el índice, reemplaza el antiguo número de teléfono con el nuevo.
     * @param name
     * @param oldPhone
     * @param newPhone
     */
    @Override
    public void modifyPhoneNumber(String name, String oldPhone, String newPhone) {
        for (Persona c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                List<String> phones = c.getPhones();

                int index = phones.indexOf(oldPhone);

                if (index != -1) {
                    phones.set(index, newPhone);
                }
            }
        }
    }

    /**
     *Este método devuelve la lista de contactos
     * @return lista de contactos
     */

    @Override
    public List<Persona> getContacts() {
        return this.contacts;
    }
}