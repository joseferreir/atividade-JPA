package ifpb.ads.jpa.atividade;

import java.io.File;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.ElementCollection;
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
@IdClass(ContatoPk.class)
public class Contato implements Serializable {

    //nome
    //sobreNome
    //apelido
    //descricao
    //emails
    //foto (perfil)
    //dataDaCriacao
    //telefones  (numero + tipo)
    @Id
    private String nome;
    @Id
    private String sobreNome;
    private String apelido;
    @Lob
    @Basic(fetch = FetchType.LAZY)
    private String descricao;
    @ElementCollection
    private List<String> emails;
    @Lob
    @Basic(fetch = FetchType.LAZY)
    private byte[] foto;
    @Transient
    private LocalDate dataCriacao;
    @ElementCollection
    private List<Telefone> telefones;

    public Contato() {
    }

    private Contato(String nome, String sobreNome, String apelido, String descricao, List<String> emails, byte[] foto, LocalDate dataCriacao, List<Telefone> telefones) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.apelido = apelido;
        this.descricao = descricao;
        this.emails = emails;
        this.foto = foto;
        this.dataCriacao = dataCriacao;
        this.telefones = telefones;
    }
      public static Contato of(String nome, String sobreNome,
              String apelido, String descricao, List<String> emails, byte[] foto, LocalDate dataCriacao, List<Telefone> telefones) {
          
      return new Contato(nome, sobreNome, apelido, descricao, emails, foto, dataCriacao, telefones);
      }
    
}
