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
 * The clase Control
 *
 * @author Carlos Cortes
 */
public final class Control {

    /**
     * The fechaControl
     */
    private final ZonedDateTime fechaControl;

    /**
     * The fechaProxControl
     */
    private final ZonedDateTime fechaProxControl;

    /**
     * The temperatura
     * min:20
     * max:50 //TODO:Validacion temperatura
     */
    private final float temperatura;

    /**
     * The peso (kg)
     * min:0
     * max: 200  //TODO: Validacion del peso
     */
    private final float peso;

    /**
     * The altura
     * Min: 0
     * Max: 200 // TODO: Verificar la altura maxima de un paciente.
     */
    private final float altura;

    /**
     * The diagnostico
     */
    private final String diagnostico;

    /**
     * The veterinario
     */
    private final Persona veterinario;

    /**
     * The constructor Control
     * @param fechaControl Debe ser la del dia de hoy
     * @param fechaProxControl  Solo si aplica
     * @param temperatura en grados celsius
     * @param peso en kilogramos
     * @param altura en centimetros
     * @param diagnostico
     * @param veterinario
     */
    public Control(ZonedDateTime fechaControl, ZonedDateTime fechaProxControl, float temperatura, float peso, float altura, String diagnostico, Persona veterinario) {
        this.fechaControl = fechaControl;
        this.fechaProxControl = fechaProxControl;
        this.temperatura = temperatura;
        this.peso = peso;
        this.altura = altura;
        this.diagnostico = diagnostico;
        this.veterinario = veterinario;
    }

    /**
     *
     * @return the fechaControl
     */
    public ZonedDateTime getFechaControl() {
        return fechaControl;
    }

    /**
     *
     * @return the fechaProxControl
     */
    public ZonedDateTime getFechaProxControl() {
        return fechaProxControl;
    }

    /**
     *
     * @return the temperatura
     */
    public float getTemperatura() {
        return temperatura;
    }

    /**
     *
     * @return the peso
     */
    public float getPeso() {
        return peso;
    }

    /**
     *
     * @return the altura
     */
    public float getAltura() {
        return altura;
    }

    /**
     *
     * @return the diagnostico
     */
    public String getDiagnostico() {
        return diagnostico;
    }

    /**
     *
     * @return the veterinario
     */
    public Persona getVeterinario() {
        return veterinario;
    }
}
