object NestedFunc {

	def main(args:Array[String]){

		println(factorial(5))

	}


	def factorial(i:Int):Int={

		def fact(i:Int , accumulator:Int):Int={

			if(i<=1)
				accumulator    //this value will be returned by both the functions, as they are nested.
			
			else
				fact(i-1 ,i*accumulator)
		}

			fact(i,1)
		}




}
