package ut.org.biscuit.jira;

import org.junit.Test;
import org.biscuit.jira.MyPluginComponent;
import org.biscuit.jira.MyPluginComponentImpl;

import static org.junit.Assert.assertEquals;

public class MyComponentUnitTest
{
    @Test
    public void testMyName()
    {
        MyPluginComponent component = new MyPluginComponentImpl(null);
        assertEquals("names do not match!", "myComponent",component.getName());
    }
}