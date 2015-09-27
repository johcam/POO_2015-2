/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empleado;

/**
 *
 * @author X45C
 */
public class Empleado {
    String nombre;
    String cargo;
    double salario;
    
    public Empleado (String nombre, String cargo, double salario){
       this.nombre=nombre;
       this.cargo=cargo;
       this.salario=salario;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public void setCargo(String cargo){
        this.cargo=cargo;
    }
    
    public void setSalario(double salario){
        this.salario=salario;
    }
}
