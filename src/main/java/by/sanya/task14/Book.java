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


    public static int getEdition(){
        return edition;
    }
    public static void setEdition(int edition){
        Book.edition = edition;
    }

    public Book clone()
    {
        try {
            Book clone = (Book) super.clone();
            clone.author = author;
            clone.price = price;
            clone.title = title;
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
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



}
