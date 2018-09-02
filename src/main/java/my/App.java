package my;

import my.framework.Event;
import my.framework.EventDispatcher;
import my.framework.Handler;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        EventDispatcher dispatcher = new EventDispatcher();
        dispatcher.registerChannel(Event.class, new Handler());
        dispatcher.dispatch(new Event());
    }
}
