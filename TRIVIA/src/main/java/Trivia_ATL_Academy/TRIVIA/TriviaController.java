package Trivia_ATL_Academy.TRIVIA;
import Trivia_ATL_Academy.TRIVIA.models.Categories;
import Trivia_ATL_Academy.TRIVIA.models.Questions;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TriviaController {
    //SE pone metodo que nos ayuda a abrir o sirve como
    // indicativo se apertura a la URL a la cual se va a abrrir en local
/*
    @GetMapping("/question")
    public String getQuestion() {
    }
 */
    @GetMapping("/question/{categories}")

    public String getQuestion(@PathVariable String categories) {

        ChatGptClient chatGpt = new ChatGptClient();
        String questionJson = chatGpt.enviarPreguntas("hola que tal");
        return questionJson;
        //Conviertes un objeto de java a json
        //ObjectMapper convertidor = new ObjectMapper();
        //Questions question = convertidor.convertValue( questionJson , Questions.class);
        //return question;
    };
    @GetMapping("/categories")
    public Categories[] getCategories() {

        Categories cat = new Categories();
        cat.setCategory("Arte");
        cat.setDescription("Preguntas relacionadas con arte, literatura, música y otras expresiones culturales.");
        //return
        Categories cat2 = new Categories();
        cat2.setCategory("Deportes");
        cat2.setDescription("Preguntas relacionadas con diversos deportes y eventos deportivos.");

        Categories[] categories = new Categories[2];
        categories[0] = cat;
        categories[1] = cat2;
        return categories;
    };
}

