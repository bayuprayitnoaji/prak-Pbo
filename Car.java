public class Car{
	int change;
	int speed;
	int gear;

	void ChangeCadence(int changeCar) {
		change = changeCar;
	}

	void SpeedUp(int speedCar) {
		speed = speedCar;
	}


	void ChangeGear(int gearCar) {
		gear = gearCar;
	}
	
	void printInfo(){
		System.out.println(
			"Cadence : " + change + "\n" +
			"SpeedUp :" + speed + "\n" +
			"changeGear :" + gear) ;
			
	}
	
	




}
