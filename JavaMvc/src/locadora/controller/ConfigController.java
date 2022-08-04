/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package locadora.controller;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;
import javax.imageio.stream.FileImageInputStream;

/**
 *
 * @author Usuario
 */
public class ConfigController {
    public boolean salvarConfig(Integer diasLocacao,Boolean isDataRetroativa,String corAtrasado,String corAlugado){
        try{
            FileInputStream file = new FileInputStream("src\\locadora\\util\\configs.properties");
            FileOutputStream out = new FileOutputStream("src\\locadora\\util\\configs.properties");
            Properties props = new Properties();
            props.load(file);
            String dataRetroativa = "N";
            if(isDataRetroativa==true)
                dataRetroativa="Y";
            else
                dataRetroativa="N";
            props.setProperty("prop.diaslocacao",diasLocacao.toString());
            props.setProperty("prop.isdataretroativa", dataRetroativa);
            props.setProperty("prop.coratrasado", corAtrasado);
            props.setProperty("prop.coralugado", corAlugado);
            props.store(out, corAlugado);
            file.close();
            out.close();
            return true;
        }catch(Exception e){
            e.printStackTrace();
        }
        return false;
    }
}
