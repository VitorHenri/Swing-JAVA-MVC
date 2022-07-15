/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package locadora.controller;

import com.google.gson.Gson;
import locadora.model.CEP;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.time.Duration;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class CepController {
    public static CEP recebeCEP(String cep){
        if(cep!=null && cep.length()>0){
            try{
                HttpRequest request = HttpRequest.newBuilder().GET().uri(URI.create("https://viacep.com.br/ws/"+cep+"/json/")).timeout(Duration.ofSeconds(3)).build();
                HttpClient client  = HttpClient.newBuilder().build();
                HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
                if(response.body()!=null){
                    Gson gson = new Gson();
                    CEP cepRetorno = gson.fromJson(response.body(), CEP.class);
                    return cepRetorno;
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Não foi possível consultar o CEP no momento, por favor, digite manualmente o endereço");
            }
        }
        return null;
    }
}
