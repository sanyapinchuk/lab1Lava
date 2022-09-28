package main.java.by.sanya.task15;


public class Book implements Comparable{
    private String title;
    private String author;
    private int price;
    private static int edition;
    private int isbn;

    public int getIsbn(){
        return isbn;
    }

    public static void setEdition(int edition){
        Book.edition = edition;
    }

    public Book(String title, String author, int price,  int isbn){
        this.isbn= isbn;
        this.author= author;
        this.price = price;
        this.title = title;
    }

    @Override
    public String toString(){
        return "title: "+ title+"; author: "+ author+"; price: "+ price+"; edition: "+ edition;
    }
    @Override
    public boolean equals(Object o) {
        Book book = (Book) o;
        return title == book.title && author == book.author &&
                price== book.price && edition == book.edition;
    }
    @Override
    public int hashCode(){
        int result = title.hashCode();
        result = result * 23 + author.hashCode();
        result = result * 23 + price;
        result = result * 23 + edition;
        return result;
    }

    @Override
    public int compareTo(Object o) {
        if(isbn>((Book)o).isbn)
            return 1;
        return isbn==((Book)o).isbn? 0 : -1;
    }
}
