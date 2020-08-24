import java.util.HashMap;
import java.util.Map;

import com.promo.engine.service.PromoService;
import com.promo.engine.service.PromoServiceImpl;

public class Test {

    public static void main(String[] args) {
        Map<String, Integer> itemCart1 = new HashMap<>();
        itemCart1.put("A", 1);
        itemCart1.put("B", 1);
        itemCart1.put("C", 1);
        itemCart1.put("D", 0);

        Map<String, Integer> itemCart2 = new HashMap<>();
        itemCart2.put("A", 5);
        itemCart2.put("B", 5);
        itemCart2.put("C", 1);
        itemCart2.put("D", 0);
        
        Map<String, Integer> itemCart3 = new HashMap<>();
        itemCart3.put("A", 3);
        itemCart3.put("B", 5);
        itemCart3.put("C", 1);
        itemCart3.put("D", 1);

        PromoService promoEngine = new PromoServiceImpl();

        int itemPrice1 = promoEngine.calculateFinalPrice(itemCart1);

        System.out.println(itemPrice1);

        int itemPrice2 = promoEngine.calculateFinalPrice(itemCart2);

        System.out.println(itemPrice2);
        
        int itemPrice3 = promoEngine.calculateFinalPrice(itemCart3);

        System.out.println(itemPrice3);

    }

}
