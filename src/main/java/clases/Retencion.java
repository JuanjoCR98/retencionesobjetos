/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Juanjo Cortés
 */
public class Retencion {
    private double salario,retencion,salarioneto;

    public Retencion(String salariostr) {
        this.salario = Double.parseDouble(salariostr);
        
        if(this.salario<=1000){
            this.retencion = 0;
        }else if(this.salario>1000&&this.salario<=3000){
            this.retencion = 10;
        }else if(this.salario>3000){
            this.retencion = 20;
        }
        
        this.salarioneto  = this.salario - ((this.salario*this.retencion)/100);
    }

    public double getSalario() {
        return salario;
    }

    public double getRetencion() {
        return retencion;
    }

    public double getSalarioneto() {
        return salarioneto;
    }
    
    
}
