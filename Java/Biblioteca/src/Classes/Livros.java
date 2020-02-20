/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.io.Serializable;

/**
 *
 * @author ravel
 */
public class Livros implements Serializable {
    String nomeAutor;
    Integer numero;
    String titulo;
    Integer ano;
    String status;
    String emprestadoPara;
    
    
    Livros (String nomeAutor,
    Integer numero,
    String titulo,
    Integer ano){
        this.numero = numero;
        this.nomeAutor = nomeAutor;
        this.titulo = titulo;
        this.ano = ano;
        this.emprestadoPara = "";
        this.status = "Disponível";
    }
            
}
