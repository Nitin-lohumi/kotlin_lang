

fun main() {

}

//import  kotlin.math.PI;
//fun toSeconds(time: String): (Int,Int) -> Int = when (time) {
//    "hour" -> { v1,v2 -> v1 *v2}
//    else -> { v1,v2-> v1+v2 }
//}


//    val timesInMinutes = listOf(2, 10, 15, 1)
//    val min2sec = toSeconds("cas");
//    println(min2sec(2,3));
//    val totalTimeInSeconds = timesInMinutes.map({x:Int-> min2sec(x,x)}).sum()
//    println("Total time is $totalTimeInSeconds secs");


//println("Enter the name  ");
//val name:String = readln();
//    println("you Enter here is "+ name);
//    name.replace("nitinlohumi","lohuminitinlohumi").let{
//        println("your name contains ${it.length} letters ");
//        println("your name contains ${it.countDistinctCharacters()} unique charchters");
//    }

//fun String.countDistinctCharacters()  = lowercase().toList().distinct().count();

//fun ShowThetype(mayString:String?):String{
//      if(mayString!=null&&mayString.length>0){
//          return "the stirng is not null " +mayString;
//      }
//    else {
//        return "this string is returning null value";
//      }
//}

// var String_val:String? ="this is nitin lohumi";
//        println(ShowThetype(String_val));
//var name: String?= "this is a string but it can be null ";
//    name =null;
//    println("name is "+ name);
//if you asinged ? mark after datatype of variable then you
// could be asigned the variable to be null variable
//    val list = listOf(1,2,-3,4,-5,6,-7,8,-9);
//    val positive = list.filter { x:Int->x>0};
//    val negative = list.filter { x:Int ->x<0};
//    println("the positive number is $positive" );
//    println("the negative number is $negative");
//fun second(t:String): (Int) -> Unit = {
//    val a = {v:String-> v+ "hello"};
//    println(a);
//    println(t);
//}
//open public class vichile {
//    fun m():Boolean{
//        println("hello this is vichile from super class");
//        return true;
//    }
//}
//class Car(var Name:String):vichile()
//{
//    var brand:String=Name;
//    val model:String="asc";
//    var year:Int = 0;
//    fun trunON(){
//        println("function is running ");
//    }
//}
//    val cakes = listOf("cake","as","ash");
//    val num =10;
//    for(number in cakes){
//        println(number);
//    }
//    val  arr = arrayOf("nitin","shubham");
//    if(num==10){
//        println("yes it is");
//    }
//    val arr = arrayOf("nitin ","shubham","nirmal ","mayank");
//    var i=-1;
//    for( number:String in arr){
//        i++;
//        when(i) {
//            0 -> println("hey this in nitin")
//            1 -> println("this is shubham")
//            else -> println("this is invalid action" )
//        }
//    };
//for(number: in 10 downTo 1 step 1){
//     println("the 10 is less  then $number" );
// }
//fun sum(x:Int ,y:Int){
//    val sum = x+y;
//    println("the sum of the number is $sum");
//}
//fun FunStirngPara(str1:String,str2:String,str3:String="is good"):String{
//    val str:String= str1 + " " + str2 + " "+ str3;
//    return str;
//}
//**** these are example and they are inside the main f