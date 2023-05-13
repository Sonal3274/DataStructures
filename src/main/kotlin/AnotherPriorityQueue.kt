import java.util.*

fun main() {
    val priorityQueue = PriorityQueue<Pair<Int, String>>(Comparator.comparingInt { it.first })
    /*
    This line of code creates a new PriorityQueue instance called priorityQueue, with a parameterized type of Pair<Int, String>.
    It also sets a custom Comparator for the priority queue that compares the Int values of the pairs.
    The Comparator.comparingInt() method is used to create a Comparator object that compares the first element of each Pair object.
    The pair with the smallest Int value will be the first element in the queue, and subsequent pairs will be ordered in ascending order based on their Int values.
    */

    priorityQueue.add(1 to "Dog")
    priorityQueue.add(2 to "Cat")
    priorityQueue.add(2 to "Bird")
    priorityQueue.add(3 to "Fish")
    priorityQueue.add(4 to "Elephant")
    priorityQueue.add(4 to "Giraffe")

    println("Priority queue: $priorityQueue")

    val removedElement = priorityQueue.poll()
    println("Removed element: $removedElement")

    println("Priority queue after removal: $priorityQueue")
}
