import java.io._

class Point(val xc: Int, val yc:Int){
	var x:Int =xc
	var y: Int=yc
	def move(dx:Int, dy:Int){
		x=x+dx
		y=y+dy
		println("Point x location:"+x)
		println("Point y location:"+y)

	}

}

class Location (override val xc:Int, override val yc:Int, val zc:Int) extends Point(xc,yc){

	var z:Int=zc
	def move(dx:Int, dy:Int, dz:Int){

		x=x+dx
		y=y+dy
		z=z+dz
		println("x:"+x)
		println("y:"+y)
		println("z:"+z)



	}
}

object ClassObj{
	def main(args:Array[String]){

	val  loc=new Location(10,20,15);
	loc.move(10,10,5);

// if file name and object name is not some, no compile time error but runtime error comes in Scala
	}


}

