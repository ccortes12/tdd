/*
 * Copyright 2019-2020 Diego Urrutia Astorga <durrutia@ucn.cl>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package cl.ucn.disc.pdbp.tdd.model;

import cl.ucn.disc.pdbp.utils.Validation;

/**
 * The Dueño class
 *
 * @author Carlos Cortes
 */
public final class Dueno {

    /**
     * The nombre
     */
    private final String nombre;

    /**
     * The direccion
     */
    private final String direccion;

    /**
     * The telefonoFijo
     */
    private final String telefonoFijo;

    /**
     * The telefonoMovil
     */
    private final String telefonoMovil;

    /**
     * The email
     */
    private final String email;

    /**
     * The rut
     */
    public final String rut;

    /**
     * Constructor de un dueño
     * -Nombre no puede ser vacio
     * -Nombre no debe tener un tamaño menor o igual a dos
     * -El rut debe ser valido
     * -El rut no puede ser null
     * -No se puede ingresar un rut ya existente TODO:Validar la existencia de un rut
     * -La direccion no puede ser vacia
     * -La direccion no debe tener un tamaño menor o igual a dos
     * -El teléfono fijo vació o de tamaño menor o igual que seis y comprobar que se indica con un error.
     * -El teléfono móvil vació o de tamaño menor o igual que seis y comprobar que se indica con un error.
     * -El mail debe ser valido
     * -El mail no puede ser vacio
     *
     * @param nombre
     * @param direccion
     * @param telefonoFijo
     * @param telefonoMovil
     * @param email
     * @param rut
     */
    public Dueno(String nombre, String direccion, String telefonoFijo, String telefonoMovil, String email, String rut) {

        if(nombre == null || rut == null || direccion == null || telefonoFijo == null || telefonoMovil == null || email == null){
            throw new NullPointerException("Nombre,rut, direccion, telefonoFijo, telefonoMovil and Email cannot be null");
        }

        //Size of nombre
        if (nombre.length() < 2) {
            throw new RuntimeException("Nombre must be greater than 2 characters");
        }
        this.nombre = nombre;

        //Size of apellido
        if (direccion.length() < 2) {
            throw new RuntimeException("Nombre must be greater than 2 characters");
        }
        this.direccion = direccion;

        //Size of telefonoFijo
        if (telefonoFijo.length() < 6) {
            throw new RuntimeException("Nombre must be greater than 2 characters");
        }
        this.telefonoFijo = telefonoFijo;

        //Size of telefonoMovil
        if (telefonoMovil.length() < 6) {
            throw new RuntimeException("Nombre must be greater than 2 characters");
        }
        this.telefonoMovil = telefonoMovil;

        // RUT valid.
        if (!Validation.isRutValid(rut)) {
            throw new RuntimeException("RUT should be valid");
        }
        this.rut = rut;

        // Email valid.
        if (!Validation.isEmailValid(email)) {
            throw new RuntimeException("Email should be valid");
        }
        this.email = rut;
    }

    /**
     *
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     *
     * @return the telefonoFijo
     */
    public String getTelefonoFijo() {
        return telefonoFijo;
    }

    /**
     *
     * @return the telefonoFijo
     */
    public String getTelefonoMovil() {
        return telefonoMovil;
    }

    /**
     *
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     *
     * @return the rut
     */
    public String getRut() {
        return rut;
    }
}
