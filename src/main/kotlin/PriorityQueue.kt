import java.util.*

fun main() {
    val priorityQueue = PriorityQueue<String>()
    priorityQueue.add("Dog")
    priorityQueue.add("Cat")
    priorityQueue.add("Bird")
    priorityQueue.add("Fish")
    priorityQueue.add("Elephant")

    println("Priority queue: $priorityQueue")

    val sortedList = priorityQueue.toList().sortedBy { it } /* The toList() function is used to convert the priorityQueue to a list,
    and the sortedBy() function is used to sort the list in alphabetical order.
    The sorted list is then printed.*/
    println("Sorted list: $sortedList")

    val removedElement = priorityQueue.poll() /* The poll() function is used to remove the highest-priority element from the priorityQueue,
    which is "Bird" because it is the first element in alphabetical order.
    The removed element is then printed.*/
    println("Removed element: $removedElement")

    println("Priority queue after removal: $priorityQueue")
}
