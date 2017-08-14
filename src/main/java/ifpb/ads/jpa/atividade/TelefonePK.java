/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpb.ads.jpa.atividade;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

/**
 *
 * @author jose2
 */

public class TelefonePK implements Serializable {
    @Enumerated(EnumType.STRING)
   private TelTipo tipo;
   private String numero;

    public TelefonePK() {
    }

    public TelefonePK(TelTipo tipo, String numero) {
        this.tipo = tipo;
        this.numero = numero;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.tipo);
        hash = 29 * hash + Objects.hashCode(this.numero);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final TelefonePK other = (TelefonePK) obj;
        if (!Objects.equals(this.numero, other.numero)) {
            return false;
        }
        if (this.tipo != other.tipo) {
            return false;
        }
        return true;
    }

   
   
}
