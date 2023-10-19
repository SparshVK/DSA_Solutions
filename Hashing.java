import java.util.*;
public class Hashing {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int max=0;
    int arr[] = new int[n];
    for(int i=0 ; i<n ; i++){
    arr[i] = sc.nextInt();
    if(arr[i] > max){
        max=arr[i];
    }
    }
    System.out.println("----------------------------------------------------");

    // pre-calculating the frequency of each element
    int hash[] = new int[max+1];
    for(int i=0 ; i<n; i++){
    hash[arr[i]]++;
    System.out.println(hash[arr[i]]);
    }

    System.out.println("----------------------------------------------------");
    // Taking Queries from the User
    int query = sc.nextInt();
    while(query-- != 0){
        int number=sc.nextInt();
        // Fetching the Output

        System.out.println(hash[number]);
    }
    sc.close();

    }
}
