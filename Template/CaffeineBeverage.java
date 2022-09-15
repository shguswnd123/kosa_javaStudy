package Template;

public abstract class CaffeineBeverage {
	final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		addCondiments();
	}
	
	abstract void brew();
	abstract void addCondiments();
	void boilWater() {
		System.out.println("�� ���̴� ��");
	}

	void pourInCup() {
		System.out.println("�ſ� ������ ��");
	}
}
