package todo;

/**
 * Created by ben on 18/09/15.
 */
public class Todo {

    private final String id;
    private final String description;
    private final boolean complete;

    public Todo(String id, String description, boolean status) {
        this.id = id;
        this.description = description;
        this.complete = status;
    }

    public String getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public boolean isComplete() {
        return complete;
    }
}
