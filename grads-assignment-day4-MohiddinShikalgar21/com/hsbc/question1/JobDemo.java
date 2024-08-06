package com.hsbc.question1;

public class JobDemo {
    public static void main(String[] args) {
        try {
            Job[] jobs = new Job[4];
            
            jobs[0] = new PriorityJob("Fix Prod Bug", "P1", PriorityJob.Priority.HIGH, "P2");
            jobs[1] = new PriorityJob("Complete JIRA 123", "P3", 2, 7, 2024, Job.STATUS_WORK_IN_PROGRESS, PriorityJob.Priority.MEDIUM, "P4");
            jobs[2] = new MultiOwnerJob("Tech Support", "P3", "P5");
            jobs[3] = new MultiOwnerJob("Documentation", "P6", 1, 6, 2024, Job.STATUS_COMPLETED, "P3");

            for (Job job : jobs) {
                job.displayInfo();
                System.out.println();
                
                if (job instanceof PriorityJob) {
                    PriorityJob pJob = (PriorityJob) job;
                    System.out.println("Priority: " + pJob.getPriority());
                    System.out.println("Monitored By: " + pJob.getMonitoredBy());
                }
                
                if (job instanceof MultiOwnerJob) {
                    MultiOwnerJob mJob = (MultiOwnerJob) job;
                    System.out.println("Second Owner: " + mJob.getSecondOwner());
                }
                
                System.out.println();
            }

            System.out.println("Total Jobs Created: " + Job.getJobsCount());

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
