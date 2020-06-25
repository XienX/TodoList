import org.junit.Assert;
import org.junit.Test;

public class MyTest {

    @Test
    public void TodoTestInput1 () {
        TodoList list = new TodoList();

        /*
        *中间调添加、删除、改状态的方法
        */

        String result = list.toString;
        Assert.assertEquals("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", result);
    }
}
