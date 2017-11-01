1. What is the purpose of the various auxiliary methods populateList, populateFifoList, and ReverseLines.printReverse?
- private void populateList to perform the recursion method and take an argument from the node and perform a function on it.
- private void populateFifoList to perform recursion method to perform the recursion method and take an argument from the node and perform a function on it.
- ReservesLine.printReverse to perform recursion method to perform the recursion method and take an argument from the node and perform a function on it.
2. Why do these methods need to have arguments, and how does the argument change from one recursive call to the next?
- private void populateList: the method checks if the arguments is null, if it not null it performs the function and recalls the next argument by calling the method within the method.
- private void populateFifoList: the method checks if the arguments is null, if it not null it performs the function and recalls the next argument by calling the method within the method.
- ReservesLine.printReverse: the method checks if the arguments is null, if it not null it performs the function and recalls the next argument by calling the method within the method.
 3. What are the time and space complexity of each of the populateList populateFifoList methods, as well as ReverseLines.printReverse?
- private void populateList O(n)
- private void populateFifoList O(n)
- ReservesLine.printReverse O(n)
 4. Which of these methods can be implemented using while loops?
- private void populateList yes
- private void populateFifoList yes
- ReservesLine.printReverse possibly