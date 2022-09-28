package main.java.by.sanya.task14;


public class Book implements Cloneable{
    private String title;
    private String author;
    private int price;
    private static int edition;

    public Object clone()
    {
        var book = new Book();
        book.author= author;
        book.title= title;
        book.price = price;
        book.edition = edition;
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
