package pro.sky.java.course2.lesson2;

public class Bicycle implements Transport{
    private String modelName;
    private int wheelsCount;
    private String transportCategory;

    public Bicycle(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
        this.transportCategory = "L";
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    @Override
    public String getTransportCategory() {
        return transportCategory;
    }
}
