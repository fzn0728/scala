class account(ac_id:Int,name:String,balance:Double){

def this(a:Int,n:String)
{
	this(a,n,0)
}
def this(a:Int)
{
	this(a,"",0)
}
def this()
{
	this(0,"",0)
}
def show(){
	println("Name:"+name)
	println("Ac id:"+ac_id)
	println("Balance:"+balance)
}
}

object cons
{
	def main(args:Array[String])
	{
		var a=new account(12,"John",1000)
		a.show()
		var b=new account(12,"mac")
		b.show()
		var c=new account(14)
		c.show()
	}
}