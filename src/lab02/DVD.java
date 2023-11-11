package lab02;

public class DVD {
    public String title = "";
    public String category = "";
    public String director = "";
    public int length = 0;
    public float cost = -1;
    private static int nbDigitalVideoDiscs = 0;
    private int id = 0;

    public DVD(){
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }

    public DVD(String title){
        this.title = title;
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public float getCost() {
        return cost;
    }
    public void setCost(float cost) {
        this.cost = cost;
    }
    public int getId() {
        return id;
    }

    public DVD(String title, String category, float cost) {
        super();
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    public DVD(String title, String category, String director, int length, float cost) {
        super();
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
        this.cost = cost;
    }
    @Override
    public String toString() {
        return "DigitalVideoDisc [title=" + title + ", category=" + category + ", director=" + director + ", length="
                + length + ", cost=" + cost + "]";
    }
}
