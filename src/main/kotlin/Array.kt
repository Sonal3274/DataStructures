fun main() {
    var arr = arrayOf("One","Two","Three")
    var arr1 = arrayOf(1,2,3)

    for (i in arr.withIndex()){
        println(i)
    }

    for ((i, e) in arr.withIndex()){ // i = index, e = element
        println("$i - $e")
    }

    //ways of printing an array
    println(arr[0])
    println(arr.get(1))

    //Changing the value of an element
    arr.set(0, "Hello")
    println(arr.get(0))

    //Array size
    println("Display the array size:")
    println(arr.size)
    println("Accessing array element from 2nd position::")
    println(arr[2])
}