package TaskExecutor;

import Task.InterfaceTask.InterfaceTask;
import UserAbstract.UserAbstract;

public class TaskExecutor <T>{
    void start (UserAbstract<T> user, List<InterfaceTask<T>> commands) {

        commands.forEach(command -> {
            command.setStatus(Status.STARTED);
            System.out.println(command.getName() + ":" + command.getStatus());

            T result = command.execute();

            command.setStatus(Status.EXECUTED);
            System.out.println(command.getName() + ":" + command.getStatus());

            String message = new StringBuilder()
                    .append("User ")
                    .append(user.toString())
                    .append(" executed command ")
                    .append(command.getName())
                    .append(", result: ")
                    .append(result)
                    .toString();

            System.out.println(message);
        });
    }

}