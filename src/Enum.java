
enum Fruit {
    APPLE("Apple", 200),
    BANANA("Banana", 50),
    ORANGE("Orange", 125),
    GRAPES("Grapes", 80);

    private String key;
    private int value;

    Fruit(String key, int value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public int getValue() {
        return value;
    }

    public static void info(String key){
        Fruit fruit[] = Fruit.values();
        for (Fruit f : fruit) {
            if (f.getKey().equals(key)){
                System.out.println(Fruit.valueOf(f.toString()) + "{" + "Key:" + f.getKey() + ",Price:" + f.getValue() + "}");
            }
        }
    }


}



