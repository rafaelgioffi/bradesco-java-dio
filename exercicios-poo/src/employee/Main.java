package employee;

public class Main {
    public static void main(String[] args) {
        //Employee employee = new Employee(); Employee não pode ser instanciado pois é abstrato.
        Employee manager = new Manager();

        manager.setName("Eliosvaldo Góes de Macedo");
        manager.setLogin("eli.macedo");
        manager.setPassword("123456");

        System.out.println(manager.getName());
        System.out.println(manager.getLogin());
        System.out.println(manager.getPassword());
    }
}
