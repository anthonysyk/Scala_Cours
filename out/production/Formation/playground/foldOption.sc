case class Person(
                 name: Option[String],
                 age: Option[Int]
                 )

val Person1 = Person(Some("Alan WAKE"), Some(21))

val Person2 = Person(None, None)

def identify(person: Option[Person]): Unit = person match {
  case None => println("no one to identify")
  case Some(person) =>
    person.name.fold(println("identity : John DOE"))(name => println(s"indentity : $name"))
}

identify(None)
identify(Some(Person1))
identify(Some(Person2))

