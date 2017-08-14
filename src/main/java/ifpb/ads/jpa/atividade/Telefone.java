/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpb.ads.jpa.atividade;

import java.io.Serializable;
import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

/**
 *
 * @author jose2
 */
@Embeddable
public class Telefone implements Serializable {
    @Enumerated(EnumType.STRING)
   private TelTipo tipo;
   private String numero;

    public Telefone() {
    }

    private Telefone(TelTipo tipo, String numero) {
        this.tipo = tipo;
        this.numero = numero;
    }
     public static Telefone of(TelTipo tipo, String numero) {
       return new Telefone(tipo, numero);
    }
    
   
}
