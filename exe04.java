import java.util.*;

public class exe04 {

    public static void main(String[] args) {
        Random random = new Random();
        Stack pilha1 = new Stack();
        Stack pilha2 = new Stack();
        Scanner ler = new Scanner(System.in);


        for (int i = 0; i < 10; i++) {
            int poem = (int) pilha1.push(random.nextInt(100));
        }


        System.out.println("pilha : " + pilha1);

        System.out.printf("Digite o número para ser retirado: ");
        int n = ler.nextInt();

        int x = (pilha1.search(n));

        for (int i = 0; i < x; i++) {
            int tira = (int) pilha1.pop();
            int poem = (int) pilha2.push(tira);
        }

        pilha2.pop();

        for (int i = 0; i < x-1; i++) {
            int tira = (int) pilha2.pop();
            int poem = (int) pilha1.push(tira);
        }

        System.out.println("pilha : " + pilha1);

    }

}

