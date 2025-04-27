package homework0;

/**
 * A container that can be used to store Books. A given Book may only
 * appear in a Bookshelf once.
 */
public class Bookshelf {

    /**
     * @effects Creates a new empty Bookshelf.
     */
    public Bookshelf() {
        // TODO: Add your code here
    }

    /**
     * @modifies this
     * @effects Adds book to the Bookshelf.
     * @return true if the book was successfully added,
     *         i.e. the book was not already in the Bookshelf; false otherwise.
     */
    public boolean addBook(Book book) {
        // TODO: Add your code here
        return false;
    }

    /**
     * @modifies this
     * @effects Removes book from the Bookshelf.
     * @return true if the book was successfully removed,
     *         i.e. the book was in the Bookshelf; false otherwise.
     */
    public boolean removeBook(Book book) {
        // TODO: Add your code here
        return false;
    }

    /**
     * @return the total number of pages in all the books in the Bookshelf.
     */
    public int getTotalPages() {
        // TODO: Add your code here
        return 0;
    }

    /**
     * @return the number of books in the Bookshelf.
     */
    public int size() {
        // TODO: Add your code here
        return 0;
    }

    /**
     * @modifies this
     * @effects Empties the Bookshelf, i.e., removes all books.
     */
    public void clear() {
        // TODO: Add your code here
    }

    /**
     * @return true if this Bookshelf contains the book; false otherwise.
     */
    public boolean contains(Book book) {
        // TODO: Add your code here
        return false;
    }
}
