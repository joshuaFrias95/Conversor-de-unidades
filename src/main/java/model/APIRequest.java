package model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;

/**
 * Realizamos la petición de valores JSON a la API "exchange rate - api
 * 
 */
public class APIRequest {

    @SuppressWarnings("empty-statement")
    public double requestCurrency(String key, String originCoin, String destinyCoin) {
        {

            String request = String.format("https://v6.exchangerate-api.com/v6/%s/pair/%s/%s", key, originCoin, destinyCoin);

            try {

                URL URL_API = new URL(request);
                HttpURLConnection connection = (HttpURLConnection) URL_API.openConnection();
                connection.setRequestMethod("GET");

                // Obteniendo STATUS CODE desde la API
                int RESPONSE_CODE = connection.getResponseCode();

                // Obtener el valor requerido desde la api.
                return ResponseCodeAndGetRate(RESPONSE_CODE, connection);

            } catch (IOException e) {
                return -1;
            }
        }

    }

    

    /**
     * Este método nos permite leer los valores JSON traidos de la API 
     * siempre y cuando se haya realizado correctamente la conexión
     * 
     * @param httpCode - STATUS CODE que nos devuelve la petición HTTP
     * @param connection
     */
    private double ResponseCodeAndGetRate(int httpCode, HttpURLConnection connection) throws IOException {

        if (httpCode == HttpURLConnection.HTTP_OK) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));

            String line;
            StringBuilder response = new StringBuilder();

            while ((line = reader.readLine()) != null) {
                response.append(line);
            }

            reader.close();
            JSONObject JSON_RESPONSE = new JSONObject(response.toString());
            return JSON_RESPONSE.getDouble("conversion_rate");

        } else {
            System.out.println("No fue posible realizar la conexión");
            return -1;
        }
    }
}
