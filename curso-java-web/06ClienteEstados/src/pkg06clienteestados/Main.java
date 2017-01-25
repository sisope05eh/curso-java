/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg06clienteestados;

import java.io.IOException;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPConnection;
import javax.xml.soap.SOAPConnectionFactory;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPPart;

/**
 *
 * @author me.horta
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        try {
            SOAPConnectionFactory factory = SOAPConnectionFactory.newInstance();
            SOAPConnection conexion = factory.createConnection();
            String url="http://localhost:8080/05EstadosMexico/estados";
            SOAPMessage response = conexion.call(generarTodo(), url);
            imprimirTodo(response);
             //   generarMensaje();
                conexion.close();
           
// TODO code application logic here
        } catch (SOAPException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedOperationException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void imprimirRespuesta(SOAPMessage response) throws SOAPException{
        SOAPBody body = response.getSOAPBody();
        SOAPElement elemento = (SOAPElement) body.getChildElements(new QName("http://ws/","getCapitalResponse")).next();
        SOAPElement elemento2 =(SOAPElement) elemento.getChildElements(new QName("return")).next();
        String mensaje = elemento2.getTextContent();
        System.out.println("\n"+mensaje);
    }
    
    public static void imprimirTodo(SOAPMessage response) throws SOAPException{
        SOAPBody body = response.getSOAPBody();
        SOAPElement elemento = (SOAPElement) body.getChildElements(new QName("http://ws/","getEstadosResponse")).next();
       Iterator<SOAPElement> iterator = elemento.getChildElements(new QName("estado"));
       iterator.forEachRemaining(estadoSoap -> {
           System.out.println("--------");
       
           Iterator <SOAPElement>  iteratorInterno= estadoSoap.getChildElements();
           iteratorInterno.forEachRemaining(etiquetaInterna->{
               System.out.println(etiquetaInterna.getNodeName()+": "+etiquetaInterna.getTextContent());
           
           });
           
       });
       
       
    }
  public static SOAPMessage generarTodo() throws SOAPException, IOException{
        MessageFactory factory = MessageFactory.newInstance();
        SOAPMessage mensaje = factory.createMessage();
        SOAPPart soapPart = mensaje.getSOAPPart();
        String servicioUri = "http://ws/";
        SOAPEnvelope envelope = soapPart.getEnvelope();
        envelope.addNamespaceDeclaration("ws", servicioUri);
        SOAPBody body = envelope.getBody();
        SOAPElement elemento = body.addChildElement("getEstados", "ws");
        mensaje.saveChanges();
        mensaje.writeTo(System.out);
        return mensaje;
    }
  
    private static SOAPMessage generarMensaje() throws SOAPException, IOException {
        MessageFactory factory = MessageFactory.newInstance();
        SOAPMessage mensaje = factory.createMessage();
        SOAPPart soapPart = mensaje.getSOAPPart();
        String servicioUri = "http://ws/";
        SOAPEnvelope envelope = soapPart.getEnvelope();
        envelope.addNamespaceDeclaration("ws", servicioUri);
        SOAPBody body = envelope.getBody();
        SOAPElement elemento = body.addChildElement("getCapital","ws");
        SOAPElement elementoInterno = elemento.addChildElement("estado");
        elementoInterno.addTextNode("Jalisco");
        mensaje.saveChanges();
        
        mensaje.writeTo(System.out);
        return mensaje;
        
    }
    
}

