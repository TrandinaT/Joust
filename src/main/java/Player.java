public class Player {
    private int id;
    private String name;
    private int strenght;

    public Player(int id, String name, int strenght) {
        this.setId(id);
        this.setName(name);
        this.setStrenght(strenght);
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrenght() {
        return strenght;
    }

    public void setStrenght(int strenght) {
        this.strenght = strenght;
    }
}
