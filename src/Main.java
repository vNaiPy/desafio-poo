import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Treinando POO em Java");
        curso1.setCargaHoraria(2);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso PHP");
        curso2.setDescricao("Treinando back-end para Web");
        curso2.setCargaHoraria(7);



        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Implementando POO em Java");
        mentoria1.setDescricao("Abstraindo duvidas em prática em Java");
        mentoria1.setData(LocalDate.now());


//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria1);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Back-end com Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devHandrei = new Dev();
        devHandrei.setNome("Handrei");
        devHandrei.increverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos " + devHandrei.getConteudosIncritos());

        devHandrei.progredir();

        System.out.println("-");
        System.out.println("Conteudos inscritos " + devHandrei.getConteudosIncritos());
        System.out.println("Conteudos concluidos " + devHandrei.getConteudosConcluidos());
        System.out.println("Xp: " + devHandrei.calcularTotalXp());

        System.out.println("---------------");

        Dev devBruna = new Dev();
        devBruna.setNome("Bruna");
        devBruna.increverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos " + devBruna.getConteudosIncritos());

        devBruna.progredir();

        System.out.println("-");
        System.out.println("Conteudos inscritos " + devBruna.getConteudosIncritos());
        System.out.println("Conteudos concluidos " + devBruna.getConteudosConcluidos());
        System.out.println("Xp: " + devBruna.calcularTotalXp());




    }
}
