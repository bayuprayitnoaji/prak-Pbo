public class CarDemo{
	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Car();

		car1.ChangeCadence(50);
		car1.SpeedUp(20);
		car1.ChangeGear(2);
		car1.printInfo();

		car2.ChangeCadence(30);
		car2.SpeedUp(10);
		car2.ChangeGear(1);
		car2.printInfo();
	}
}