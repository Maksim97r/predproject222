package web.model;

public class Car {
    private Long id;
    private String model;
    private String name;
    private int maxSpeed;

    public Car() {
    }

    public Car(String model, String name, int maxSpeed) {
        this.model = model;
        this.name = name;
        this.maxSpeed = maxSpeed;
    }

    public Car(Long id, String model, String name, int maxSpeed) {
        this.id = id;
        this.model = model;
        this.name = name;
        this.maxSpeed = maxSpeed;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", name='" + name + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
