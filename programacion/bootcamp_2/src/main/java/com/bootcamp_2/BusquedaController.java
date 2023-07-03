package com.bootcamp_2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BusquedaController {
    @GetMapping("/busqueda_usuario/{busqueda}")
    public String[] obtenerPalabrasAutocompletar(@PathVariable String busqueda) {

        String[] frasesTipicasDeBusqueda = {"bootcamps de C++", "bootcamps de java", "bootcamps de python", "bootcamps avanzado de java", "bootcamps de javaScript"};

        String[] resultadoDeLaBusqueda = new String[4];
        int contador = 0;

        for (String frase : frasesTipicasDeBusqueda) {
            if (frase.contains(busqueda)) {
                resultadoDeLaBusqueda[contador] = frase;
                contador++;
            }
        }
        return resultadoDeLaBusqueda;
    }
}
