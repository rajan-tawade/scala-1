val list1 = List(("apple",List(100),"Banana"),("apple",List(200),"Banana"),("apple",List(300),"Banana"))

var list_int: List[Int] = Nil
var list_str: List[String] = List()
def func3(x: (String, List[Int], String))={
      val list2 = x.productIterator.map(k=>k).toList
      list2
}

def func4(k: List[Any]): Unit ={
      //println(k(0))
      for ( i <- k.indices){
            if ( k(i).isInstanceOf[List[Int]]){
                  //println(k(i).asInstanceOf[List[Int]])
                  val l2 = k(i).asInstanceOf[List[Int]](0)
                  //println(l2)
                  list_int = l2 :: list_int
            }else {
                  //println(k(i).getClass)
                  list_str = k(i).toString :: list_str 
            }
      }
      //println(list_int)
      //println(list_str)
      
      val list_final =  list_int :: list_str
      println(list_final)
}


//val hmap = list1.flatMap(x => func3(x)).distinct.groupBy(_.isInstanceOf[List[Int]])
val list3 = list1.flatMap(x => func3(x)).distinct
//val list3 = list1.map(x => func3(x)).flatten
println(list3)
func4(list3)
