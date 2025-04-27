import homework0.*;

public class test_bookshelf {
    static int assertNum = 0;
    public static void main(String[] args) {
        Bookshelf shelf = new Bookshelf();

        Book b1 = new Book(100);
        Book b2 = new Book(50);
        Book b3 = new Book(30);

        shelf.addBook(b1);
        shelf.addBook(b2);
        shelf.addBook(b3);

        my_assert(shelf.addBook(b3) == false);
        my_assert(shelf.getTotalPages() == 180);
        my_assert(shelf.contains(b2));
        shelf.removeBook(b2);
        my_assert(shelf.contains(b2) == false);
        my_assert(shelf.getTotalPages() == 130);
        my_assert(shelf.size() == 2);
        shelf.clear();
        my_assert(shelf.size() == 0);
        my_assert(shelf.getTotalPages() == 0);
        shelf.addBook(b2);
        my_assert(shelf.contains(b2) == true);
        my_assert(shelf.getTotalPages() == 50);
    }

    private static void my_assert(boolean b) {
        assertNum += 1;
        if (!b) {
            System.out.println("assert " + assertNum + ": fail");
        } else {
            System.out.println("assert " + assertNum + ": success");
        }
    }
}
