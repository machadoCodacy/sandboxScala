import scala.util.{Failure, Success, Try}

Try(1/ 0) match {
  case Success(content) => "yey"
  case Failure(fail) => "nop"
}

List(1,2,3).collectFirst {
  case bla if bla > 2 => "yey"
  case blaa if blaa > 1 => "nop"
}

var nowTlsForReals = 123123

//BUM!!!
List(1,2,3).map {
  case bla if bla > 2 => "yey"
  case blaa if blaa > 1 => "nop"
}
