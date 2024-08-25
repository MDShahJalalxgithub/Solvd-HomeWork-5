public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            checkBrand("UnknownBrand");
        } catch (InvalidBrandException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        try {
            checkPrice(-1000);
        } catch (PriceOutOfRangeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        try (ResourceExample resource = new ResourceExample()) {
            resource.use();
        } catch (Exception e) {
            System.out.println("Exception caught in try-with-resources: " + e.getMessage());
        }
    }

    public static void checkBrand(String brand) throws InvalidBrandException {
        if ("UnknownBrand".equals(brand)) {
            throw new InvalidBrandException("Brand is not recognized.");
        }
    }

    public static void checkPrice(double price) throws PriceOutOfRangeException {
        if (price < 0) {
            throw new PriceOutOfRangeException("Price cannot be negative.");
        }
    }
}