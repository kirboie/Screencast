
public class GradeTwo extends GradeOne {
    private boolean workingToday;

    public GradeTwo(String name, String job, String ppsNum, boolean workingToday) {
	super(name, job, ppsNum);
	this.workingToday = workingToday;
    }


    @Override
    public void bonus() {
	System.out.println("will get his bonus");
    }
    public boolean isWorkingToday() {
	return workingToday;
    }


    public void setWorkingToday(boolean workingToday) {
	this.workingToday = workingToday;
    }

    @Override
    public String toString() {
	return super.toString() + "\nworkingToday = " + workingToday;
    }

}
