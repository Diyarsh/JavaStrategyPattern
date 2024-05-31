package candy;

public class Candy {
    private final String type;

    public Candy(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Candy{" + "type='" + type + '\'' + '}';
    }
}

