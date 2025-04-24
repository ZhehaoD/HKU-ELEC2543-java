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
    System.out.println("Job being served: "+jobs.getHead());
    jobs.served(unit);
  }
}
