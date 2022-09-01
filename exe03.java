
import java.util.*;

public class exe03 {

    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();

        fila.add("Joao");
        fila.add("Pedro");
        fila.add("Claudia");
        fila.add("Alice");
        fila.add("Arlindo");

        try {
            System.out.println(fila);
            System.out.println("Tira o primeiro");
            String primeiro = fila.poll();
            System.out.println(primeiro);
            System.out.println(fila);
            System.out.println("espia o primeiro com peek");
            String espia = fila.peek();
            System.out.println(espia);
            System.out.println(fila);
            System.out.println("espia o primeiro com element");
            String espia2 = fila.element();
            System.out.println(espia2);
            System.out.println(fila);

            System.out.println("esvazia a lista");
            fila.clear();
            System.out.println(fila);


            System.out.println("Tira o primeiro");
            String primeiro2 = fila.poll();
            System.out.println(primeiro2);
            System.out.println(fila);
            System.out.println("espia o primeiro com peek");
            String espia3 = fila.peek();
            System.out.println(espia3);
            System.out.println(fila);
            System.out.println("espia o primeiro com element");
            String espia4 = fila.element();
            System.out.println(espia3);
            System.out.println(fila);

        }catch (NoSuchElementException e){
            System.out.println("A fila esta vazia");
        }




        


    }



}
