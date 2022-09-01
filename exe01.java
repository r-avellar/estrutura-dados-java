import java.util.ArrayList;
import java.util.List;

public class exe01 {

    public static void main(String[] args) {

        List<Empregado> lista = new ArrayList<>();

        lista.add(new Empregado("Joao", 30));
        lista.add(new Empregado("Pedro", 15));
        lista.add(new Empregado("Claudia", 20));
        lista.add(new Empregado("Alice", 21));
        lista.add(new Empregado("Arlindo", 72));

        System.out.println("----------------------------------");
        System.out.println(" Itens da lista ");
        System.out.println("-----------------------------------");

        for (Empregado empregado: lista) {
            System.out.println(empregado);
        }

        System.out.println("----------------------------------");
        System.out.println("Com mais de 20 anos ");
        System.out.println("-----------------------------------");

        for (Empregado empregado: lista ) {
            int value = empregado.getIdade();

            if(value > 20) {
                System.out.println(empregado);
            }
        }


    }



}
