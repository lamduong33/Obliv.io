import java.util.LinkedList;

public class Messages
{
    private LinkedList messages;

    public Messages()
    {

    }

    @Overrride
    public Messages(int conversationID)
    {
        // Make call to the DB to populate messages.
        // But only with those that are with the conersationID
    }
}