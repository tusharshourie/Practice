import java.util.*;
public class occurence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s= sc.nextLine().toLowerCase().replace(" ", "");
        LinkedHashMap<Character, Integer> count = new LinkedHashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if(!count.containsKey(s.charAt(i))){
                count.put(s.charAt(i), 1); 
            }
            else{
                count.put(s.charAt(i), count.get(s.charAt(i))+1);
            }
        }
        for(HashMap.Entry<Character, Integer> data: count.entrySet()){
            System.out.println(data.getKey() + " "+data.getValue());
        }
    }
}
