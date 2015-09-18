package todo;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.UUID;

import static org.junit.Assert.*;

/**
 * Created by ben on 18/09/15.
 */
public class TestTodoController {

    private TodoController controller;

    @Before
    public void setupTest(){
        controller = new TodoController();
    }

    @Test
    public void testGetTodo(){

        Todo todo = controller.getTodo(null, "Buy eggs!");
        assertNotNull(todo.getId());
        assertNotNull(todo.getDescription());
        assertFalse(todo.isComplete());
    }

    @Test
    public void testGetTodo2(){
        String guid = UUID.randomUUID().toString();
        String desc = "Buy eggs!";
        Todo todo = controller.getTodo(guid, desc);
        assertNotNull(todo.getId());
        assertEquals(guid, todo.getId());
        assertNotNull(todo.getDescription());
        assertEquals(desc, todo.getDescription());
        assertFalse(todo.isComplete());
    }
}
