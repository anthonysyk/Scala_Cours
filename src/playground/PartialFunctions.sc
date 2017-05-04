import scala.collection.immutable.Range.Inclusive

def isOdd: PartialFunction[Int, String] = {
  case oddNumber: Int if oddNumber % 2 != 0 =>
    s"$oddNumber is odd"
}

def isEven: PartialFunction[Int, String] = {
  case evenNumber: Int if evenNumber % 2 == 0 =>
    s"$evenNumber is even"
}

val testData: Inclusive = 1 to 5

val seqData = Seq(1,2,3,4,5)

println(testData map (isOdd orElse isEven))

println(seqData map (isOdd orElse isEven))