fun main(){
val arr = arrayOf("hello","nitin");
    arr[1]="lohumi";
    println(arr[1]);
    println(arr.size)
    if("helo " in arr){
        println("good");

    }
    else{
        println("not good");
    }
    for(x in arr){
        println(x);
    }
    for (nums in 5..15) {
        println(nums)
    }
    for(n in 'a' ..'z'){
        println(n);
    }
}

