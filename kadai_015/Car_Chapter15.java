package kadai_015;

public class Car_Chapter15 {

	private int gear  = 1;
	private int speed = 10;
	
	
	
	public void changeGear(int afterGear) {
		
		int beforGear = this.gear;
		this.gear     = afterGear;
		
		
		System.out.println("ギア" + beforGear + "から" + afterGear + "に切り替えました");
		
		if (this.gear < 1 || this.gear > 5) {
			this.speed = 10;
		} else {
			this.speed = this.gear * 10;
		}
	} 
	
	public void run() {
		
		
		System.out.println("速度は時速" + this.speed + "kmです");
		
	}
	
}
