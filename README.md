## Building and Running 

*gradle is required for compilation: use following from root directory*

-> to build, use: gradle build 

-> to run, use: gradle run --args="fileName".txt
   * for instance: gradle run --args=storeInput.txt
-> or, use gradle run.

-> to test, use: gradle test

## General Problem/Solution

-> Being able to add and search Products of Book or Electronics type with no hassle.

## Assumptions/Limitations

-> The program expects the input.txt and output.txt files to be located in the gradle root directory (i.e, the folder with build, src, README.md, etc).
    Essentially the directory in which this README.md is in.

-> The inputFile should not have duplicate productIDs and all attributes of respective object must be provided.

-> The program expects numerical values for productID, year(s) and price prompts.

-> All prompts will be answered reasonably appropriately, such as for book = b, BOOK (case-insensitive).

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

-> The TextArea prints "***" to indicate the end of one "search" event (i.e. after every product, exception, etc.)
