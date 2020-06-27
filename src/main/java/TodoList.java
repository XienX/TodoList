import java.util.ArrayList;
import java.util.List;

public class TodoList {
    List<Todo> list = new ArrayList<>();

    @Override
    public String toString() {
        StringBuilder allTodo = new StringBuilder();
        for (Todo todo: list){
            allTodo.append('\n').append(todo.toString());
        }
        return "TodoList{" +
                allTodo +
                "}\n";
    }

    public int add(Todo todo){
        int myId;
        if (list.size() == 0) {
            myId = 1;
        }
        else {
            myId = list.get(list.size()-1).getId()+1;
        }

        todo.setId(myId);
        list.add(todo);
        return myId;
    }

    public int delete(Todo todo){
        int id = todo.getId();
        for (Todo todo1 : list) {
            if (todo1.getId() == id) {
                list.remove(todo1);
                return id;
            }
        }

        return -1;
    }
    public int completed(Todo todo) {
        int id = todo.getId();
        for (Todo todo1 : list) {
            if (todo1.getId() == id) {
                todo1.setCompleted(true);
                return id;
            }
        }

        return -1;
    }
}
