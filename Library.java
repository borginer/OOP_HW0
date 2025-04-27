package homework0;

/**
 * This is a container that can be used to contain Books. The key difference
 * between a Bookshelf and a Library is that a Library has a finite capacity.
 * Once a Library is full, we cannot add more books to it.
 */
public class Library {

    /**
     * @param maxPages - Total number of pages that this Library can contain.
     * @effects Creates a new Library.
     */
    public Library(int maxPages) {
        // TODO: Add your code here
    }

    /**
     * @modifies this
     * @effects Adds book to the Library.
     * @return true if the book was successfully added to the Library,
     *         i.e. the book is not already in the Library and
     *         the Library has enough capacity;
     *         false otherwise.
     */
    public boolean addBook(Book book) {
        // TODO: Add your code here
        return false;
    }

    /**
     * @modifies this
     * @effects Removes book from the Library.
     * @return true if the book was successfully removed from the Library,
     *         i.e. the book was in the Library; false otherwise.
     */
    public boolean removeBook(Book book) {
        // TODO: Add your code here
        return 0;
    }

    /**
     * @return the total number of pages in all the books in the Library.
     */
    public int getTotalPages() {
        // TODO: Add your code here
        return 0;
    }

    /**
     * @return the number of books in the Library.
     */
    public int size() {
        // TODO: Add your code here
        return 0;
    }

    /**
     * @modifies this
     * @effects Empties the Library.
     */
    public void clear() {
        // TODO: Add your code here
    }

    /**
     * @return true if this Library contains the book; false otherwise.
     */
    public boolean contains(Book book) {
        // TODO: Add your code here
        return false;
    }
}
