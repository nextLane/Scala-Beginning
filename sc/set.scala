object set{

	def main(args:Array[String]){
		
		var s:Set[String] =Set("Ahana","Suhana","Ruchi")
		var t:Set[String]=Set("Pooja", "Ruchi")

		var combo= s ++ t
		println(combo)
		println( "Min element in Set: " + combo.min )
      println( "Max element in Set: " + combo.max )
               //not applicable for mixed datatypes
		//for strings it's according to ASCII values of characters used in String

		//common values in two sets
		println(s.intersect(t))

		

		//mapping, sorting, intersetionc, union, to Array, toString, sum , tail, subsetOf etc there are several functions that pre-exists, keep a note before starting coding, view the function list http://www.tutorialspoint.com/scala/scala_sets.htm

	}
}
