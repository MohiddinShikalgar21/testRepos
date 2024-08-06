package com.hsbc.question1;

public class Job {

    private static int jobsCount = 0;

    public static final String STATUS_NOT_STARTED = "not started";
    public static final String STATUS_WORK_IN_PROGRESS = "work in progress";
    public static final String STATUS_COMPLETED = "completed";

    private String jobname;
    private String owner;
    private int effortRequired;
    private int monthOfCreation;
    private int yearOfCreation;
    private String status;
    private final String jobId;

    public Job(String jobname, String owner) {
        if (jobname == null || jobname.isEmpty() || owner == null || owner.isEmpty()) {
            throw new IllegalArgumentException("Job name and owner are mandatory fields.");
        }
        this.jobname = jobname;
        this.owner = owner;
        this.effortRequired = 0;
        this.monthOfCreation = 1; 
        this.yearOfCreation = 2024; 
        this.status = STATUS_NOT_STARTED; 

        jobsCount++;
        this.jobId = jobname + "_" + jobsCount;
    }

    public Job(String jobname, String owner, int effortRequired, int monthOfCreation, int yearOfCreation, String status) {
        this(jobname, owner);
        this.effortRequired = effortRequired;
        this.monthOfCreation = monthOfCreation;
        this.yearOfCreation = yearOfCreation;
        this.status = status;
    }

    public void displayInfo() {
        System.out.println(showDetails());
    }

    public String showDetails() {
        return String.format(
            "Job ID: %s\nJob Name: %s\nOwner: %s\nEffort Required (in months): %d\nMonth of Creation: %d\nYear of Creation: %d\nStatus: %s",
            jobId, jobname, owner, effortRequired, monthOfCreation, yearOfCreation, status
        );
    }

    public static int getJobsCount() {
        return jobsCount;
    }

    public String getJobId() {
        return jobId;
    }

    public String getJobname() {
        return jobname;
    }

    public String getOwner() {
        return owner;
    }

    public int getEffortRequired() {
        return effortRequired;
    }

    public int getMonthOfCreation() {
        return monthOfCreation;
    }

    public int getYearOfCreation() {
        return yearOfCreation;
    }

    public String getStatus() {
        return status;
    }
}
