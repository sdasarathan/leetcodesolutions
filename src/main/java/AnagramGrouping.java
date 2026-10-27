import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class AnagramGrouping {

//    https://leetcode.com/problems/group-anagrams/description/

    //Anagram problem
//    InputString[] words = ["listen", "silent", "enlist", "rat", "tar", "art", "evil", "vile", "live"]
//    Expected Output: [[listen, silent, enlist], [rat,tar,art], [evil, vile,live]]
//
//    String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};
//    Expected Output: [[eat, tea, ate], [bat], [tan, nat]]
    public static void main (String[] args){
        String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};
        var groups = new HashMap<String, List<String>>();

        for(String word : words){
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            groups.computeIfAbsent(key, k -> new ArrayList<>())
                    .add(word);
        }

        System.out.println(groups.values());
    }
}
