object loop{

	def main(args:Array[String]){

	System.out.println("I will print table of 2 till five:")
	var i=1;
	for(i <-1 to 5)
	{
		System.out.println("2 x"+i+"="+2*i);
	}
for( a <- 1 to 3; b <- 1 to 3){
         println( "Value of a: " + a );
         println( "Value of b: " + b );
      }

      var a = 0;
      val numList = List(1,2,3,4,5,6);
	System.out.println("*** Iterating through List ***")
      // for loop execution with a collection
      for( a <- numList if a != 3; if a < 8)  //conditioned if else 
      {
         println( "Value of a: " + a );
      }
     //example of yielding
	System.out.println("Yielding value:")
	var retVal = for(v <- numList if v>2 ) yield v
		for(d <- retVal){
		println("Yielded values from list: "+d);	
	}
  


}



}
