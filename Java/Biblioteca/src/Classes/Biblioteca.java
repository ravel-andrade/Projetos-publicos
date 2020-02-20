
package Classes;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.*;


    

public class Biblioteca extends GerenciadorDeArquivos implements Serializable {
    
    
    ArrayList<Livros> acervo;
    
    
    
    public Biblioteca (){
    if(this.getObjecto()!=null){
        System.out.println("aaaaaa");
        this.acervo = this.getObjecto().acervo;
    
    }else{
    acervo = new ArrayList<Livros>();
    Livros a1 = new Livros("Pedro",1,"a",200);
    Livros a2 = new Livros("Pedro",2,"a",200);
    Livros a3 = new Livros("Pedro",3,"a",200);
    acervo.add(a1);
    acervo.add(a2);
    acervo.add(a3);
    this.salvarObjeto(this);
    }
    }
    
    public String DoarLivro(String nome, String autor, Integer ano){
        Integer numeroLivro = acervo.size();
        Livros doacao = new Livros (autor, numeroLivro, nome, ano);
        acervo.add(doacao);
        
        return "Livro doado com sucesso";
    }
    
    public String DevolverLivro(Integer numeroLivro){
        if((acervo.size() >= numeroLivro) && (acervo.size() >= 1)){
        if(acervo.get(numeroLivro-1).status == "Indisponível"){
        acervo.get(numeroLivro-1).status = "Disponível";
        acervo.get(numeroLivro-1).emprestadoPara = "";
        return "Livro devolvido com sucesso";
        }else{
            
            return "Livro já foi devolvido";
        }
        }else{
        return "Valor inválido";
        }
    }
    
    public String RetirarLivro (Integer numeroLivro, String nome){
        
        if((acervo.size() >= numeroLivro) && (acervo.size() >= 1)){
          System.out.println("Acervo: "+acervo.size());
          System.out.println("Numero livro: "+numeroLivro);
          
        if(acervo.get(numeroLivro-1).status == "Disponível"){
            
        acervo.get(numeroLivro-1).status = "Indisponível";
        acervo.get(numeroLivro-1).emprestadoPara = nome;
        return "Livro retirado com sucesso";
        }else{
           
            return "Livro indisponivel";
            }
        }else{
        return "Valor invalido";
        }
        }
    
    public String ChecarDisponibilidade (Integer numeroLivro){
        if((acervo.size() >= numeroLivro) && (acervo.size() >= 1)){
        return acervo.get(numeroLivro-1).status;
        }else{
        return "Valor inválido";
        }
    }
    
    public String getNomeLivro (Integer numeroLivro){
        if((acervo.size() >= numeroLivro) && (acervo.size() >= 1)){
        return acervo.get(numeroLivro-1).titulo;
        }
        else{
        return "";
        }
    }
}
