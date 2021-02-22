package Tasks.AbstractTask;

import java.util.Arrays;

public abstract class HomeTask extends AbstractTask<String> {
    private String name;
    private String datatime;
    private String repeate;

    public HomeTask(String name, String datatime, String repeate) {
        super();
        this.name = name;
        this.datatime = datatime;
        this.repeate = repeate;
    }

    public String execute() {
        return this.name;
    }


    public String getName() {
        return "home tasks";
    }


}


