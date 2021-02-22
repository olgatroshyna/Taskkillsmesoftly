package UserFindByName;

import UserAbstract.UserAbstract;

public class UserFindByName extends UserAbstract<String> {
    private String id;
    UserFindByName(String id,String name){
        super(name);
        this.id=id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }

}

