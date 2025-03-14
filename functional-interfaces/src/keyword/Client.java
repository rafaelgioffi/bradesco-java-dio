package keyword;

public class Client {
    private static String staticName;
    private String name;
    public int age;

//      Parte 1
//    private Address address = new Address();

    public String getStaticName() {
        return staticName;
    }

    public void setStaticName(final String param) {
        staticName = param;
    }

    public int getAge() {
        return age;
    }

    public void setAge(final int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
//      Parte 1
//      System.out.println(address.description);
        this.name = name;
    }
}
