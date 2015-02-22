object iterator{

	def main(args:Array[String])
	{
		val it=Iterator("a","number","of","words")
		println("Length:"+it.length)		
		while(it.hasNext){
			println(it.next())
		}
		val ita= Iterator(4,1,2,8,3)
		println("Max value:"+ita.max)
		println("Length:"+it.length)
//dude length gets changed for iterator as you iterate through it ! Also, max is not applicable for String kind iterator
	}
}
