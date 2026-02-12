//first primitives are passed by value and then reference types are passed by reference
class Swaptest{
static void swapPrimitives(int a ,int b){
    int temp = a;
    a=b;
    b= temp;
}
 static void swapArray(int[] arr){
    int temp = arr[0];
    arr[0] = arr[1];
    arr[1] = temp;
 }
  static void swapWrapper(IntWrapper a,IntWrapper b){
    int temp = a.value;
    a.value = b.value;
    b.value = temp ;
  }
  static void swapArray3Left(int[]arr3){
    int temp = arr3[0];   //left cyclic rotation
    arr3[0]= arr3[1];
    arr3[1]=arr3[2];
    arr3[2]=temp; }

    static void swapArray3Right(int[]arr3){
    int temp2 = arr3[2]; //right cyclic rotation
    arr3[2]=arr3[1];
    arr3[1]=arr3[0];
    arr3[0]=temp2;
  }
  static int[] swapPrimitivesReturn(int a,int b) {
    int temp = a;
    a=b;
    b= temp;
    return new int[]{a,b}; //returning swapped primitives as an array
  }

    public static void main (String[]args){
//swap using primitives
 int x= 5;
 int y = 10;
 swapPrimitives(x,y);
 System.out.println("After swapping primitives :x="+ x +" y ="+y);
 //output will be 5 and 10 because the values of x and y are not changed in the main method as they are passed by value
    
//swap using array 
int[] arr={5,10};
swapArray(arr);
System.out.println("After swapping array: arr[0]="+ arr[0] + " arr[1] ="+arr[1]);
//output will be 10 and 5 because the values of arr[0] and arr[1] are swapped in the array reference
    
//swap using Intarray
IntWrapper a = new IntWrapper(5);
IntWrapper b = new IntWrapper(10);
swapWrapper(a,b);
System.out.println("after swapping wrapper a.value="+a.value + " b.value="+b.value);
//swapping 3 integer using arry method 
int []arr3 = {5,10,15};
swapArray3Left(arr3);
System.out.println("after swapiing array of 3 integers : left cyclic rotation arr3[0]="+arr3[0]+" arr3[1]="+arr3[1]+" arr3[2]="+arr3[2]);
swapArray3Right(arr3);
System.out.println("after swapiing array of 3 integers : right cyclic rotation arr3[0]="+arr3[0]+" arr3[1]="+arr3[1]+" arr3[2]="+arr3[2]);
//right cyclic rotation will restore the original order of the array

//returning swapped primitives from a method as an array and updating main .
int l= 5; int m = 10;
 int[] swappedValues = swapPrimitivesReturn(l,m);
  l = swappedValues[0];
   m = swappedValues[1]; 
 System.out.println("After swapping primitives using return method: l="+ l +" m ="+m); //output will be 10 and 5 because we are updating l and m with the swapped values returned from the method

    }
}

class IntWrapper{
    int value;
    IntWrapper(int value) {
        this.value = value;
    }
}


