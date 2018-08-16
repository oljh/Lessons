package Tests;

public class SingleChoiceQuest extends AbstractQuest{

	@Override
	public boolean check(Answer ans) {
		System.out.println("Single choise quest");
		return true;
	}
}
