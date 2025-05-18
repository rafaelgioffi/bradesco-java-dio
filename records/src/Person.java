public record Person(String nome, int age) {
public Person{

}

public Person(String nome) {
      this(nome, 12);
}

public String getInfo() {
    return "Nome: " + nome + ". Idade: " + age;
}
}
