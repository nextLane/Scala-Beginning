object DefaultParams{

	def main(args:Array[String])
	{

		println(defMethod())

	}

	def defMethod(a:Int=5 , b:Int=7):Int={

		return a+b;


	}


}
