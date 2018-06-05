# What is a Stack

<p align="center">
    <img src="https://user-images.githubusercontent.com/29547780/40884595-734be24a-670e-11e8-94ef-f57a402d764e.png">
</p>

* Represents an ordered pile of some kind of data (e.g. A deck of cards).
* Each card represents an element or a piece of data.
* There is an order to how data enters and leaves the data structure. 
* _LIFO_ = Last In, First Out. So when someone placed the _Queen of hearts_, it was the last
card in the deck. However, if someone wants remove a card from the deck, they would have to 
remove the first card at the top of the deck/stack which is the _Queen of hearts_.

### Push and Pop
* There are terms used within the _Stack_ data structure:
    * _Push_ -> To place an element at the _end/top_ of the stack.
    * Pop -> To remove an element at the _end/top_ of the stack.
### Big O of a Stack
* Push -> O(1).
* Pop -> O(1).
* Search -> O(n), since you have to go through each element one by one until you find the right element.
* Access -> O(n), performs a search and then alters your data structure as it will _pop_ all elements before the accessed element.
