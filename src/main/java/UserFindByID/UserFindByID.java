package UserFindByID;

import UserAbstract.UserAbstract;

public class UserFindByID extends UserAbstract<Integer> {
    private Integer id;
    UserFindByID(Integer id,String name){
        super(name);
        this.id=id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

public Integer getId() {
        return this.id;
        }

        }
