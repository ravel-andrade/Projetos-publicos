/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author ravel
 */
public class GerenciadorDeArquivos {
    
    
    public void salvarObjeto(Biblioteca obj){
    try{
    FileOutputStream arquivoGrav = new FileOutputStream("gravObj.dat");

            ObjectOutputStream objGravar = new ObjectOutputStream(arquivoGrav);
            objGravar.writeObject(obj);
            objGravar.flush();
            objGravar.close();
            System.out.println("Objeto gravado com sucesso!");
        }catch(Exception e) {
            System.out.println(e);
        }
}
    
    public Biblioteca getObjecto(){
    
    try{
        
        //Carrega o arquivo

        FileInputStream arquivoLeitura = new FileInputStream("gravObj.dat");
        ObjectInputStream objLeitura = new ObjectInputStream(arquivoLeitura);
        
        Biblioteca placeholder = (Biblioteca)objLeitura.readObject();
        
        objLeitura.close();
        arquivoLeitura.close();
        return placeholder;
        
    }catch(Exception e) {
        System.out.println("Erro ao ler arquivo");
        return null;
        
    }
}
}
