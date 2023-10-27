package br.com.ifpe.oxefood.modelo.fornecedor;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.Where;

@Entity
@Table(name = "Fornecedor")
@Where(clause = "habilitado = true")


public class Fornecedor {


       @Column
   private String nome;

  

   @Column
   private LocalDate dataFundacao;

      @Column
   private String  endereco;

   @Column
   private double valorMercado;

   @Column
   private String paginaWeb;

    @Column
   private String contatoVendedor;

    public int getVersao() {
        return 0;
    }

    public void setVersao(long l) {
    }

    public void setDatafundacao(LocalDate now) {
    }

    public Object getFoneFixo() {
        return null;
    }

    public Object getCpf() {
        return null;
    }


}


}