import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by VINNI on 27.01.17.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Map<String, String> map = new HashMap<>();
        map.put("do", "fa");
        map.put("re", "mi");

        System.out.println(replacer(map));}

    private static String replacer(Map <String, String> map) {
            Set<String> keys = map.keySet();
            String s;
            StringBuilder sb = new StringBuilder();
            try (BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {

                while ((s = br.readLine()) != null) {
                    for (String key : keys) {

                        if (!s.equals(key)) {
                            sb.append(map.get(key));
                            sb.append(" ");
                        }
                    }
                }
            }
            catch (IOException e) {
                System.out.println("read failed");
            }
        return sb.toString();
        }

}