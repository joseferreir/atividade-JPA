package ifpb.ads.jpa.atividade;

import java.io.File;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Lob;
import javax.persistence.Transient;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 14/08/2017, 08:25:08
 */
@Entity
@IdClass(TelefonePK.class)
public class Contato implements Serializable {

    //nome
    //sobreNome
    //apelido
    //descricao
    //emails
    //foto (perfil)
    //dataDaCriacao
    //telefones  (numero + tipo)
    private String nome;
    private String sobreNome;
    private String apelido;
    @Lob
    @Basic(fetch = FetchType.LAZY)
    private String descricao;
    private List<String> emails;
    @Lob
    @Basic(fetch = FetchType.LAZY)
    private byte[] foto;
    @Transient
    private LocalDate dataCriacao;
    @Id
    private TelTipo tipo;
    @Id
    private String numero;
}
