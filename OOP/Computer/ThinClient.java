public class ThinClient extends Computer {
    private String protocol;

    public ThinClient(String name, int primaryMemory, int secondaryMemory, String protocol) {
        super(name, primaryMemory, secondaryMemory);
        this.protocol = protocol;
    }

    public String getProtocol() {
        return this.protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    @Override
    public double calculateVirtualMemory() {
        return 0;
    }

    public String toString() {
        return super.toString() + "\nProtocol: " + this.protocol;
    }
}
