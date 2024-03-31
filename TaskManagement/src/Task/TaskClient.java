package Task;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.util.List;
import java.util.Scanner;

public class TaskClient {

  public static void main(String[] args) {
    try {
      String url = "rmi://localhost:195/TaskService";
      TaskService taskService = (TaskService) Naming.lookup(url);
Scanner scanner =new Scanner(System.in);
while (true) {
    System.out.println("Que voulez-vous faire ? (1.ajouter/2.supprimer/3.afficher/4.no more Task)");
    int action = scanner.nextInt();
    scanner.nextLine();    
    switch (action) {
        case 1:
            System.out.println("Entrez la tâche à ajouter :");
            String newTask = scanner.nextLine();
            taskService.addTask(newTask);
            break;
        case 2:
            System.out.println("Entrez la tâche à supprimer :");
            String taskToRemove = scanner.nextLine();
            taskService.removeTask(taskToRemove);
             break;
        case 3:
            List<String> tasks = taskService.getTasks();
            System.out.println("Liste des tâches :");
            for (String task : tasks) {
                System.out.println("- " + task);
            }
            break;
           
        case 4:
            System.out.println("Fin du programme.");
            return;
        default:
            System.out.println("Commande non reconnue. Veuillez réessayer.");
    }
}



    } catch (Exception e) {
      System.err.println("Erreur lors de l'accès au service RMI: " + e.getMessage());
    }
  }}
