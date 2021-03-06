package ifpb.ads.jpa.main;

import ifpb.ads.jpa.atividade.Contato;
import ifpb.ads.jpa.atividade.TelTipo;
import ifpb.ads.jpa.modelo.Aluno;
import ifpb.ads.jpa.modelo.TelefoneChave;
import ifpb.ads.jpa.atividade.Telefone;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 07/08/2017, 07:38:28
 */
public class Main {

    public static void main(String[] args) throws IOException {
     //   Telefone telefone = new Telefone("83", "3532-4100");
//       persitTelefone(telefone);
        //listarTelefones();
        List<String> emails = new ArrayList();
        emails.add("jose@hotmail.com");
         emails.add("maria@hotmail.com");
         List<Telefone> tel = new ArrayList();
         tel.add(Telefone.of(TelTipo.RESIDENCIAL, "1234-5414"));
          tel.add(Telefone.of(TelTipo.CASA, "1432-5216"));
          Path path = Paths.get("kiko.jpeg");
        byte[] foto =
                Files.readAllBytes(path);
          
          
          Contato c = Contato.of("josé", "Ferreira", "Zé",
                  "qual quer coisa", emails, foto, LocalDate.now(), tel);
          persitContato(c);
         

//        Aluno chaves = Aluno.of("Chaves", "342552", 1.0d);
//        chaves.setEndereco(Endereco.with("rua", "bairro", "cidade"));
//        persitAuno(chaves);
//        listarAlunos();
//        Funcionario kiko = Funcionario
//                .of("Kiko", "kiko@org.com", Funcionario.Sexo.MASCULINO);
//
//        String text = new SmartPath()
//                .lines()
//                .collect(Collectors.joining());
//
//        byte[] foto = new SmartPath("src/main/resources/kiko.jpeg")
//                .toBytes();
//
//        kiko.novoCurriculo(text);
//        kiko.novaFoto(foto);
//        kiko.addEmail("kiko1@org.com");
//        kiko.addEmail("kiko2@org.com");
//        manager.createQuery("FROM Funcionario f", Funcionario.class)
//                .getResultList()
//                .forEach(f -> {
//                    System.out.println(f.getDataDoNascimento());
//                    try {
//                        new SmartPath("src/main/resources/kiko2.jpeg")
//                                .write(f.getFoto());
//                    } catch (IOException ex) {
//                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
//                    }
//                });
    }
//
//    public static void persitAuno(Aluno aluno) {
//        EntityManager manager = Persistence
//                .createEntityManagerFactory("PrimeiraAula")
//                .createEntityManager();
//
//        EntityTransaction transaction = manager.getTransaction();
//        //iniciar a transação
//        transaction.begin();
//        manager.persist(aluno);
//        //finalizar a transação
//        transaction.commit();
//    }
     public static void persitContato(Contato cotato) {
        EntityManager manager = Persistence
                .createEntityManagerFactory("PrimeiraAula")
                .createEntityManager();

        EntityTransaction transaction = manager.getTransaction();
        //iniciar a transação
        transaction.begin();
        manager.persist(cotato);
        //finalizar a transação
        transaction.commit();
    }
//
//    private static void listarAlunos() {
//        EntityManager manager = Persistence
//                .createEntityManagerFactory("PrimeiraAula")
//                .createEntityManager();
//
//        manager.createQuery("FROM Aluno a", Aluno.class)
//                .getResultList()
//                .forEach(a -> System.out.println(a.getDataDeNascimento()));
//    }
//
//    private static void persitTelefone(Telefone telefone) {
//        EntityManager manager = Persistence
//                .createEntityManagerFactory("PrimeiraAula")
//                .createEntityManager();
//
//        EntityTransaction transaction = manager.getTransaction();
//        //iniciar a transação
//        transaction.begin();
//        manager.persist(telefone);
//        //finalizar a transação
//        transaction.commit();
//    }
//
//    private static void listarTelefones() {
//        EntityManager manager = Persistence
//                .createEntityManagerFactory("PrimeiraAula")
//                .createEntityManager();
//
////        manager.createQuery("FROM Telefone a", Telefone.class)
////                .getResultList()
////                .forEach(a -> System.out.println(a.numero()));
////        TelefonePK chave = new TelefonePK("83", "3532-4100");
//        TelefoneChave chave = new TelefoneChave("83", "3532-4100");
//
//        Telefone find = manager.find(Telefone.class, chave);
//        System.out.println("find = " + find.numero());
//    }

}
