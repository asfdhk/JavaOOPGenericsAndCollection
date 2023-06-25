public class Main {
    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.createList("Pavlo","Petro","Karina","Sofa","Andriy","Misha");
        demo.queue(3);
        System.out.println(demo.getList());
    }
}
