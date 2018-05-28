package backend.enums;

public enum Genre {

    GENRE_1("genre_1"), GENRE_2("genre_2");

    private final String name;
    Genre(String name) { this.name = name; }
    public String getValue() { return name; }
}
