package my.framework;

public interface Channel<E extends Message> {
    public void  dispatch(E message);
}
