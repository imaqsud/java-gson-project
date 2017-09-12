import com.google.gson.Gson;

/**
 * Created by maiq on 12/09/17.
 */
public class Primitive {

    public static void main(String[] args) {

        // Serialization
        System.out.println("Serialization: ");
        Gson gson = new Gson();
        System.out.println(gson.toJson(1));             // ==> 1
        System.out.println(gson.toJson("abcd"));       // ==> "abcd"
        System.out.println(gson.toJson(new Long(10))); // ==> 10
        int[] values = {1, 2, 3, 4, 5};
        System.out.println(gson.toJson(values));       // ==> [1, 2, 3, 4, 5]

        // Deserialization
        System.out.println("Deserialization: ");
        int one = gson.fromJson("1", int.class);
        System.out.println(one);
        Integer two = gson.fromJson("1", Integer.class);
        System.out.println(two);
        Long three = gson.fromJson("1", Long.class);
        System.out.println(three);
        Boolean falseD = gson.fromJson("false", Boolean.class);
        System.out.println(falseD);
        String str = gson.fromJson("\"abc\"", String.class);
        System.out.println(str);
        String[] anotherStr = gson.fromJson("[\"abc\"]", String[].class);
        System.out.println(anotherStr);
    }
}
