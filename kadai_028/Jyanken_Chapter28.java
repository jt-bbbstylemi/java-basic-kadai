package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {

	public String getMyChoice() {
		
		while(true) {
		
		Scanner scanner = new Scanner(System.in);
		
		String myChoice = scanner.nextLine();
	
			if (myChoice.equals("r") || myChoice.equals("s") || myChoice.equals("p")) {
								
				return myChoice;
			
				
			} else {
				System.err.println("入力する文字に誤りがあります。再度、自分のじゃんけんの手を入力しましょう");
				
			}
			
		}
		
	}
	
	public String getRandom() {
		
		String[] keyList = {"r", "s", "p"};
		
		int randomNum = (int) Math.floor(Math.random() * 3);
		
		String cpuChoice = keyList[randomNum];
		
		return cpuChoice;
	}
	
	public void playGame(String myChoice, String cpuChoice) {
		
		HashMap<String, String> handFormMap = new HashMap<>();
		
		handFormMap.put("r", "グー");
		handFormMap.put("s", "チョキ");
		handFormMap.put("p", "パー");
		
		if (myChoice.equals("r") && cpuChoice.equals("s") ||
			myChoice.equals("s") && cpuChoice.equals("p") ||
			myChoice.equals("p") && cpuChoice.equals("r") )  {
			
			System.out.println("自分の勝ちです");
			
		} else if (myChoice.equals(cpuChoice)) {
			
			System.out.println("あいこです");
			
		} else {
			
			System.out.println("自分の負けです");
			
		}
		
		System.out.println("自分は" + handFormMap.get(myChoice) + "、相手は" + handFormMap.get(cpuChoice));
		
	}
	
}

