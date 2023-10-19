import java.util.*;
public class Count_frequecy {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        int arr[] = {10,10,3,10,5,-1,3,4};
        frequency(8, 10, arr);
        getFrequencies(arr);

    }

    static void frequency(int n, int x, int []arr) // n -> array length
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++)
        {
            if(map.containsKey(arr[i]))
            map.put(arr[i], map.get(arr[i]) + 1 );
                   // key---, value--- pair  
                   
            else
            map.put(arr[i], 1);
        }
        // return arr;

        for(HashMap.Entry<Integer,Integer> entry : map.entrySet())
        {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }

        // map.put(20, 2);
        // map.put(40, 12);
        // map.put(70, 1);
        // System.out.println(map);
    }
    public static void getFrequencies(int []v) {
        // Write Your Code Here
        int max = 0, min = 1000;
        int maxe=0, mine=0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < v.length; i++)
        {
            if(map.containsKey(v[i]))
            map.put(v[i], map.get(v[i]) + 1 );
                   // key---, value--- pair  
                   
            else
            map.put(v[i], 1);
        }

        for(HashMap.Entry<Integer, Integer> entry : map.entrySet()){
            int e = entry.getKey();
            int c = entry.getValue();
            if(c > max) {
                max = c;
                maxe = e;
        }

        if(c<min) {
            min = c;
mine = e;
        }
    }

System.out.println("Maximum frequency element is " + maxe);
System.out.println("Minimum frequency element is " + mine);

       
    }
}