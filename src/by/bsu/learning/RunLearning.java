package by.bsu.learning;

public class RunLearning {
	public static void main(String [] args) {
		final int NUMBER_TASKS_1 = 5;
		Student student1 = new Student(322801, NUMBER_TASKS_1);
		for (int i = 0; i < NUMBER_TASKS_1;i++) {
			Task t = new Task("Task #" + i);
		}
	}
}
