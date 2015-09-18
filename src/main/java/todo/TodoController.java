package todo;

/**
 * Created by ben on 18/09/15.
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/todo")
public class TodoController {

    protected List todoList = new ArrayList<Todo>();

    public TodoController() {
        todoList = Arrays.asList(
                new Todo(UUID.randomUUID().toString(),
                        "Buy milk!", false));
    }

    @RequestMapping(method = RequestMethod.GET)
    public
    @ResponseBody
    Todo getTodo(
            @RequestParam(value = "id", required = false) String id,
            @RequestParam(value = "desc", required = false, defaultValue = "Buy some stuff!") String desc
    ) {

        if(null == id || id.equals("")){
            id = UUID.randomUUID().toString();
        }

        return new Todo(id, desc, false);
    }


}
