/*
 * Book Subclass (of Product): holds attributes of authors and publisher.
 * @author Dhruv Lakhiani
 */
package eStoreSearch;

public class Book extends Product {
  private static final long serialVersionUID = 1L;
  //Declarations
  private String authors;
  private String publisher;
    
  /**
  * This method returns the Book's authors
  * @return String: authors is a String.
  */
  public String getAuthors() {
     return authors;
  }
  
  /**
  * This method returns the Book's publisher
  * @return String: publisher is a String.
  */
  public String getPublisher() {
     return publisher;
  }

  //setters  
  /**
  * This method sets the authors of the Book.
  * @param a is the authors String
  * @return boolean: the String is accepted = true.
  */
  public boolean setAuthors(String a) {
    if (a.equals("")) {
      authors = null;
    }
    authors = a;
    return true;
  }
  
  /**
  * This method sets the publisher of the Book.
  * @param pub is the publisher String
  * @return boolean: the String is accepted = true.
  */
  public boolean setPublisher(String pub) {
    if (pub.equals("")) {
      publisher = null;
    }
    publisher = pub;
    return true;
  }
  
  /**
   * Is a copy constructor for Book given
   * @param b is the Book being copied
   * @throws Exception
   */
  public Book(Book b) throws Exception {
    this(b.getProductID(), b.getDesc(), b.getPrice(), b.getYear(), b.authors, b.publisher);
  }

  /**
  * This method creates a Book object.
  */
  public Book() throws Exception {
    this( 0, "", 0.0f, "1000", null, null);
  }

  public Book( int newProductID, String newDesc, Float newPrice, String newYear,
               String newAuthors, String newPublisher) throws Exception {
    super(newProductID, newDesc, newPrice, newYear);
    authors = newAuthors;
    publisher = newPublisher;
  }
  
  /**
  * This method prints the instance variables of the Book.
  * @return String: all instance variables of the Book are concatenated to String.
  */
  @Override
  public String toString() {
    return super.toString() +
    "\n" + getAuthors() +
    "\n" + getPublisher();
  }
  
  /**
  * This method compares 2 Book objects.
  * @param other is the second "Book"
  * @return boolean: if Books are equal = true, else false.
  */
  @Override
  public boolean equals(Object other) {
    if (other == null) {
      return false;
    } else if (getClass() != other.getClass()) {
      return false;
    } else {
      Book otherBook = (Book)other;
      return super.equals(otherBook) &&
             authors.equalsIgnoreCase(otherBook.authors) &&
             publisher.equalsIgnoreCase(otherBook.publisher);
    }
  }

  /**
   * This method prints to the output file.
   */
  @Override
  public String printToFile() {
  return  "type = \"book\"" +
          "\n" + super.printToFile() +
          "\nauthors = \"" + getAuthors() + "\"" +
          "\npublisher = \"" + getPublisher() + "\"";
  }

  /**
   * This method creates a Book object clone
   */
  @Override
  public Book clone() {
    try {
      return new Book(this);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    return null;
  }
}