import java.util.*;
public class Char_upHash {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // String str = sc.nextLine();
        // System.out.println("----------------------------------------------------");
        // int hash[] = new int[256];

        // // pre - calculating the frequency of characters in String
        // for(int i=0;i<str.length();i++){    
        // hash[str.charAt(i)]++;
        // }
        
        // // for(int i=0;i<str.length();i++){    
        // // System.out.println(hash[i]);
        // // }
        // System.out.println("----------------------------------------------------");
        // int query = sc.nextInt();
        
        // // No of queries to be made
        // while(query-- != 0){
        //     char c = sc.next().charAt(0); // Query Character
        //     System.out.println(hash[c]);
        // }
        int arr[] = {1,3,1,9,2,7};
        int s[] = countFrequency(6, 9, arr);
        for (int i = 0;i<=9;i++)
            System.out.print(s[i] + ",");
        sc.close();
        }
        
        public static int[] countFrequency(int n, int x, int []nums){
            // Write your code here.
            int hash[] = new int[x+1];    
            for (int i = 0;i<nums.length;i++)
            hash[nums[i]]++;

            return hash;
        }
}
