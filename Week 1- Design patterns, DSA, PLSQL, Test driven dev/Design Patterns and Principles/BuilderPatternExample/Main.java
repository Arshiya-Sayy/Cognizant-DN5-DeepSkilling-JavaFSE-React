public class Main {

    public static void main(String[] args) {

        Computer gamingPC =
                new Computer.Builder()
                        .setCPU("Intel i9")
                        .setRAM("32GB")
                        .setStorage("1TB SSD")
                        .setGPU("RTX 4070")
                        .build();

        gamingPC.display();
    }
}