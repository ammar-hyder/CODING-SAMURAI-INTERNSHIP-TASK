import java.util.ArrayList;
import java.util.Scanner;

class ToDoListTasks{
    public ToDoListTasks(){};

    private String title, Description, DueDate, status;

    public ArrayList<ToDoListTasks> list = new ArrayList<>(); //an array list that will store all the tasks

    //setters and getters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getDueDate() {
        return DueDate;
    }

    public void setDueDate(String dueDate) {
        DueDate = dueDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    //function to add a task
    public void addTask(String title, String description, String dueDate) {
        ToDoListTasks task = new ToDoListTasks(); // a todolisttask type object that is created when a new task is to be added
        task.setTitle(title);
        task.setDescription(description);
        task.setDueDate(dueDate);
        task.setStatus("notCompleted");
        list.add(task);
    }

    //function to remove a task
    public void removeTask(int postion){
        list.remove(postion-1);
    }
    //function to mark a task completed
    public void markTaskComplete(int position){
        list.get(position-1).status = "completed";
    }
    // a function that will print all the task to the user
    public void viewTasks(){
        for (int i = 0; i < list.size(); i++) {
            System.out.println("<------------------------------>");
            System.out.println("TASK "+(i+1));
            System.out.println("Title : " +list.get(i).title);
            System.out.println("Description : " +list.get(i).Description);
            System.out.println("Due Date : " +list.get(i).DueDate);
            System.out.println("Status : " +list.get(i).status);
            System.out.println("<------------------------------>");
        }
    }

}
public class TASK1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ToDoListTasks obj = new ToDoListTasks();


        ArrayList<Object> list = new ArrayList<>();

        // an  infinite loop that will run until the user uses the exit option
        for (;;){
            //menu option that user can perform
            System.out.println("<------------------------------>");
            System.out.println("1.Add Task");
            System.out.println("2.Mark Task as Complete");
            System.out.println("3.Remove Task");
            System.out.println("4.View Task");
            System.out.println("5.Exit");
            System.out.println("<------------------------------>");
            System.out.println("Enter choice number");
            int choice = scanner.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Enter tile");
                    String title = scanner.next();
                    System.out.println("Enter Description");
                    String description = scanner.next();
                    System.out.println("Enter due date");

                    String duedate = scanner.next();
                    obj.addTask(title,description,duedate);
                    break;
                case 2:
                    obj.viewTasks();
                    System.out.println("Enter task number to be marked complete");
                    int num = scanner.nextInt();
                    obj.markTaskComplete(num);
                    break;
                case 3:
                    System.out.println("Enter task number to be removed");
                    int num1 = scanner.nextInt();
                    obj.removeTask(num1);
                    break;
                case 4:
                    obj.viewTasks();
                    break;
                case 5:
                    System.exit(0);
                    break;

            }
        }
    }
}
