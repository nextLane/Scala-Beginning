object Collections{

	def main(args:Array[String])
	{
		//using lists
		//resemble arrays but lists are immutable and more of a linked list rather than being flat like array
		
		val fruit1 : List[String] = List("apples","bananas","oranges")
		val empty1: List[Nothing]= List()
		
		val dim1 : List[List[Int]]= List(List(1,0,0),List(0,1,0),List(0,0,1))

		val flowers="rose"::("lotus"::("marigold"::Nil))
		//Nil and cons form:
		val empty =Nil
		val fruit ="apples"::("oranges"::("pears"::Nil))
		val dim =(1::(0::(0::Nil)))::(0::(1::(0::Nil)))::(0::(0::(1::Nil)))::Nil
		val list= flowers:::fruit
               //basic functions with list
		println("Head of fruit:"+fruit.head +"\n Tail of fruit:"+ fruit.tail+" \n Isempty:"+fruit.isEmpty )

		println("concatenated list:")
		println(list)
            
		val favfruit= List.fill(5)("mango");
		println("using fill method:"+ favfruit);


		// tabulate feature of list
		val squares = List.tabulate(6)(n => n*n)
		println("squares:"+squares)

		val mul= List.tabulate(4,5)(_*_)
		println("mul:"+mul)

		//reversing a list
		println("reversed list:" +fruit.reverse)
		println("non-reversed list:"+fruit)
		
	}

}
