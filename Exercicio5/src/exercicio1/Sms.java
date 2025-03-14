package exercicio1;

public record Sms(String message) implements Messages {

    @Override
    public String SendMessage() {
        return message;
    }
}
