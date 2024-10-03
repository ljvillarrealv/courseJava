package org.lvillarreal.junit5.ejemplos.models;

import org.lvillarreal.junit5.ejemplos.exceptions.DineroInsuficienteException;

import java.math.BigDecimal;

public class Cuenta {

    private String persona;
    private BigDecimal saldo;
    private Banco banco;

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public Cuenta(String persona, BigDecimal saldo) {
        this.saldo = saldo;
        this.persona = persona;
    }


    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public String getPersona() {
        return persona;
    }

    public void setPersona(String persona) {
        this.persona = persona;



    }


    public void debito(BigDecimal monto){

       BigDecimal nuevoSaldo = this.saldo.subtract(monto);
       if (nuevoSaldo.compareTo(BigDecimal.ZERO) < 0) {

           throw new DineroInsuficienteException("Dinero Insuficientes");

        }
        this.saldo = nuevoSaldo;
    }

    public void credito(BigDecimal monto){

        this.saldo = this.saldo.add(monto);

    }

    @Override
    public boolean equals(Object obj) {
      if ( obj== null || !(obj instanceof Cuenta)) {
          return false;
      }
       Cuenta c = (Cuenta) obj;

        if (this.persona == null || this.saldo == null){
            return false;
        }
        return this.persona.equals(c.getPersona()) && this.saldo.equals(c.getSaldo());
    }


}
