/**
Problem 7
By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

What is the 10 001st prime number?
*/

class Problem7{
  public static void main (String[] args){

    int count = 0; 
    int i;
    for(i = 2; ; i++){ 
        if (count == 10001) {
            break;
        }
        for(int j = 2; j <= i; j++){
            if(j == i){
                count++;
                System.out.println(count + ". " + i);
            }
            if(i % j == 0){
                break;
            }
         }
     }

  }
}