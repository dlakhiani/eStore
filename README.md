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

## Improvements

-> Encapsulate a majority of logic solving procedures to a method outside of main().

-> Check for letters in user input for numerical prompts, such as year, price, etc.
