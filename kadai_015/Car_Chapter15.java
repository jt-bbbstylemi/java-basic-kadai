package kadai_015;

public class Car_Chapter15 {

	private int gear  = 1;
	private int speed = 10;
	
	
	
	public void changeGear(int afterGear) {
		
		
		
		System.out.println("ギア" + gear + "から" + afterGear + "に切り替えました");
		
		if (afterGear < 1 || afterGear > 5) {
			this.speed = 10;
		} else {
			this.speed = afterGear * 10;
		}
	} 
	
	public void run() {
		
		
		System.out.println("速度は時速" + this.speed + "kmです");
		
		//System.out.println(this.gear + this.speed);
	}
	
}
