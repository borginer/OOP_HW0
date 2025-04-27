package homework0;

/**
 * A simple object that represents a book with a number of pages.
 */
public class Book {
    int pages;

    /**
     * @requires pages > 0
     * @modifies this
     * @effects Creates and initializes a new Book object with the specified
     *          number of pages.
     */
    public Book(int pages) {
        if (pages > 0) {
            this.pages = pages;
        } else {
            throw new IllegalArgumentException("pages arg should be positive");
        }
    }

    /**
     * @requires pages > 0
     * @modifies this
     * @effects Sets the number of pages in the Book.
     */
    public void setPages(int pages) {
        if (pages > 0) {
            this.pages = pages;
        }
    }

    /**
     * @return the number of pages in the Book.
     */
    public int getPages() {
        return this.pages;
    }
}
