public class RRSimulation {
 
  // NO MORE INSTANCE VARIABLE CAN BE DEFINED
  private Ring jobs;

  // DO NOT MODIFY THE CONSTRUCTOR
  public RRSimulation() {
    jobs = GenJob.genInitJobList();
    System.out.println("The original job list is:");
    System.out.println(jobs);
  }

  public void run(int unit){
    Job curr=new Job(jobs.getHead());
    System.out.println("Total units of time needed: " + jobs.getHead());

    System.out.println("The current job list is: " + jobs);

  }
}
