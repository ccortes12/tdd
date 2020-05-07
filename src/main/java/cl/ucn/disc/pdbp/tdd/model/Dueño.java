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
/**
 * The Dueño class
 *
 * @author Carlos Cortes
 */
public final class Dueño {

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
     * TODO:Validar telefono fijo
     */
    private final String telefonoFijo;

    /**
     * The telefonoMovil
     * TODO:Validar telefono movil
     */
    private final String telefonoMovil;

    /**
     * The email
     * TODO:Validacion de mail valido
     */
    private final String email;

    /**
     * The rut
     * TODO: Validacion de rut
     */
    public final String rut;

    /**
     * Constructor de un dueño
     * -El mail debe ser valido
     * -El mail no puede ser null
     * -TODO:Validacion del los telefonos
     * -El rut debe ser valido
     * -El rut no puede ser null
     *
     * @param nombre
     * @param direccion
     * @param telefonoFijo
     * @param telefonoMovil
     * @param email
     * @param rut
     */
    public Dueño(String nombre, String direccion, String telefonoFijo, String telefonoMovil, String email, String rut) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefonoFijo = telefonoFijo;
        this.telefonoMovil = telefonoMovil;
        this.email = email;
        this.rut = rut;
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
