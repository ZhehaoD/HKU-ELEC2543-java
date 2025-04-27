import java.util.ArrayList;

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
    int time=0;
    while(jobs.getCurrObj()!=null) {
      Object obj = jobs.getCurrObj();
      Job curr = (Job) obj;
      System.out.println("Job being served: " + curr);
      int x=curr.served(unit);
      time+=unit;
      System.out.println("The current job list is: " + jobs);
      if(x<=0){
        System.out.println(curr+" is done.");
        jobs.removeCurrObj();
        System.out.println("The current job list is: " + jobs);
      }else{
        jobs.advance();
      }
      if(jobs.size()==0){
        break;
      }
    }
    System.out.println("All jobs finished after "+ time + " hours.");

  }

}
