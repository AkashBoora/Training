package chapter7;

public class BookDemo {
    public static void main(String[] args) {
        Book gameOfThores = new Book("George Martin","Game of Thrones", "Fantacy", 854);
        Book mathBook = new Book("James Stewart", "Calculus", "Math", 1392);
        Book javaBook = new Book("Joel Murach", "Murach's Java Programming","Programming", 800);

        gameOfThores.printBookDetails();
        mathBook.printBookDetails();
        javaBook.printBookDetails();

//        printBookDetails(gameOfThores);
//        printBookDetails(mathBook);
//        printBookDetails(javaBook);
    }

    public static void printBookDetails(Book book){
        System.out.println(book.getTitle()+
                "\nby "+book.getAuthor()+
                "\nhas "+book.getNumPages()+" pages, and its genre is "+book.getGenre());
        System.out.println();
    }
}
