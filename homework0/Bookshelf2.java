package homework0;

import java.util.ArrayList;

/**
 * A container that can be used to store Books. A given Book may only
 * appear in a Bookshelf once.
 */
public class Bookshelf2 {
    ArrayList<Book> bookList;

    /**
     * @effects Creates a new empty Bookshelf.
     */
    public Bookshelf2() {
        this.bookList = new ArrayList<Book>();
    }

    /**
     * @modifies this
     * @effects Adds book to the Bookshelf.
     * @return true if the book was successfully added,
     *         i.e. the book was not already in the Bookshelf; false otherwise.
     */
    public boolean addBook(Book book) {
        if (bookList.contains(book)) {
            return false;
        }

        bookList.add(book);
        return true;
    }

    /**
     * @modifies this
     * @effects Removes book from the Bookshelf.
     * @return true if the book was successfully removed,
     *         i.e. the book was in the Bookshelf; false otherwise.
     */
    public boolean removeBook(Book book) {
        int bookIdx = bookList.indexOf(book);
        if (bookIdx == -1) { // book not in list
            return false;
        }

        bookList.remove(bookIdx);
        return true;
    }

    /**
     * @return the total number of pages in all the books in the Bookshelf.
     */
    public int getTotalPages() {
        int totalPages = 0;
        for (Book b: bookList) {
            totalPages += b.getPages();
        }

        return totalPages;
    }

    /**
     * @return the number of books in the Bookshelf.
     */
    public int size() {
        return bookList.size();
    }

    /**
     * @modifies this
     * @effects Empties the Bookshelf, i.e., removes all books.
     */
    public void clear() {
        bookList.removeAll(bookList);
    }

    /**
     * @return true if this Bookshelf contains the book; false otherwise.
     */
    public boolean contains(Book book) {
        return bookList.contains(book);
    }
}
