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
        var programmerBook = (ProgrammerBook) o;
        return programmerBook.language == language && programmerBook.level == level;
    }
    @Override
    public int hashCode(){
        int result = language.hashCode();
        result = result * 23 + level;
        return result;
    }
}