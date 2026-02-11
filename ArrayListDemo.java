import java.util.*;
public class ArrayListDemo {
    public static void main  (String[] args){
        Scanner sc = new Scanner(System.in);
 ArrayList<Integer> list = new ArrayList<>();
    System.out.println("Enter the number of elements:");
    int n =sc.nextInt();
    for (int i = 0; i <n;i++){
        int x=sc.nextInt();
        list.add(x);  //adding element to arraylist
    }
    System.out.println("Original list:");
    for(int x: list){
        System.out.print(x+" ");
    }
    System.out.println();
    if (list.size()>1){
        list.set(1,100);  //setting the value of index 1 to 100
    }
    if (!list.isEmpty()){
        list.remove(0);  //removing the element at index 0
    }
    System.out.println("Updated list:");
    for(int value: list){
        System.out.print( value +" ");}

    int max = list.get(0);    //initially max and min is the first element of arraylist
    int min =list.get(0);

    for(int x :list){     //enhanced for loop to find max and min element in arraylist
        if (max <x){
            max= x;
        }
        if (min>x){
            min=x;
        }
    }
    System.out.println("max="+" "+max);
    System.out.println("min="+""+min);
sc.close(); }
    
} 

