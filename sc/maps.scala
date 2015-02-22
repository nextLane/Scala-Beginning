object maps{

	def main(args:Array[String])
	{
		val colors=Map("red" -> "#FF0000", "azure"-> "#FOFFFF", "peru" -> "#CD853F")

	colors.keys.foreach{ i =>
		print ("Key ="+i)
		println(" Value ="+colors(i))

		}

		println("using contains:")
		if( colors.contains( "red" )){
           println("Red key exists with value :"  + colors("red"))
      }else{
           println("Red key does not exist")
      }
	

	}

}
