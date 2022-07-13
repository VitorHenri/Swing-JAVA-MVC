/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package locadora.controller;

import java.sql.Connection;
import locadora.DB.DB;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Usuario
 */
public class ReportController {
   static Connection conn = DB.createConnection();
   static JasperDesign jdesign;
   static JasperReport jreport;
   static JasperPrint jprint;
   
    public static void relatorioFilmes(){
        try{
            jdesign =  JRXmlLoader.load("src\\reports\\RelatorioFilmes.jrxml");
            jreport = JasperCompileManager.compileReport(jdesign);
            jprint = JasperFillManager.fillReport(jreport, null,conn);
            JasperViewer.viewReport(jprint,false);
        
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public static void relatorioClientes(){
        try{
            jdesign =  JRXmlLoader.load("src\\reports\\RelatorioClientes.jrxml");
            jreport = JasperCompileManager.compileReport(jdesign);
            jprint = JasperFillManager.fillReport(jreport, null,conn);
            JasperViewer.viewReport(jprint,false);
        
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public static void relatorioAtor(){
        try{
            jdesign =  JRXmlLoader.load("src\\reports\\RelatorioAtor.jrxml");
            jreport = JasperCompileManager.compileReport(jdesign);
            jprint = JasperFillManager.fillReport(jreport, null,conn);
            JasperViewer.viewReport(jprint,false);
        
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
