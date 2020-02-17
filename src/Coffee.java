public class Coffee {
    private String name;
    private String roast;
    private int id;

    public Coffee(String name, String roast, int id) {
        this.name = name;
        this.roast = roast;
        this.id = id;
    }
    // Getters
    public String getName() {
        return this.name;
    }

    public String getRoast() {
        return this.roast;
    }

    public int getId() {
        return this.id;
    }
    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setRoast(String roast) {
        this.roast = roast;
    }

    public void setId(int id) {
        this.id = id;
    }

}
