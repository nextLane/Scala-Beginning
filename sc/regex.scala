import scala.util.matching.Regex

object regex{
	def main(args:Array[String]){

		val pattern =new Regex ("(S|s)cala")
		val str="Scala  is scalable and cool"

		println((pattern findAllIn str).mkString(" "))

		val pattern1 = new Regex("abl[ae]\\d+")
      val str1 = "ablaw is able1 and cool ablae"
      
      println((pattern1 findAllIn str1).mkString(","))
	}
}
