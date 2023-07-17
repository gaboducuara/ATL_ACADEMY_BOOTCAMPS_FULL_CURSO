package Trivia_ATL_Academy.TRIVIA;
import Trivia_ATL_Academy.TRIVIA.models.Categories;
import Trivia_ATL_Academy.TRIVIA.repository.CategoryRepository;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.*;

@RestController
public class TriviaController {

    @Autowired
    CategoryRepository categoryRepository;
    //@GetMapping("/question/{categories}")
    @GetMapping("/hola")
    public String prueba1() {
        return "Esta url usa un GET";
    }
    @DeleteMapping("/hola")
    public String prueba2() {
        return "Esta url usa un DELETE";
    }
    @PostMapping("/hola")
    public String prueba3() {
        return "Esta url usa un POST";
    }
    @GetMapping("/busqueda-{id}")
    public Categories buscarPorId(@PathVariable Long id) {
        return categoryRepository.findById(id);
    }
    @GetMapping("/question/{categoria}")
    public Categories getQuestion(@PathVariable String categoria) {

        List<Categories> resultado = new ArrayList<>();
        Categories ejemplo = categoryRepository.findById(1L);
        resultado.add(ejemplo);
        return ejemplo;
        //ObjectMapper convertidor = new ObjectMapper();
        //Pregunta preg = convertidor.convertValue(respuestaJson, Pregunta.class);
        //return preg;
    }

    @GetMapping("/categories")
    public Categories[] getCategories() {

        Categories cat = new Categories();
        cat.setName("Arte");
        cat.setDescription("Preguntas relacionadas con arte, literatura, música y otras expresiones culturales.");

        Categories cat2 = new Categories();
        cat2.setName("Deportes");
        cat2.setDescription("Preguntas relacionadas con diversos deportes y eventos deportivos.");

        Categories[] category = new Categories[2];
        category[0] = cat;
        category[1] = cat2;
        return category;

        /*return "[\n" +
                "  {\n" +
                "    \"category\": \"Prueba\",\n" +
                "    \"description\": \"Preguntas relacionadas con arte, literatura, música y otras expresiones culturales.\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"category\": \"Deportes\",\n" +
                "    \"description\": \"Preguntas relacionadas con diversos deportes y eventos deportivos.\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"category\": \"Arte\",\n" +
                "    \"description\": \"Preguntas relacionadas con pintura, escultura, arquitectura y otras formas de expresión artística.\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"category\": \"Cine\",\n" +
                "    \"description\": \"Preguntas relacionadas con películas, directores, actores y otros aspectos del cine.\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"category\": \"Historia\",\n" +
                "    \"description\": \"Preguntas relacionadas con eventos históricos, personajes y períodos importantes.\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"category\": \"Ciencia\",\n" +
                "    \"description\": \"Preguntas relacionadas con diferentes ramas de la ciencia, descubrimientos y avances científicos.\"\n" +
                "  }\n" +
                "]";*/
    }



}

