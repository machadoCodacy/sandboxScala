/**
 * Created by maxadoj on 13-07-2015.
 */
object Program {
  def main(args: Array[String]) {
    println("Hello, world!")

    //var? no no no!
    var variavel1 = 42;
 
    var variavel2 = 43
    
    val variavelBla = variavel1 + variavel2

    println(variavel1)

    println(variavel2)

    println(variavelBla)

    println("Bye!")
  }

  def method1: Unit = {

  }

  def holySub_: (x: Int, y:Int): Int = {x - y }
}


  case class MyBag(myValue: Int) { def holy$colon(y: MyBag): Int = {  myValue - y.myValue  }}
