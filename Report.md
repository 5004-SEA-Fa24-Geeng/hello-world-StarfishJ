# Homework Aloha World Report

The following report contains questions you need to answer as part of your submission for the homework assignment. 


## Design Doc
Please link your UML design file here. See resources in the assignment on how to
link an image in markdown. You may also use [mermaid] class diagrams if you prefer, if so, include the mermaid code here.  You DO NOT have to include Greeting.java as part of the diagram, just the AlohaWorld application that includes: [AlohaWorld.java], [Greeter.java], and [ConsoleView.java].


### Program Flow
The program starts in main() in AlohaWorld which then asks the client for their name and location, then it creates a Greeter object. It then creates an instance of the ConsoleView class to handle user input and output. ConsoleView acts as an intermediary between the user and the Greeter, accessing methods to retrieve names and locations as well as printing greetings. Greeter is about details about the user, such as name and locality, and provides methods to interact with that data.


## Assignment Questions

1. List three additional java syntax items you didn't know when reading the code.  (make sure to use * for the list items, see example below, the backtick marks are used to write code inline with markdown)
   
   * `static`
   * `final` 
   * `Override`

2. For each syntax additional item listed above, explain what it does in your own words and then link a resource where you figured out what it does in the references section. 

    * Use the `static` variable for the property that is common to all objects. Which means a method or variable belongs to the class itself rather than to instances of the class.[^1]
    * The `final` keyword when used on a class prevents the class from being subclassed. This means that the class cannot be extended by another class. This is useful when you want to prevent a class from being modified or extended.[^2]
    * The `Override` keyword when a subclass implements a method which is already defined in the superclass or Base Class. It allows the subclass to modify the inherited methods.

3. What does `main` do in Java? 

    `main` is where the Java Virtual Machine (JVM) starts executing the program. When you run a Java program, the JVM looks for this specific method to begin execution.

4. What does `toString()` do in Java? Why should any object class you create have a `toString()` method?

    It returns a string that typically includes the class name followed by the object's hash code in hexadecimal format. By creating a `toString` method, it can improve the usability and maintainability of the code.

5. What is javadoc style commenting? What is it used for? 

    Javadoc comments begin with /** and end with */. The comments can be placed directly above classes, methods, and fields to provide documentation for them to improve code readability and understanding.

6. Describe Test Driving Development (TDD) in your own words. 

    Start by writing and running tests before writing codes, and keep adjusting formal code according to the test result.

7. Go to the [Markdown Playground](MarkdownPlayground.md) and add at least 3 different markdown elements you learned about by reading the markdown resources listed in the document. Additionally you need to add a mermaid class diagram (of your choice does not have to follow the assignment. However, if you did use mermaid for the assignment, you can just copy that there). Add the elements into the markdown file, so that the formatting changes are reserved to that file. 


## Deeper Thinking Questions

These questions require deeper thinking of the topic. We don't expect 100% correct answers, but we encourage you to think deeply and come up with a reasonable answer. 


1. Why would we want to keep interaction with the client contained to ConsoleView?

By limiting client interaction in ConsoleView, we adhere to the principle of separation of concerns which would be easier to manage and maintain. It will also be convienient for other to read and understand the code.

2. Right now, the application isn't very dynamic in that it can be difficult to add new languages and greetings without modifying the code every time. Just thinking programmatically,  how could you make the application more dynamic? You are free to reference Geeting.java and how that could be used in your design.

We could use a Map to hold the languages and greetings, like in Greeting.java we have some edge cases when the locality name is "China", and other languages are same in the sequence of the format. We can put languages with the same format in the same group (possibly in a separate external file) and program based on the map, so that everytime we add in a new language, we don't have to touch the program.

> [!IMPORTANT]
>  After you upload the files to your github (ideally you have been committing throughout this progress / after you answer every question) - make sure to look at your completed assignment on github/in the browser! You can make sure images are showing up/formatting is correct, etc. The TAs will actually look at your assignment on github, so it is important that it is formatted correctly.

## References

[^1]: static Keyword in Java. https://www.geeksforgeeks.org/static-keyword-java/. Accessed: 2025-01-15.
[^2]: Final keyword in Java. https://www.geeksforgeeks.org/final-keyword-in-java/. Accessed: 2025-01-15.
[^3]: Overriding in Java. https://www.geeksforgeeks.org/overriding-in-java/. Accessed: 2025-01-16.

<!-- This is a comment, below this link the links in the document are placed here to make ti easier to read. This is an optional style for markdown, and often as a student you will include the links inline. for example [mermaid](https://mermaid.js.org/intro/syntax-reference.html) -->
[mermaid]: https://mermaid.js.org/intro/syntax-reference.html
[AlohaWorld.java]: src/main/java/student/AlohaWorld.java
[Greeter.java]: src/main/java/student/Greeter.java
[ConsoleView.java]: src/main/java/student/ConsoleView.java