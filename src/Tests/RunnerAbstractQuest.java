package Tests;

public class RunnerAbstractQuest {
	public static void main(String [] args) {
		TestAction bt = new TestAction();
		AbstractQuest [] test = bt.generateTest(60, 2);
		bt.checkTest(test);
		
	}
}
