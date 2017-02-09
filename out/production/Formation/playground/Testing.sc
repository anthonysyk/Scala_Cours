val list = List(None, None, Some("user"), None)

val result = list.fold[Option[String]](None)((x,y) => if(x.isDefined) x else y)

result



