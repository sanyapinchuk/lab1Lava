package main.java.by.sanya.task13;

import main.java.by.sanya.task12.Book;

public class ProgrammerBook extends Book {
    private String language;
    private int level;

    public ProgrammerBook(String language, int level, String title,
                          String author, int price, int edition){
        super(title, author, price);
        this.level = level;
        this.language = language;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getLanguage(){
        return language;
    }

    public int getLevel(){
        return level;
    }

    @Override
    public String toString(){
        return "language: "+ language + "; level: "+ level;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o)
            return true;
        if(o == null || getClass() != o.getClass())
            return false;
        var programmerBook = (ProgrammerBook) o;
        return programmerBook.language.equals(language) && programmerBook.level == level;
    }

    @Override
    public int hashCode(){
        int result = language.hashCode();
        result = result * 23 + level;
        return result;
    }
}