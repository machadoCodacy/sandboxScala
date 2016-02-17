import scala.util.{Failure, Success, Try}


object myObject {
  def MyFuntion(bla: Int) {
    Try(1 / 0) match {
      case Success(content) => "yey"
      case Failure(fail) => "nop"
    }

    List(1, 2, 3).collectFirst {
      case bla if bla > 2 => "yey"
      case blaa if blaa > 1 => "nop"
    }

    //BUM!!!
    List(1, 2, 3).map {
      case bla if bla > 2 => "yey"
      case blaa if blaa > 1 => "nop"
    }
  }
}
