package customTests

import cucumber.api.scala.{FR, ScalaDsl}
import org.scalatest.Matchers._
import scala.collection.mutable.{Map => MutableMap}

class MultiplicationFRSteps extends ScalaDsl with FR {

  val vars = MutableMap[String,Int]()
  var result = 0

  Soit("""^une variable ([a-z]+) ayant pour valeur (\d+)$"""){ (varName:String, value:Int) =>
    vars += varName -> value
  }
  Lorsque("""^je multiplie ([a-z]+) \* ([a-z]+)$"""){ (var1:String, var2:String) =>
    result = vars(var1) * vars(var2)
  }
  Alors("""^j'obtiens (\d+)$"""){ (expectedResult:Int) =>
    assert(result === expectedResult)
  }
}
