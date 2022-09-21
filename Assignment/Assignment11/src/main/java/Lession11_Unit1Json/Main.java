package Lession11_Unit1Json;
import com.google.gson.Gson;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.setTitle("Convert Java Object to String Json");
        post.setId(100L);
        post.setDescription("Use Jackson JSON API");
        post.setContent("HTML content");
        post.setLastUpdatedAt(new Date());
        post.setPostedAt(new Date());

        //tạo đối tượng gson
        Gson gson = new Gson();
        String result = gson.toJson(post);
        System.out.println(result);
    }
}
