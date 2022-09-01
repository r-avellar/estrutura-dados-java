import java.util.*;

public class exe04 {

    public static void main(String[] args) {
        Random random = new Random();
        Stack<Integer> pilha1 = new Stack<>();
        Stack<Integer> pilha2 = new Stack<>();
        Scanner ler = new Scanner(System.in);


        for (int i = 0; i < 10; i++) {
            pilha1.push(random.nextInt(100));
        }


        System.out.println("pilha : " + pilha1);

        System.out.printf("Digite o número para ser retirado: ");
        int n = ler.nextInt();

        int x = (pilha1.search(n));

        for (int i = 0; i < x; i++) {
//            int tira = pilha1.pop();
//            pilha2.push(tira);

            pilha2.push(pilha1.pop());
        }
        System.out.println("retirando numero....");
        pilha2.pop();

        for (int i = 0; i < x-1; i++) {
//            int tira = pilha2.pop();
//            pilha1.push(tira);

            pilha1.push(pilha2.pop());
        }

        System.out.println("pilha : " + pilha1);

    }

}

