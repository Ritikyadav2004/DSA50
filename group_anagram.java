// import java.util.HashMap;
// import java.util.Scanner;
// import java.util.Map;

// public class group_anagram {

//     public static boolean is_angrame(String str1, String str2) {
//         boolean flag = true;
//         if (str1.length() != str2.length())
//             return false;
//         for (int i = 0; i < str1.length(); i++) {
//             flag = false;
//             for (int j = 0; j < str2.length(); j++) {
//                 if (str1.charAt(i) == str2.charAt(j)) {
//                     flag = true;
//                     break;
//                 }

//             }
//         }
//         return flag;
//     }

//     public static void check(String[] str) {

//         HashMap<String, Integer> dict = new HashMap<>();
//         int count = 1;
//         boolean flag = true;
//         for (int i = 0; i < str.length; i++) {
//             count++;
//             for (int j = i + 1; j < str.length; j++) {
//                 flag = false;
//                 if (is_angrame(str[i], str[j])) {
//                     flag = true;
//                     dict.put(str[j], count);
//                 }

//             }
//             if (!flag) {
//                 dict.put(str[i], count);
//             }
//         }
//        // int count1=0;
//        for(Map.Entry<String,Integer> entry :dict.entrySet())
//        {
//             // count1++;
            
//                 System.out.println(entry.getKey());
             
            
//        }
      

//     }

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         // Read the number of strings/words
//         System.out.println("Enter Number String:");
//         int n = sc.nextInt();

//         sc.nextLine(); // consume the leftover newline

//         // Create the array
//         String[] words = new String[n];

//         //Read each string
//         for (int i = 0; i < n; i++) {
//         words[i] = sc.nextLine();
//         }
//         // for (String word : words) {
//         // System.out.println(word);
//         // }
//         check(words);
//         sc.close();

//     }
// }
import java.util.*;

public class group_anagram {

    // Function to sort characters of a string and return as key
    public static String getSortedKey(String str) {
        char[] ch = str.toCharArray();
        Arrays.sort(ch);
        return new String(ch);
    }

    public static void check(String[] words) {
        // HashMap to group words by their sorted key
        Map<String, List<String>> map = new HashMap<>();

        for (String word : words) {
            String key = getSortedKey(word); // sorted key
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(word);
        }

        // Print grouped anagrams
        for (List<String> group : map.values()) {
            System.out.println(group);
        }
    }

    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);

        // Read the number of words    
        System.out.println("Enter Number of Strings:");
        int n = sc.nextInt();
        sc.nextLine(); // Consume newlin

        // Input words
        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = sc.nextLine();
        }

        check(words);
        sc.close();
    }
}
