package Problem_5;

public class Computer {
    private String manufacturer;
    private String processor;
    private int ramSize;
    private double processorSpeed;

    public Computer(String manufacturer, String processor, int ramSize, double processorSpeed) {
        this.manufacturer = manufacturer;
        this.processor = processor;
        this.ramSize = ramSize;
        this.processorSpeed = processorSpeed;
    }

    public int getRamSize() {
        return ramSize;
    }

    public double getProcessorSpeed() {
        return processorSpeed;
    }

    public double computePower() {
        return ramSize * processorSpeed;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Computer other = (Computer) obj;
        return manufacturer.equals(other.manufacturer) && processor.equals(other.processor)
                && ramSize == other.ramSize && Double.compare(processorSpeed, other.processorSpeed) == 0;
    }

    @Override
    public int hashCode() {
        int result = manufacturer.hashCode();
        result = 25 * result + processor.hashCode();
        result = 25 * result + ramSize;
        long temp = Double.doubleToLongBits(processorSpeed);
        result = 25 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Manufacturer: " + manufacturer + "\nProcessor: " + processor +
                "\nRAM Size: " + ramSize + " GB\nProcessor Speed: " + processorSpeed + " GHz";
    }
}
