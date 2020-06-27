import org.junit.Assert;
import org.junit.Test;

public class MyTest {

    @Test
    public void TodoTestInput1 () {
        TodoList list = new TodoList();
        Todo todo1 = new Todo("TODO1", "Work PLan","2020/6/27 6:00");

        list.add(todo1);
        String result = list.toString();

        String expectedResult = "TodoList{\n" +
                "id: 1\n" +
                "workName: TODO1\n" +
                "content: Work PLan\n" +
                "isCompleted: false\n" +
                "time: 2020/6/27 6:00\n" +
                "}\n";

        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void TodoTestInput2 () {
        TodoList list = new TodoList();
        Todo todo1 = new Todo("TODO1", "Life PLan","2020/6/25 10:00");

        list.add(todo1);
        list.delete(todo1);
        String result = list.toString();

        String expectedResult = "TodoList{}\n";

        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void TodoTestInput3 () {
        TodoList list = new TodoList();
        Todo todo1 = new Todo("TODO1", "Old PLan","2020/6/17 6:40");

        list.add(todo1);
        list.completed(todo1);
        String result = list.toString();

        String expectedResult = "TodoList{\n" +
                "id: 1\n" +
                "workName: TODO1\n" +
                "content: Old PLan\n" +
                "isCompleted: true\n" +
                "time: 2020/6/17 6:40\n" +
                "}\n";

        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void TodoTestInput4 () {
        TodoList list = new TodoList();
        Todo todo1 = new Todo("TODO1", "Work PLan","2020/6/27 6:00");
        Todo todo2 = new Todo("TODO2", "Life PLan","2020/6/25 10:00");
        Todo todo3 = new Todo("TODO3", "Old PLan","2020/6/17 6:40");

        list.add(todo1);
        list.add(todo2);
        list.completed(todo2);
        list.delete(todo1);
        list.add(todo3);
        String result = list.toString();

        String expectedResult = "TodoList{\n" +
                "id: 2\n" +
                "workName: TODO2\n" +
                "content: Life PLan\n" +
                "isCompleted: true\n" +
                "time: 2020/6/25 10:00\n" +
                '\n' +
                "id: 3\n" +
                "workName: TODO3\n" +
                "content: Old PLan\n" +
                "isCompleted: false\n" +
                "time: 2020/6/17 6:40\n" +
                "}\n";

        Assert.assertEquals(expectedResult, result);
    }
}
