public class ResourceExample implements AutoCloseable {
    public void use() {
        System.out.println("Using resource.");
    }

    @Override
    public void close() {
        System.out.println("Resource closed.");
    }
}