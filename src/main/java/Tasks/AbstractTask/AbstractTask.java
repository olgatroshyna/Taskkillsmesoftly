package Tasks.AbstractTask;

import Task.InterfaceTask.InterfaceTask;

abstract class AbstractTask<Status> implements InterfaceTask<T> {
    private Status status;
    public AbstractTask(){
        this.status=Status.CREATED;
    }
    public void setStatus(Object status) {
        this.status = status;
    }



    public Status getStatus() {
        return this.status;
    }
}
