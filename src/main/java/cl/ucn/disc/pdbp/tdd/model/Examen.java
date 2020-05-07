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

import java.time.ZonedDateTime;

/**
 * The Examen class
 *
 * @author Carlos Cortes
 */
public class Examen {

    /**
     * The nombre
     */
    private final String nombre;

    /**
     * The fecha
     */
    private final ZonedDateTime fecha;

    /**
     * The Examen constructor
     * @param nombre del examen Ej: Radiologia
     * @param fecha en que fue tomado el examen  DD/MM/AA
     */
    public Examen(String nombre, ZonedDateTime fecha) {
        this.nombre = nombre;
        this.fecha = fecha;
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
     * @return the examen
     */
    public ZonedDateTime getFecha() {
        return fecha;
    }
}
