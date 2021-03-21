abstract class Worker {

    private String name;
    private String ppsNum;

    public Worker(String name, String ppsNum) {
	super();
	this.name = name;
	this.ppsNum = ppsNum;
    }

    abstract void bonus();
    

    public void setName(String name) {
	this.name = name;
    }

    public String getName() {
	return this.name;
    }

    @Override
    public String toString() {

	return "Name = " + name + "\npps.no = " + ppsNum;
    }

    public String getPpsNum() {
	return ppsNum;
    }

    public void setPpsNum(String ppsNum) {
	this.ppsNum = ppsNum;
    }

} // class
