import java.util.*;
class JobSequencing {
    // Function to find the maximum profit and the number of jobs done.
    int[] JobScheduling(Job arr[], int n) {
        // Sort jobs in descending order of profit
        Arrays.sort(arr, Comparator.comparingInt((Job j) -> j.profit).reversed());
        
        // Find the maximum deadline
        int maxDeadline = Arrays.stream(arr)
                                .mapToInt(job -> job.deadline)
                                .max()
                                .orElse(0);
        
        // Initialize slots with -1 (indicating empty)
        int[] slot = new int[maxDeadline];
        Arrays.fill(slot, -1);
        
        int totalProfit = 0;
        int jobCount = 0;
        
        // Iterate through all jobs
        for (Job job : arr) {
            // Find a free slot for this job
            for (int j = Math.min(maxDeadline, job.deadline) - 1; j >= 0; j--) {
                if (slot[j] == -1) { // Slot is free
                    slot[j] = job.id; // Schedule job
                    totalProfit += job.profit; // Update total profit
                    jobCount++; // Increment job count
                    break; // Move to the next job
                }
            }
        }
        
        return new int[]{jobCount, totalProfit};
    }
    public static void main(String[] args) {
        // Create job instances
        Job job1 = new Job(1, 4, 20);
        Job job2 = new Job(2, 1, 10);
        Job job3 = new Job(3, 1, 40);
        Job job4 = new Job(4, 1, 30);
        
        // Put jobs in an array
        Job[] jobs = new Job[]{job1, job2, job3, job4};
        
        // Create an instance of JobSequencing
        JobSequencing js = new JobSequencing();
        
        // Perform job scheduling
        int[] result = js.JobScheduling(jobs, jobs.length);
        
        // Print results
        System.out.println("Number of jobs done: " + result[0]);
        System.out.println("Total profit: " + result[1]);
    }
}


class Job {
    int id, profit, deadline;
    Job(int x, int y, int z){
        this.id = x;
        this.deadline = y;
        this.profit = z; 
    }
}