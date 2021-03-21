
public class Main {

    public static void main(String[] args) {


	Worker a1 = new GradeOne("John", "Wheel Tapper", "1234567k");
	Worker a2 = new GradeTwo("Mike", "Shunter", "9876543w", true);



	System.out.println(a1 + "\n");

	System.out.println(a2 + "\n");

	System.out.print(a1.getName() + " ");
	a1.bonus();
	System.out.print(a2.getName() + " ");
	a2.bonus();
	System.out.println(a1.getName() + "'s PPS No is: " + a1.getPpsNum());
	System.out.println(a2.getName() + "'s PPS No is: " + a2.getPpsNum());
    }
}
