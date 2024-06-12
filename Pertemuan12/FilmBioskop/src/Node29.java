public class Node29 {
    int idFilm;
    String judulFilm;
    double ratingFilm;
    Node29 prev;
    Node29 next;

    public Node29(Node29 prev, int idFilm, String judulFilm, double ratingFilm, Node29 next) {
        this.prev = prev;
        this.idFilm = idFilm;
        this.judulFilm = judulFilm;
        this.ratingFilm = ratingFilm;
        this.next = next;
    }
}
