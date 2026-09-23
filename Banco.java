/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.senac.df.banco;

/**
 *
 * @author gabriel62947886
 */
public class Banco {

    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaPF("Gabriel", "087.774.421-13");
        ContaBancaria conta2 = new ContaPJ("SaborRefri", "13.475.75/0001-00");
       
       conta1.depositar(2000);
       conta2.depositar(20000);
       
       conta1.extratoBancario();
       
       System.out.println("");
       
       conta2.extratoBancario();

    }
}
