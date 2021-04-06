import java.util.Map;
import java.util.TreeMap;


public class Program {
    public static void main(String[] args) {

        Map<String, String> cookies = new TreeMap<>();

        cookies.put("username","Maria");
        cookies.put("email","teste@maria.com");
        cookies.put("phone","999999");

        cookies.remove("email");
        
        //Saber se existe a chave :
        System.out.println("Contains 'phone' key : " + cookies.containsKey("phone"));
        //Saber o valor dentro da chave :
        System.out.println("Phone number : " + cookies.get("phone"));

        System.out.println("ALL COOKIES");
        for (String key : cookies.keySet()) {
            System.out.println(key + " : " + cookies.get(key));
        }

    }
}
