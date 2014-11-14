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
public class AlimentoFicha {
    private double temperatura;
    private double pesoReal;
    private double sobrasSujas;
    private double pesoRealSobrasSujas;
    private double porcoesReal;
    private double porcoesSobrasSujas;
    private Cuba recipiente;
    private Alimento alimento;
    
    public AlimentoFicha(){}
    
    public void setTemperatura(double temperatura){
        this.temperatura = temperatura;
    }
    public double getTemperatura(){
        return this.temperatura;
    }
    
    public void setPesoReal(double pesoReal){
        this.pesoReal = pesoReal;
    }
    public double getPesoReal(){
        return this.pesoReal;
    }
    
    public void setSobrasSujas(double sobrasSujas){
        this.sobrasSujas = sobrasSujas;
    }
    public double getSobrasSujas(){
        return this.sobrasSujas;
    }
    
    public void setPesoRealSobrasSujas(double pesoRealSobrasSujas){
        this.pesoRealSobrasSujas = pesoRealSobrasSujas;
    }
    public double getPesoRealSobrasSujas(){
        return this.pesoRealSobrasSujas;
    }
    
    public void setPorcoesReal(double porcoesReal){
        this.porcoesReal = porcoesReal;
    }
    public double getPorcoesReal(){
        return this.porcoesReal;
    }
    
    public void setPorcoesSobrasSujas(double porcoesSobrasSujas){
        this.porcoesSobrasSujas = porcoesSobrasSujas;
    }
    public double getPOrcoesSobrasSujas(){
        return this.porcoesSobrasSujas;
    }
    
    public void setRecipiente(Cuba recipiente){
        this.recipiente = recipiente;
    }
    public Cuba getRecipiente(){
        return this.recipiente;
    }
    
    public void setAlimento(Alimento alimento){
        this.alimento = alimento;
    }
    public Alimento getAlimento(){
        return this.alimento;
    }
}