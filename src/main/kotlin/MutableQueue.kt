class MutableQueue{
    val queueArray = mutableListOf<Int>()

    fun enque(item: Int){
        queueArray.add(item)
    }

    fun deque() : Int? {
        if (queueArray.isEmpty()){
            return null
        }
        return queueArray.removeFirst()
    }

    fun peek() : Int? {
        if (queueArray.isEmpty()){
            return null
        }
        return queueArray[0]
    }

    fun printQueue(){
        for (i in queueArray){
            println(i)
        }
    }

}

fun main() {
    val queue = MutableQueue()
    queue.enque(3)
    queue.enque(5)
    queue.enque(2)
    queue.enque(1)

    println("Array after adding elements:")
    queue.printQueue()

    val removedItem=queue.deque()
    println("After removing first element")
    println("Dequed item: $removedItem")


    val peekedItem =  queue.peek()
    println("Peeked item: $peekedItem")
}