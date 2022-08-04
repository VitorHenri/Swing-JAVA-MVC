/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package locadora.controller;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

/**
 *
 * @author Usuario
 */
public class SMSSendController {
    // Find your Account SID and Auth Token at twilio.com/console
    // and set the environment variables. See http://twil.io/secure
    public static final String ACCOUNT_SID = "AC0ae1bad4d053b780c562ee8d2146f9d8";
    public static final String AUTH_TOKEN = "5b96f6117539129df8c93be26b50665f";
    
    public static void SendEmail(String cliente, String dataVencimento,String item){
        try{
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Message message = Message.creator(
                new PhoneNumber("+5519994931847"),
                new PhoneNumber("+19804144923"),
                "Olá sr(a) "+cliente+" estamos entrando em contato para solicitar a devolução do item: "+item+"\n Com devolução vencida em: "+dataVencimento)
            .create();
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
}
