/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desperdiciozero.modelo;

/**
 *
 * @author Gabriel Jorge
 */
public class Alimento {
    private String nome;
    private double percapta;
    
    public Alimento(){}
    
    public Alimento(String nome, double percapta){
        this.nome = nome;
        this.percapta = percapta;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    
    public void setPercapta(double percapta){
        this.percapta = percapta;
    }
    public double getPercapta(){
        return this.percapta;
    }
}
