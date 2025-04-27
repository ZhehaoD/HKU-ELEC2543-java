public class Job {
    private int servedTimeNeeded;
    private static int id=1;
    private int newid=id;
    private int served=0;
    private int origin;

    public Job(int servedTimeNeeded) {
        this.servedTimeNeeded = servedTimeNeeded;
        origin=servedTimeNeeded;
        id++;
    }

    public int served(int servedTime) {
        if (servedTime > servedTimeNeeded) {
            this.served += servedTime;
            return servedTimeNeeded-servedTime;
        } else {
            this.served += servedTime;
            this.servedTimeNeeded -= servedTime;
            return servedTimeNeeded;
        }
    }


    public String toString(){
        return newid+":("+origin+","+served+")";
    }
}
