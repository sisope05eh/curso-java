/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10archivos;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author ac.barrios
 */
public class Error implements IEscribible{
    private long timeStamp;
    private int codigoError;
    private String descripcionError;

    @Override
    public void escribir(String url){
      try {
            FileOutputStream f = new FileOutputStream(url,true);
            OutputStreamWriter oS= new OutputStreamWriter(f,"UTF-8");
            BufferedWriter bW = new BufferedWriter(oS);
            String lineaError = timeStamp + " | " + codigoError + " | " + descripcionError + "\n"; 
            bW.write(lineaError);
            bW.close();
            
          
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Error.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(Error.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Error.class.getName()).log(Level.SEVERE, null, ex);
        }       
     
    }
   /* public void escribir(String url){
        FileWriter escribeArchivo;
        try {
            escribeArchivo = new FileWriter(url,true);
            String lineaError = timeStamp + " | " + codigoError + " | " + descripcionError + "\n";
            escribeArchivo.append(lineaError);
            escribeArchivo.close();
        } catch (IOException ex) {
            Logger.getLogger(Error.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("El archivo no existe");
        }
    }*/
    @Override
    public IEscribible leer(String url,long timeStam){
        try {
            FileReader fR = new FileReader(url);
            BufferedReader bR = new BufferedReader(fR);
            String linea;
            while((linea= bR.readLine())!=null){
                String[] sl = linea.split("-");
                System.out.println(sl[0]);
                if(sl[0].trim().equals(Long.toString(timeStam))){
                    this.timeStamp = timeStam;
                    this.codigoError = Integer.parseInt(sl[1]);
                    this.descripcionError = sl[2];
                    return this;
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Error.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Error.class.getName()).log(Level.SEVERE, null, ex);
        }
       return null;
    }
    @Override
    public String toString(){
        return timeStamp + " | " + codigoError + " | " + descripcionError + "\n";
    }
  //  @Override
   // public void leer(String url){
       
   // }
    public long getTimestamp() {
        return timeStamp;
    }

    public int getCodigoError() {
        return codigoError;
    }

    public String getDescripcionError() {
        return descripcionError;
    }

    public void setTimestamp(long timestamp) {
        this.timeStamp = timestamp;
    }

    public void setCodigoError(int codigoError) {
        this.codigoError = codigoError;
    }

    public void setDescripcionError(String descripcionError) {
        this.descripcionError = descripcionError;
    }

    public Error(int codigoError, String descripcionError) {
       this.timeStamp = new Date().getTime();
       this.codigoError = codigoError;
       this.descripcionError = descripcionError;
    }
      public Error() {
       this.timeStamp = new Date().getTime();
       this.codigoError = codigoError;
       this.descripcionError = descripcionError;
    }  
}
