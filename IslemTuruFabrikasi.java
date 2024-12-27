import java.util.HashMap;
import java.util.Map;

public class IslemTuruFabrikasi {
    private static Map<String, IslemTuru>turler = new HashMap<>();
    public static IslemTuru getIslemTuru(String isim){
    if(!turler.containsKey(isim)){
    turler.put(isim, new IslemTuru(isim));
    }
    return turler.get(isim);
    }
}

