# BookManager

## Description
This Java project defines a `Book` class that stores the title and number of pages of a book. The class includes mutator (setter) methods to set the title and number of pages, as well as accessor (getter) methods to retrieve this information. The project demonstrates basic object-oriented programming concepts, such as encapsulation and input validation.

## Author
Written by Mohammed Qutu.

## Requirements
- Java 21.0.2 or later

## Usage
To use the `Book` class, create an instance of the class and use the provided mutator methods to set the title and number of pages. The accessor methods allow you to retrieve and display this information.

### Example Usage
```java
Book myBook = new Book("The Great Gatsby", 180);
System.out.println("Title: " + myBook.getTitle());
System.out.println("Number of Pages: " + myBook.getNumberOfPages());
Methods:
setTitle(String newTitle): Sets the title of the book.
setNumberOfPages(int newNumberOfPages): Sets the number of pages, but only if the number is greater than zero. If the number is invalid, an error message is printed.
getTitle(): Returns the title of the book.
getNumberOfPages(): Returns the number of pages in the book.
License
This project is licensed under the MIT License - see the LICENSE file for details.
