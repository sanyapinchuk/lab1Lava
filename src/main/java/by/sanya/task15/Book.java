package main.java.by.sanya.task15;


public class Book implements Comparable<Book>{
    private String title;
    private String author;
    private int price;
    private static int edition;
    private int isbn;



    public Book(String title, String author, int price,  int isbn){
        this.isbn= isbn;
        this.author= author;
        this.price = price;
        this.title = title;
    }

    public int getIsbn(){
        return isbn;
    }


    public void setPrice(int price) {
        this.price = price;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice(){
        return price;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public static int getEdition(){
        return edition;
    }
    public static void setEdition(int edition){
        Book.edition = edition;
    }
    @Override
    public String toString(){
        return "title: "+ title+"; author: "+ author+"; price: "+ price+"; edition: "+ edition;
    }
    @Override
    public boolean equals(Object o) {
        if(this == o)
            return true;
        if(o == null || getClass() != o.getClass())
            return false;
        Book book = (Book) o;
        return title.equals(book.title) && author.equals(book.author) &&
                price== book.price;
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
    public int compareTo(Book o) {
        if(isbn>o.isbn)
            return 1;
        return isbn==((Book)o).isbn? 0 : -1;
    }
}
