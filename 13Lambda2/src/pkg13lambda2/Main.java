/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg13lambda2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import operador.Operador;

/**
 *
 * @author me.horta
 */
public class Main {
 public static List<Operador> lista = Arrays.asList(new Operador("Eduardo",999731,true),
                new Operador("Samuel",999286,true),
                new Operador("Jose",22395,true)); 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long tiempo = System.currentTimeMillis();
        filtroAntiguo();
        long tiempofinal = System.currentTimeMillis();
        System.err.println(tiempofinal-tiempo);
       
    }
    
  public static void filtroNuevo(){
      List<Operador> operadores = lista.stream().filter(op->op.isStatus()).collect(Collectors.toList());
  }
  public static void filtroAntiguo(){
      List<Operador> operadores=new ArrayList<Operador>();
      for(Operador op: lista){
          if(op.isStatus()){
              operadores.add(op);
          }
      }
      imprimirNuevo(operadores);
  }
  public static void imprimir(List<Operador>operadores){
      System.out.println("----Lista filtrada----");
      for(Operador op:lista){
          System.out.println("Nombre: "+op.getNombre()+" Clave: "+op.getClave()+ " Status: "+op.isStatus());
      }
  }
  
  public static void imprimirNuevo(List<Operador> operadores){
        operadores.forEach(op->System.out.println(op));
  }
    
}
