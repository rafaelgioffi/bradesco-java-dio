package employee;

// A classe não pode ser extendida do Salesman pq ela está definida como final, que só permite extender de uma única classe. ninguém mais pode extender ...
public class Client {
    private String document;

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }
}
