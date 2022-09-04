

//Basic FizzBuzz Java Solution
//Uses simple OOP and methods

public class Main {

public static int [] testArray = new int[101];  //Public array


    public void loadArray(){        //Create array of 100 values to check for fizzbuzz

        for (int i=0;i<100;i++){
            testArray[i] =i;
        }
    }

    public void fizzBuzz(){             //Checks array values using modulo

        for(int j=1;j< testArray.length;j++)
        {
           if(testArray[j] % 3 ==0 && testArray[j] %5 ==0){     //Multiples of 3 and 5
               System.out.println("FizzBuzz");
           }
           else if(testArray[j] % 3 ==0){       //Multiples of 3
               System.out.println("Fizz");
           }
           else if(testArray[j] % 5 ==0){       //Multiples of 5
               System.out.println("Buzz");
           }
           else {
               System.out.println(testArray[j]);        //Multiples of none
           }
        }
    }

    public void driver(){       //Driver Method
        loadArray();
        fizzBuzz();
    }

    public static void main(String[] args)
    {
        Main mainObj = new Main();
        mainObj.driver();
    }
}