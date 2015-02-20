object callNyNamefunc{

	def main(args:Array[String]){

		delayed(time());


	}

	def time():Long={

		println("Nanoseconds:")
		return System.nanoTime


	}
	
	def delayed(t: => Long)={
		println("Delayed method:");
		println("Param:"+ t)
                t

	}




}
