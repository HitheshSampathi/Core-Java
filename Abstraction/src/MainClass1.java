abstract class Examination{
	abstract public void maths();
	abstract public void fieldTheory();
	abstract public void networkAnalysis();
}
abstract class Attempt1 extends Examination{
	public void maths() {
		System.out.println("written and cleared maths");
	}
}
abstract class Attempt2 extends Attempt1{
	public void fieldTheory() {
		System.out.println("written and cleared fieldTheory");
	}
}
 class Attempt3 extends Attempt2{
	public void networkAnalysis() {
		System.out.println("written and cleared networkAnalysis");
	}
}
public class MainClass1 {
public static void main(String[] args) {
	Attempt3 ref=new Attempt3();
	ref.fieldTheory();
	ref.networkAnalysis();
	ref.maths();
}
}
