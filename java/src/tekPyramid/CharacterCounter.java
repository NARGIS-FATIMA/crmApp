package tekPyramid;

public class CharacterCounter {
    public static void main(String[] args) {
        String str = "programming";
        //char targetChar = 'm';
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
              // char ch=str.charAt(i);
                count++;
            
        }
        System.out.println(count);
    }
}
