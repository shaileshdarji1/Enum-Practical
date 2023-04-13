public class Main {
    public static void main(String[] args) {
        Fruit f1 = Fruit.APPLE;
        System.out.println(f1 + "{" + "Key:" + f1.getKey() + ",Price:" + f1.getValue() + "}");

        Fruit.info("Banana");


    }
}
