object varArgs{


	def main(args:Array[String])
	{

		printStrings("Scala=","Java","+Python");

	}

	def printStrings(args:String *)= {
		var i: Int =0;
		for(arg <- args){
			println("Arg Value["+i+"]="+arg);
			i=i+1



	}



	}



}
