class Stack {
    private val stackArray = mutableListOf<Int>()

    fun push(item: Int) {
        stackArray.add(item)
    }

    fun pop(): Int? {
        if (stackArray.isEmpty()) {
            return null
        }
        return stackArray.removeAt(stackArray.size - 1)
    }

    fun peek(): Int? {
        if (stackArray.isEmpty()) {
            return null
        }
        return stackArray[stackArray.size - 1]
    }

    fun printStack() {
        for (i in stackArray.size - 1 downTo 0) {
            println(stackArray[i])
        }
    }
}

fun main() {
    val stack = Stack()

    stack.push(1)
    stack.push(2)
    stack.push(3)

    println("Printing stack after pushing 3 items:")
    stack.printStack()

    val poppedItem = stack.pop()
    println("Popped item: $poppedItem")

    println("Printing stack after popping an item:")
    stack.printStack()

    val peekedItem = stack.peek()
    println("Peeked item: $peekedItem")

    println("Printing stack after peeking:")
    stack.printStack()
}
