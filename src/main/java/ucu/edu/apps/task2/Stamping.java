package ucu.edu.apps.task2;

public class Stamping {
    public static <T> void visitTask(Signature<T> task, Group<T> group) {
        task.setHeader("groupUUID", group.getGroupUuid());
    }
    
    public static <T> Group<T> stamping(Group<T> group) {
        for (Task<T> task : group.getTasks()) {
            if (task instanceof Task) {
                // stamp with id
                visitTask((Signature<T>) task, group);
            } else if (task instanceof Group) {
                stamping((Group<T>) task);
            }
        }
        return group;
    }
}
