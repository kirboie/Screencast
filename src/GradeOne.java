
public class GradeOne extends Worker {

    private String job;

    public GradeOne(String name, String job, String ppsNum) {
	super(name, ppsNum);
	this.job = job;
    }

    @Override
    public void bonus() {
	System.out.println("will not get his bonus");
    }

    public String getJob() {
	return job;
    }

    public void setJob(String job) {
	this.job = job;
    }

    @Override
    public String toString() {
	return super.toString() + "\nJob = " + job;
    }

}
