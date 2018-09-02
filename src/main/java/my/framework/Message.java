package my.framework;

public interface Message {
    public Class<? extends Message> getType();
}
