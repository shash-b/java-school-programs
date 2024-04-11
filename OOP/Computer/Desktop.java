public class Desktop extends Computer {
    private String gpu;

    public Desktop(String name, int primaryMemory, int secondaryMemory, String gpu) {
        super(name, primaryMemory, secondaryMemory);
        this.gpu = gpu;
    }

    public String getGPU() {
        return this.gpu;
    }

    public void setGPU(String gpu) {
        this.gpu = gpu;
    }

    public double calculateVirtualMemory() {
        return this.getPrimaryMemory() * 2.5;
    }

    public String toString() {
        return super.toString() + "\nDiscrete GPU" + this.gpu;
    }
}
