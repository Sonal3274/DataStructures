fun main() {
    val list = listOf("Apple", "Banana", "Cherry")
    println("Initial list: $list")

    val newList = list + "Durian"
    println("Modified list: $newList")

    // original list is not changed
    println("Original list after modification: $list")
}
/*
* In this example, we start with an immutable list list containing three elements.
* We then create a new list newList by adding an element to list. We use the + operator to create the new list,
* which returns a new list that is a copy of the original list with the additional element added.
* Since the original list is immutable, it is not modified by the addition.
* We then print out the original list to show that it has not changed.
*/