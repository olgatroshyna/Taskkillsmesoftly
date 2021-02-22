package Task.InterfaceTask;

public interface InterfaceTask<T, Status> {
    public String getName();

    public T execute();
    //have to enter new variable
    public void setStatus(Status status);
    public Status getStatus();

}
