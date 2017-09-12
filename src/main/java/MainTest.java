import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by maiq on 12/09/17.
 */
public class MainTest {

    public static void main(String[] args) {

        List<Task> list = new ArrayList<Task>();
        for (int i=1; i<=5; i++){

            list.add(new Task(i, "Summary", "Description", Task.Status.ASSIGNED, 5));
        }

        Gson gson = new Gson();
        Type type = new TypeToken<List<Task>>() {}.getType();
        String jsonString = gson.toJson(list, type);
        System.out.println(jsonString);

        list = gson.fromJson(jsonString, type);
        System.out.println(list);

        for (Task task : list) {

            System.out.println(task);
        }
    }
}
