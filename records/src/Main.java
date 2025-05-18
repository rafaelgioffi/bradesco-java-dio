public class Main {
    public static void main(String[] args) {
        var person = new Person("João", 25);
        System.out.println(person);
        System.out.println(person.nome());

        var newPerson = new Person("Maria", 20);
        System.out.println(person);
    }
}