import Array._
object Arrays{

	def main(args:Array[String]){

	//var arr:Array[String] = new Array[String](3);
	var arr= new Array[String](2);
	
        arr(0)="Aditi"
	arr(1)="Kriti"	
       for(x <- arr)
	{
	//	println(x);
	}
	// multi-dimensional array
	
   var myMatrix =ofDim[Int](3,3)
   for(i<-0 to 2){
	for(j<-0 to 2){
		myMatrix(i)(j)=i;
	 // print(" "+myMatrix(i)(j))
        }
	//println()	
}
  var list= concat(arr, arr)
    for(x <- list)
	println(x)

	//creating array using range
	var ml= range(1,11,2)
	for(x<- ml)	
		println(x)

	}



  

}
