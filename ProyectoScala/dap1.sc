import scala.collection.mutable.ListMap
import scala.collection.immutable.List

object dap1 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
	val lista = List(1,2,3,4)                 //> lista  : List[Int] = List(1, 2, 3, 4)
  val set = Set(1,2,3,4,5,1)                      //> set  : scala.collection.immutable.Set[Int] = Set(5, 1, 2, 3, 4)
	val mapa =Map(1 -> "David", 2 -> "Parra") //> mapa  : scala.collection.immutable.Map[Int,String] = Map(1 -> David, 2 -> Pa
                                                  //| rra)
  lista.map { x => x+3}                           //> res0: List[Int] = List(4, 5, 6, 7)
	lista                                     //> res1: List[Int] = List(1, 2, 3, 4)
	lista.filter{x => x<3}                    //> res2: List[Int] = List(1, 2)
		val names = List("a","b")         //> names  : List[String] = List(a, b)
	names.map{_.length()}                     //> res3: List[Int] = List(1, 1)
	
	//kata 1 -----> encontrar pares
	val pares = List.range(1, 20)             //> pares  : List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15,
                                                  //|  16, 17, 18, 19)
	pares.filter{_%2 ==0}                     //> res4: List[Int] = List(2, 4, 6, 8, 10, 12, 14, 16, 18)

	
	//kata 2 -----> encontrar los datos de una persona
	val megaLista=List(List("Melisa","17 years","female"),List("Sara","23 years","female"))
                                                  //> megaLista  : List[List[String]] = List(List(Melisa, 17 years, female), List(
                                                  //| Sara, 23 years, female))
      megaLista.filter{x=> x(0)=="Sara"}          //> res5: List[List[String]] = List(List(Sara, 23 years, female))
	
	//kata 3 -----> encontrar los numeros primos de una lista
	val numeros=List.range(1, 20)             //> numeros  : List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 1
                                                  //| 5, 16, 17, 18, 19)
		
		numeros.filter{x => numeros.filter{y => y<= Math.sqrt(x)}.filter{z => x%z == 0}.length ==1}
                                                  //> res6: List[Int] = List(1, 2, 3, 5, 7, 11, 13, 17, 19)
	
	
		}