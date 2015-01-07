import java.util.*;
import java.io.*;
public class MakeChangeSolution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */

//      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 //     String input;
 //    input=br.readLine();
//      int x = parseInt(input);
// System.out.println("Enter money here : ");


        Scanner money = new Scanner(System.in);
        float x = money.nextFloat();
     x*=100;

      int quater, dime , nickel,penny;
      int hundred, fifty, twenty, ten,five,dollar;

      hundred = (int)x/10000 ;
      if(hundred>0){
        System.out.print(hundred+ " Hundreds, ");}
     x -= hundred*10000;

     fifty = (int)x/5000 ;
     if(fifty>0){
       System.out.print(fifty+ " Fifties, ");}
    x -= fifty*5000;

    twenty = (int)x/2000 ;
    if(twenty>0){
      System.out.print(twenty+ " Twenties, ");}
   x -= twenty*2000;

   ten = (int)x/1000 ;
   if(ten>0){
     System.out.print(ten+ " Tens, ");}
  x -= ten*1000;


  five = (int)x/500 ;
  if(five>0){
    System.out.print(five+ " Fives, ");}
 x -= five*500;

 dollar = (int)x/100 ;
 if(dollar>0){
   System.out.print(dollar+ " Dollars, ");}
x -= dollar*100;










      quater = (int)x/25 ;
      if(quater>0){
        System.out.print(quater+ " Quarters, ");}
     x -= quater*25;

       dime =(int)x/10 ;
      if(dime>0){
      System.out.print(dime+ " Dimes, ");}
     x -= dime*10;

      nickel =(int)x/5 ;
      if(nickel>0){
        System.out.print(nickel+ " Nickels, ");}
     x -= nickel*5;

      penny = (int)x/1 ;
      if(penny>0){
        System.out.print(penny+ " Pennies");}
     x -= penny*1;



    }
}




//
//var cash = 35;
//var coins = [15, 10, 5, 1];
//var change = {};
//for(var i=0; i<coins.length; i++){
//  change[coins[i]]  = Math.floor(cash/coins[i]);
//  cash %= coins[i];
//}
////change now contains:
////15:2, 10:0, 5:1, 1:0
//







//function coin_change ($amount, $coins)
//{
//  $change = array();
//  rsort($coins);
//  for($i=0; $i<count($coins); $i++) {
//    $change[$coins[$i]] = floor($amount/$coins[$i]);
//    $amount = $amount % $coins[$i];
//  }
//  return $change;
//}

