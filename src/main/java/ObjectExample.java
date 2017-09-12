import com.google.gson.Gson;

/**
 * Created by maiq on 12/09/17.
 */
public class ObjectExample {

    private Long id;
    private String name;
    private String branch;
    private String college;

    public ObjectExample(){


    }

    public ObjectExample(Long id, String name, String branch, String college){

        this.id = id;
        this.name = name;
        this.branch = branch;
        this.college = college;
    }

    @Override
    public String toString() {
        return "ObjectExample{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", branch='" + branch + '\'' +
                ", college='" + college + '\'' +
                '}';
    }

    public static void main(String[] args) {

        ObjectExample objectExample = new ObjectExample(13576L, "Mohammad", "CSE", "NIT Hamirpur");
        Gson gson = new Gson();

        //Serialization
        String jsonString = gson.toJson(objectExample);
        System.out.println(jsonString);

        //Deserialization
        ObjectExample objectExample1 = gson.fromJson(jsonString, ObjectExample.class);
        System.out.println(objectExample1);
    }
}
