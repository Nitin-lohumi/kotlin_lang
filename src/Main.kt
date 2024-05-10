fun main(){

    val obj = Car("lohumi");
    println(obj.brand);
    obj.trunON();
}

class Car(var Name:String)
{
    var brand:String=Name;
    var model:String=""
    var year:Int =0;
    fun trunON(){
        println("function is running ");
    }

}


