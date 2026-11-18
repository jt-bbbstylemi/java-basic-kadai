
package kadai_021;

public class DictionaryExec_Chapter21 {

    public static void main(String[] args) {

        
        String[] inputWords = {
            "apple", "banana", "grape", "orange"
        };

        
        Dictionary_Chapter21 dictionary =
                new Dictionary_Chapter21();

        
        for (String inputWord : inputWords) {

            String meaning = dictionary.searchWord(inputWord);

            if (meaning != null) {
                System.out.println(
                    inputWord + "の意味は" + meaning
                );
            } else {
                System.out.println(
                    inputWord + "は辞書に存在しません"
                );
            }
        }
    }
}
