import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Task {
    String name;
    String type;
    int completionTime;

    public Task(String name, String type, int completionTime) {
        this.name = name;
        this.type = type;
        this.completionTime = completionTime;
    }
}

class Worker {
    String name;
    int completionTime;

    public Worker(String name) {
        this.name = name;
        this.completionTime = 0;
    }

    public void assignTask(Task task) {
        completionTime += task.completionTime;
    }
}

public class TCS_CodeVita4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numWorkers = scanner.nextInt();
        int numTasks = scanner.nextInt();

        List<Task> tasks = new ArrayList<>();
        List<Worker> workers = new ArrayList<>();

        for (int i = 1; i <= numWorkers; i++) {
            workers.add(new Worker("W" + i));
        }

        for (int i = 0; i < numTasks; i++) {
            String taskName = "T" + (i + 1);
            String taskType = scanner.next();
            int completionTime = scanner.nextInt();
            tasks.add(new Task(taskName, taskType, completionTime));
        }

        List<String> result = new ArrayList<>();

        for (Task task : tasks) {
            Worker minCompletionTimeWorker = workers.get(0);

            for (Worker worker : workers) {
                if (worker.completionTime < minCompletionTimeWorker.completionTime) {
                    minCompletionTimeWorker = worker;
                }
            }

            result.add(minCompletionTimeWorker.name + " " + task.name + " " + minCompletionTimeWorker.completionTime);
            minCompletionTimeWorker.assignTask(task);
        }

        // Sort the results based on completion time and task name
        Collections.sort(result, (a, b) -> {
            String[] partsA = a.split(" ");
            String[] partsB = b.split(" ");
            if (Integer.parseInt(partsA[2]) == Integer.parseInt(partsB[2])) {
                return partsA[1].compareTo(partsB[1]);
            }
            return Integer.parseInt(partsA[2]) - Integer.parseInt(partsB[2]);
        });

        for (String res : result) {
            System.out.println(res);
        }
        scanner.close();
    }
}
