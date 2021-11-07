package exam;

public class Bike {
	
	String carName;
	int velocity;
	int wheelNumber;
	
	
	public Bike(String carName, int velocity, int wheelNumber) {
		this.carName = carName;
		this.velocity = velocity;
		this.wheelNumber = wheelNumber;

	
	}


	public void speedUp(int speed) {
		speed = speed + velocity;
		if(velocity>40) {
			velocity = 40;
		}else {
		}
		System.out.println(carName+"의 현재속도는"+velocity+"입니다");
	}
	
	public void speedDown(int speed) {
		speed = speed - velocity;
		
		System.out.println(carName+"의 최저속도위반으로 속도를 10으로 올립니다");
		}
	public void stop() {
		velocity = 0;
		System.out.println("정지상태로 속도를 0으로 초기화합니다.");
	}
	}

