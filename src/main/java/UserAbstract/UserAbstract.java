package UserAbstract;

public abstract class UserAbstract <T>{
    // generic
    private String name;
    //constructor
    public UserAbstract(String name){
        this.name=name;
    }
    public abstract void setId(T id);//этот метод должны реализовать наследники
    public abstract T getId();

    public void setName(String name) {
        this.name = name;
    };

    public String getName() {
        return this.name;
    }
}
