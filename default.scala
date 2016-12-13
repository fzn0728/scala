// # Default Argument
//

object default
{
	def main(args:Array[String])
	{
		fun("First","Second")
		fun("John")
		fun()
	}
	def fun(one:String="Unknown",two:String="Unknown")
	{
		println(one+" "+two)
	}

}