package is.moo.snippet.httpinterface;

import is.moo.snippet.httpinterface.model.Post;
import java.util.List;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange(url = "/", accept = "application/json", contentType = "application/json")
public interface PostClient {
  @GetExchange("posts")
  List<Post> getPosts();

}
