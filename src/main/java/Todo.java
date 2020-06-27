public class Todo{
    private int id; //编号
    private String name; //名称
    private String content; //内容
    private boolean completed = false; //状态
    private String time; //时间

    public Todo (String name, String content, String time) {
        this.name = name;
        this.content =content;
        this.time = time;

        id = -1;
    }

    @Override
    public String toString() {
        return  "id: " + id + '\n' +
                "workName: " + name + '\n' +
                "content: " + content + '\n' +
                "isCompleted: " + completed + '\n' +
                "time: " + time + '\n';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}