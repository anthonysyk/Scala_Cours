val list = List(1,2,3,4)

//ReduceLeft : ne fonctionne pas sur des listes vides

def sum(xs: List[Int]) = (0 :: xs) reduceLeft ((acc, right) => acc + right)
def product(xs: List[Int]) = (1 :: xs) reduceLeft (_ * _)

sum(list)
product(list)

// FoldLeft : prend un accumulateur en paramètre en plus de ReduceLeft

def sumFold(xs: List[Int]) = xs.foldLeft(0)((acc, right) => acc + right)
def productFold(xs: List[Int]) = xs.foldLeft(1)(_ * _)

sumFold(list)
productFold(list)

// FoldRight et ReduceRight : même chose que Left mais on commence par la droite
// x.foldRight(z)(acc, left) acc est initialisé comme le dernier élément de la liste
// et z sera le dernier élément sur lequel on effectuera l'opération avec l'accumulateur


// Exemple ou foldRight > foldLeft : concaténation de listes (liste se termine par Nil donc une liste à l'inverse, ce n'est plus une liste)

