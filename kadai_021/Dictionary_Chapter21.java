
package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {

    
    private HashMap<String, String> wordList = new HashMap<>();

    
    public Dictionary_Chapter21() {

        wordList.put("apple", "りんご");
        wordList.put("peach", "桃");
        wordList.put("banana", "バナナ");
        wordList.put("lemon", "レモン");
        wordList.put("pear", "梨");
        wordList.put("kiwi", "キウィ");
        wordList.put("strawberry", "いちご");
        wordList.put("grape", "ぶどう");
        wordList.put("muscat", "マスカット");
        wordList.put("cherry", "さくらんぼ");
    }

    
    public String searchWord(String inputWord) {

        for (String key : wordList.keySet()) {

            if (inputWord.equals(key)) {
                return wordList.get(key);
            }
        }

        return null;
    }
}
