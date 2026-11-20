package kadai_028;

public class JyankenExec_Chapter28 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		System.out.println("自分のじゃんけんの手を入力しましょう");
        System.out.println("グーはrockのrを入力しましょう");
        System.out.println("チョキはscissorsのsを入力しましょう");
        System.out.println("パーはpaperのpを入力しましょう");
        
        Jyanken_Chapter28 jyanken = new Jyanken_Chapter28(); 
        
        String myChoice = jyanken.getMyChoice();
        
        String cpuChoice = jyanken.getRandom();
        
        jyanken.playGame(myChoice,cpuChoice);

	}

}
