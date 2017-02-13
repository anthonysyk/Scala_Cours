// map vs flatmap

val listeSimple = List("1","2","3")

val listeInt = listeSimple.map(_.toInt)

val mapResult: List[List[String]] = listeSimple.map(x => List(x))

val flatmapResult: List[String] = listeSimple.flatMap(x => List(x))



listeInt.filter(_ > 1)

val someInt = Some(1)


val test = Some(1)

test.map{x =>
  x + 1
}.getOrElse(0)

test.map(x =>
  x + 1
).getOrElse(0)

test.fold(0)(x =>
x + 1 )



