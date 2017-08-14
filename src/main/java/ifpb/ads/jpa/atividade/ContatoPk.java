/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpb.ads.jpa.atividade;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author jose2
 */
public class ContatoPk implements Serializable{

    private String nome;
    private String sobreNome;

    public ContatoPk() {
    }

    private ContatoPk(String nome, String sobreNome) {
        this.nome = nome;
        this.sobreNome = sobreNome;
    }
     public static ContatoPk  ofContatoPk(String nome, String sobreNome) {
       return new ContatoPk(nome, sobreNome);
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.nome);
        hash = 59 * hash + Objects.hashCode(this.sobreNome);
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
        final ContatoPk other = (ContatoPk) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.sobreNome, other.sobreNome)) {
            return false;
        }
        return true;
    }
     
    

}
