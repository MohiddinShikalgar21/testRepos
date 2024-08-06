package com.hsbc.question1;

public class JobDemo {
    public static void main(String[] args) {
        try {
            PriorityJob pJob1 = new PriorityJob("Fix Prod Bug", "P1", PriorityJob.PRIORITY_HIGH, "P2");
            pJob1.displayInfo();
            
            PriorityJob pJob2 = new PriorityJob("Complete JIRA 123", "P3", PriorityJob.PRIORITY_MEDIUM, "P4", 2, 7, 2024, Job.STATUS_WORK_IN_PROGRESS);
            pJob2.displayInfo();
            
            MultiOwnerJob mJob1 = new MultiOwnerJob("Tech Support", "P3", "P5");
            mJob1.displayInfo();
            
            MultiOwnerJob mJob2 = new MultiOwnerJob("Documentation", "P6", 1, 6, 2024, Job.STATUS_COMPLETED, "P3");
            mJob2.displayInfo();
            
            System.out.println("Total Jobs Created: " + Job.getJobsCount());
            
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
