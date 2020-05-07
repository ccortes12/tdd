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
 * The Ficha veterinaria
 *
 * @author Carlos Cortes
 */
public final class Ficha {

    /**
     * The numero of ficha
     */
    private static Integer numeroFicha = 1000;

    /**
     * The nombre
     */
    private final String nombrePaciente;

    /**
     * The especie
     */
    private final String especie;

    /**
     * The fecha de nacimiento
     */
    private final ZonedDateTime fechaNaciemiento;

    /**
     * Raza
     */
    private final String raza;

    /**
     * Color
     */
    private final String color;

    /**
     * Tipo: externo/interno
     * Tipo is an enum
     */
    private final Tipo tipo;

    /**
     * Sexo: macho, hembra
     * Sexo is an enum
     */
    private final Sexo sexo;

    /**
     * The constructor of Ficha
     * @param nombrePaciente
     * @param especie
     * @param fechaNacimiento
     * @param raza
     * @param color
     * @param tipo
     * @param sexo
     */
    public Ficha(String nombrePaciente, String especie, ZonedDateTime fechaNacimiento, String raza, String color, Tipo tipo, Sexo sexo) {
        this.numeroFicha += 1;  //Generado automaticamente

        this.nombrePaciente = nombrePaciente;
        this.especie = especie;
        this.fechaNaciemiento = fechaNacimiento;
        this.raza = raza;
        this.color = color;
        this.tipo = tipo;
        this.sexo = sexo;
    }

    /**
     *
     * @return the numeroFicha
     */
    public Integer getNumeroFicha() {
        return numeroFicha;
    }

    /**
     *
     * @return the nombrePaciente
     */
    public String getNombrePaciente() {
        return nombrePaciente;
    }

    /**
     *
     * @return the especie
     */
    public String getEspecie() {
        return especie;
    }

    /**
     *
     * @return the fechaNacimiento
     */
    public ZonedDateTime getFechaNaciemiento() {
        return fechaNaciemiento;
    }

    /**
     *
     * @return the raza
     */
    public String getRaza() {
        return raza;
    }

    /**
     *
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     *
     * @return the tipo
     */
    public Tipo getTipo() {
        return tipo;
    }

    /**
     *
     * @return the sexo
     */
    public Sexo getSexo() {
        return sexo;
    }
}

