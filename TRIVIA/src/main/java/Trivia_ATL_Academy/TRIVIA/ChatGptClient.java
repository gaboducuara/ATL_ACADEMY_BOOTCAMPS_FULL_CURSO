package Trivia_ATL_Academy.TRIVIA;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class ChatGptClient {

    public String enviarPreguntas(String question) {
        String respuestaDeChatgpt = "";

            try {
                String response = sendChatGPTRequest(prompt);
                System.out.println("Respuesta de ChatGPT: " + response);
            } catch (IOException e) {
                System.out.println("Error al realizar la solicitud a ChatGPT: " + e.getMessage());
            }
        }

        private static String sendChatGPTRequest(String prompt) throws IOException {
            URL url = new URL("https://api.openai.com/v1/engines/davinci-codex/completions");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setRequestProperty("Authorization", "Bearer YOUR_API_KEY");

            String requestData = "{\"prompt\": \"" + prompt + "\", \"max_tokens\": 50}";
            connection.setDoOutput(true);
            OutputStream outputStream = connection.getOutputStream();
            outputStream.write(requestData.getBytes());
            outputStream.flush();

            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                StringBuilder response = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }
                reader.close();
                return response.toString();
            } else {
                throw new IOException("Solicitud fallida con código de respuesta: " + responseCode);
            }
        }
    }
}