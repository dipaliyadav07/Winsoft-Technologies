import java.util.HashMap;

public class JavaTest4 {
    
    public static void findDuplicates(String str) {
        HashMap<Character, Integer> charCountMap = new HashMap<>();
        
        str = str.toLowerCase();
    
        for (char ch : str.toCharArray()) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }
        
        System.out.println("Duplicate characters in the string:");
        for (char ch : charCountMap.keySet()) {
            if (charCountMap.get(ch) > 1) {
                System.out.println(ch + ": " + charCountMap.get(ch));
            }
        }
    }
    
    public static void main(String[] args) {
        
        String inputString = "Programming";
        System.out.println("String : "+inputString);
        
        findDuplicates(inputString);
    }
}
