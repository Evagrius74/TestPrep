package library;

import java.util.ArrayList;
import java.util.HashMap;

public class Bookshelf {

  // Create a Bookshelf class that has a list of books in it
  // We should be able to add and remove books
  // We should be able to query the favourite author (who has written the most books in the shelf)
  // We should be able to query the earliest published books.
  // We should be able to query the latest published books.
  // Bookshelf should have a toString() method which give us information about the number of books, the earliest and the latest released books, and the favourite author


  ArrayList<Book> books = new ArrayList<>();

    public void add (Book b){
      books.add(b);
    }

    public void remove ( String title){

      //// irtam korabban, nagyon fontos, hogy a foreachben nem torolhetsz a listabol, arraybol!
      Book bookToRemove = null;
      for(Book b: books){
        if(b.title.equals(title)){
          bookToRemove = b;
        }
      }
      if (bookToRemove != null) {
        books.remove(bookToRemove);
      }
    }


// We should be able to query the favourite author (who has written the most books in the shelf)
    public String findFavoriteAuthor ( ArrayList<Book> books){

      String favoriteAuthor = "";
      HashMap<String,Integer> numberOfBooksToAuthor = new HashMap<>();

      for (Book book: books) {

        if(numberOfBooksToAuthor.containsKey(book.author)) {
          numberOfBooksToAuthor.put(book.author, numberOfBooksToAuthor.get(book.author) + 1);
        } else {
          numberOfBooksToAuthor.put(book.author,1);
      }

      }

      int maximumvalue = 0;
      for(String author : numberOfBooksToAuthor.keySet()) {
        if (numberOfBooksToAuthor.get(author) > maximumvalue) {
          maximumvalue = numberOfBooksToAuthor.get(author);
          favoriteAuthor = author;
        }
      }

      return favoriteAuthor;
    }




    // We should be able to query the earliest published books.

  public Book getEarliestPublishedBook(){
    if (books.size() == 0) {
      return null;
    }

    Book earliestBook = books.get(0);
    for (Book book: books) {
      if (book.releaseYear < earliestBook.releaseYear) {
        earliestBook = book;
      }
    }
    return earliestBook;
  }



  // We should be able to query the latest published books.
  public Book getLatestPublishedBook(){
    if (books.size() == 0) {
      return null;
    }

    Book latestBook = books.get(0);
    for (Book book: books) {
      if (book.releaseYear > latestBook.releaseYear) {
        latestBook = book;
      }
    }
    return latestBook;
  }



//  // Bookshelf should have a toString() method which give us information about the number of books,
// the earliest and the latest released books, and the favourite author

public String toString(){
    if (books.size() == 0) {
     return "You have no books here.";
    }
    return "You have " + books.size() + " book(s)." + "\n" +
      "Earliest released: " + getEarliestPublishedBook() + "\n" +
      "Latest released: " + getLatestPublishedBook() + "\n" +
      "Favourite author: " + findFavoriteAuthor(books);


  }



}



