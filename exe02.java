import java.util.HashMap;
import java.util.Map;

public class exe02 {

    public static void main(String[] args) {

        Map<String,Integer> map = new HashMap<>();

        map.put("Joao", 30);
        map.put("Pedro", 15);
        map.put("Claudia", 20);
        map.put("Alice", 21);
        map.put("Arlindo", 72);

        System.out.println("----------------------------------");
        System.out.println(" Itens do HashMap ");
        System.out.println("-----------------------------------");

        for (String key: map.keySet()) {

            String value = String.valueOf(map.get(key));
            System.out.println(key + " = " + value);
        }

        System.out.println("----------------------------------");
        System.out.println("Com mais de 20 anos ");
        System.out.println("-----------------------------------");

        for (String key: map.keySet()) {
            int value = map.get(key);

            if(value > 20) {
                System.out.println(key + " = " + value);
            }
        }


    }



}
