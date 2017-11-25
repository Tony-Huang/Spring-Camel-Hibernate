/**
 * Created by admin on 2017/5/28.
 */

import java.util.UUID;
public class Test {

    public static void main(String[]  args) {
        UUID uuid =         UUID.randomUUID();
        System.out.println("uuid.length="+uuid.toString().length());
        System.out.println("       uuid="+uuid);

        String sampleGuid= "f73926f5-6381-49d2-9154-b56428647fd4";
        System.out.println("sampleGUID.length="+sampleGuid.length());
        System.out.println("sample uuid="+uuid);



    }
}
