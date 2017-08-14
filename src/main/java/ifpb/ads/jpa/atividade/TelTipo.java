/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpb.ads.jpa.atividade;

/**
 *
 * @author jose2
 */
public enum TelTipo {
      RESIDENCIAL{"RESIDENCIAL"), CELULAR("CELULAR"), CASA("CASA");
    private String tel;


    private TelTipo(String tel) {
        this.tel = tel;
    }
    

}
