import scala.collection.mutable.ListMap
import scala.collection.immutable.List

object dap1 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(137); 
  println("Welcome to the Scala worksheet");$skip(27); 
	val lista = List(1,2,3,4);System.out.println("""lista  : List[Int] = """ + $show(lista ));$skip(29); 
  val set = Set(1,2,3,4,5,1);System.out.println("""set  : scala.collection.immutable.Set[Int] = """ + $show(set ));$skip(43); 
	val mapa =Map(1 -> "David", 2 -> "Parra");System.out.println("""mapa  : scala.collection.immutable.Map[Int,String] = """ + $show(mapa ));$skip(24); val res$0 = 
  lista.map { x => x+3};System.out.println("""res0: List[Int] = """ + $show(res$0));$skip(7); val res$1 = 
	lista;System.out.println("""res1: List[Int] = """ + $show(res$1));$skip(24); val res$2 = 
	lista.filter{x => x<3};System.out.println("""res2: List[Int] = """ + $show(res$2));$skip(28); 
		val names = List("a","b");System.out.println("""names  : List[String] = """ + $show(names ));$skip(23); val res$3 = 
	names.map{_.length()};System.out.println("""res3: List[Int] = """ + $show(res$3));$skip(66); 
	
	//kata 1 -----> encontrar pares
	val pares = List.range(1, 20);System.out.println("""pares  : List[Int] = """ + $show(pares ));$skip(23); val res$4 = 
	pares.filter{_%2 ==0};System.out.println("""res4: List[Int] = """ + $show(res$4));$skip(144); 

	
	//kata 2 -----> encontrar los datos de una persona
	val megaLista=List(List("Melisa","17 years","female"),List("Sara","23 years","female"));System.out.println("""megaLista  : List[List[String]] = """ + $show(megaLista ));$skip(41); val res$5 = 
      megaLista.filter{x=> x(0)=="Sara"};System.out.println("""res5: List[List[String]] = """ + $show(res$5));$skip(92); 
	
	//kata 3 -----> encontrar los numeros primos de una lista
	val numeros=List.range(1, 20);System.out.println("""numeros  : List[Int] = """ + $show(numeros ));$skip(97); val res$6 = 
		
		numeros.filter{x => numeros.filter{y => y<= Math.sqrt(x)}.filter{z => x%z == 0}.length ==1};System.out.println("""res6: List[Int] = """ + $show(res$6))}
	
	
		}
