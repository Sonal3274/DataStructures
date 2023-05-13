fun main() {
    val linkedList = mutableListOf<String>()

    // add elements to linked list
    linkedList.add("apple")
    linkedList.add("banana")
    linkedList.add("orange")

    // print linked list
    println("Linked List: $linkedList")

    // add element at a specific position
    linkedList.add(1, "grape")

    // print linked list
    println("Linked List after adding grape at position 1: $linkedList")

    // remove an element
    linkedList.remove("banana")

    // print linked list
    println("Linked List after removing banana: $linkedList")

    // get element at a specific position
    val element = linkedList[2]

    // print the element
    println("Element at position 2: $element")

    // update an element
    linkedList[1] = "kiwi"

    // print linked list
    println("Linked List after updating element at position 1: $linkedList")
}
