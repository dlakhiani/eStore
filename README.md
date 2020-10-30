## General Problem/Solution

-> Being able to add and search items of Book or Electronics type with no hassle.

## Assumptions/Limitations

-> The program expects numerical values for productID, year(s) and price prompts.

-> all prompts will be answered reasonably appropriately, such as for book = b, BOOK (case-insensitive).

## User Guide

1) The program will begin with a prompt, asking the user for 3 inputs: add, search or quit.
  a) If there are no items currently saved in the program, the program will return a statement saying just that.

2) Choosing add: the program will prompt the user to enter the kind of item they would like to add - Book or Electronics.

3) After selecting the kind of item the user would like to add, the program will prompt the user to enter a minimum of 3 fields -
the productID, the description, and the year (on separate lines).
  a) For Books, there are 3 extra fields that can be entered after the first 3 - price, authors, and publisher (on separate lines).
  b) For Electronics, there are 2 extra fields that can be entered - price and maker (on separate lines).

4) Choosing search: the program will prompt the user to enter the 3 fields mentioned before to search for the item in either
Book or Electronics - the productID, the description, and the year (on separate lines).
  a) The input can be left blank as needed.
  
5) Depending on the user input, the program will output the items matching the specifications mentioned by the user.
  a) If all input prompts are left blank, the program will output all items in the store.
  
6) After adding/searching the kind of item, the user will be returned to the first prompt.

-> The user can build on the program by recommending features like size of a Book, color of an Electronics product, etc.
Also, recommending more kinds of items like: stationery, watches, etc.

## Test Plan

# Book

1) Testing setters and getters for all instance variables by setting their values and using an assertEquals in tandem with the getter to compare.

2) Testing toString() by setting the instance variables of a Book object and using assertEquals to compare expected and actual results with toString().

3) Testing equals() by setting the instance variables of 2 Book objects and using assertEquals to compare expected and actual results with equals().

# Electronics

1) Testing setters and getters for all instance variables by setting their values and using an assertEquals in tandem with the getter to compare.

2) Testing toString() by setting the instance variables of an Electronics object and using assertEquals to compare expected and actual results with toString().

3) Testing equals() by setting the instance variables of 2 Electronics objects and using assertEquals to compare expected and actual results with equals().

# EStoreSearch

1) Testing compareID() by creating a Book and Electronics ArrayList with a single object of respective type,
compare their productIDs using compareID(), and then use assertTrue to check if the return value of compareID() is true.

2) Testing emptyString() by creating an empty String, plugging it into emptyString(), and using assertTrue to check if the return value of emptyString() is true.

3) Testing isOfLength() by creating a String of length 4, plugging it into isOfLength(), and then use assertTrue to check if the return value of isOfLength() is true.

4) Testing hyphenAtEnd() by creating a String that contains a year and a hyphen at the end, plugging it into hyphenAtEnd(),
and then use assertTrue to check if the return value of hyphenAtEnd() is true.

5) Testing printAllItems() by creating a Book and Electronics ArrayList with a single object of respective type,
and then use assertEquals to check if the return value of printAllItems() is 1, meaning that the ArrayLists were printed to stdout.

6) Testing searchID() by creating a Book and Electronics ArrayList with a single object of respective type and a productID integer,
and then use assertEquals to check if the return value of searchID() is 1, meaning that the ArrayLists have found the productID in
either a Book/Electronics object and have printed to stdout.

7) Testing searchDesc() by creating a Book and Electronics ArrayList with a single object of respective type and a description String,
and then use assertEquals to check if the return value of searchDesc() is 1, meaning that the ArrayLists have found the description in
either a Book/Electronics object and have printed to stdout.

8) Testing searchTime() by creating a Book and Electronics ArrayList with a single object of respective type and 2 integers indicating
the start and end years of the time period. Then use assertEquals to check if the return value of searchTime() is 1, meaning that the ArrayLists
have found a year within the time period in either a Book/Electronics object and have printed to stdout.

9) Testing searchDescAndTime() by creating a Book and Electronics ArrayList with a single object of respective type, a description String
and 2 integers indicating the start and end years of the time period. Then use assertEquals to check if the return value of searchDescAndTime() is 1,
meaning that the ArrayLists have found the description in either a Book/Electronics object that is within the time period, and have printed to stdout.

10) Testing searchIDAndTime() by creating a Book and Electronics ArrayList with a single object of respective type, a productID integer
and 2 integers indicating the start and end years of the time period. Then use assertEquals to check if the return value of searchIDAndTime() is 1,
meaning that the ArrayLists have found the productID in either a Book/Electronics object that is within the time period, and have printed to stdout.

11) Testing searchIDAndDesc() by creating a Book and Electronics ArrayList with a single object of respective type, a description String and a productID integer.
Then use assertEquals to check if the return value of searchIDAndDesc() is 1, meaning that the ArrayLists have found the description and productID in
either a Book/Electronics object and have printed to stdout.

12) Testing searchSpecific() by creating a Book and Electronics ArrayList with a single object of respective type, a description String, a productID integer
and 2 integers indicating the start and end years of the time period. Then use assertEquals to check if the return value of searchSpecific() is 1,
meaning that the ArrayLists have found the description and the productID in either a Book/Electronics object that is within the time period, and have printed to stdout.

## Improvements

-> Encapsulate a majority of logic solving procedures to a method outside of main().

-> Check for letters in user input for numerical prompts, such as year, price, etc.
