
public class Book {

    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }
    
    public boolean equals(Object compared){
        // if the variables are located in the same position, they are equal
        if(this == compared){
            return true;
        }
        // if the type of the compared object is not Song, the objects are not equal

        if (!(compared instanceof Book)) {
            return false;
        }

        // convert the Object type compared object
        // into a Song type object called comparedSong
        Book comparedSong = (Book) compared;

        // if the values of the object variables are the same, the objects are equal
        if(this.name.equals(comparedSong.name)&&
        this.publicationYear == comparedSong.publicationYear){
            return true;
        }
        // otherwise the objects are not equal
        return false;
    }

}
