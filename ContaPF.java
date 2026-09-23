/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.senac.df.banco;

/**
 *
 * @author gabriel62947886
 */
public class ContaPF extends ContaBancaria {
      private String cpf;

public ContaPF(String titular, String cpf){
super(titular);
this.cpf = cpf;
}

public String getCpf(){
return cpf;
}

public void setCpf(String cpf){
this.cpf = cpf;
}


public void extratoBancario(){
System.out.println("CONTA PF");
System.out.println("Titular: " + getTitular());
System.out.println("CPF: " + cpf);
System.out.println("Saldo: " + getSaldo());
}
}



