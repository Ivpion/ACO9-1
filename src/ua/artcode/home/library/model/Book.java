package ua.artcode.home.library.model;

// Immutable class
public class Book {

    private final int id;
    private final String name;
    private final String author;
    private final int publishedYear;

    public Book(int id, String author,  String name, int publishedYear) {
        this.author = author;
        this.id = id;
        this.name = name;
        this.publishedYear = publishedYear;
    }

    public int getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }


    public String getName() {
        return name;
    }


    public int getPublishedYear() {
        return publishedYear;
    }

    @Override
    public boolean equals(Object object){
        if(this == object){
            return true;
        }

        if(object == null || object.getClass() != Book.class){
            return false;
        }

        Book other = (Book) object;

        return this.id == other.id;
    }

    @Override
    public int hashCode(){
        return id;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", name='" + name + '\'' +
                ", publishedYear=" + publishedYear +
                '}';
    }
}
