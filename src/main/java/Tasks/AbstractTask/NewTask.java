package Tasks.AbstractTask;

import java.util.Arrays;

public class NewTask extends AbstractTask<String> {
    private String name;
    private String datatime;
    private String repeate;

    public NewTask(String name, String datatime, String repeate) {
        super();
        this.name = name;
        this.datatime = datatime;
        this.repeate = repeate;
    }

    public String execute() {
        return this.name;
        for (String s : Arrays.asList(this.datatime, this.repeate)) {
            return s;
        }
    }

    public String getName() {
        return "new tasks";
    }


}