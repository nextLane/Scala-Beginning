object FuncLiteralsCurrying
{


	def main(args:Array[String])
	{
		var mul= (x:Int , y:Int) => x*y  //function literal
                                                 //Anonymous function
		println(mul(2,3))
		
		val str1:String="Heyya !"
		val str2:String="Cool language Scala!"
		println("concatention results in:"+strcat(str1)(str2))
        }

   def strcat(s1: String)(s2: String)={
      s1 + s2
   }
}

 











