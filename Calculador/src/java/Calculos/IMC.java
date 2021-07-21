/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculos;

/**
 *
 * @author Mario
 */
public class IMC {
    double PesoJava;
    double EstaturaJava;
    double Resultado;
    
    public double ResultadoJava(double peso, double estatura)
    {
        Resultado = peso/estatura;
        return Resultado;
    }
    
    public double ReturnRes()
    {
        return Resultado;
    }
}
