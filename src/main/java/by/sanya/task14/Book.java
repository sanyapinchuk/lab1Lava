package main.java.by.sanya.task14;


public class Book implements Cloneable{
    private String title;
    private String author;
    private int price;
    private static int edition;


    public Book(String title, String author, int price){
        this.author= author;
        this.price = price;
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


    public static int getEdition(){
        return edition;
    }
    public static void setEdition(int edition){
        Book.edition = edition;
    }

    public Object clone()
    {
        var book = new Book(title, author, price);
        return book;
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



}
