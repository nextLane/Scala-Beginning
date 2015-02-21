import java.util.Date;

object PartialFunc{


	def main(args:Array[String])
	{
		val date= new Date
		val logWithDateBound = log(_:String,date,_:String)
		logWithDateBound("first","message 1")
		Thread.sleep(1000)
		logWithDateBound("second","message 2")
		Thread.sleep(1000)
		logWithDateBound("third", "message 3")
				
	}


	def log (time:String , date:Date, message:String) ={
		println(time+"---"+date+"----"+message)


	} 




}
