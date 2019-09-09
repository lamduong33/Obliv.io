import java.util.ArrayList;

/**
 * A class that handles user conversations.
 * This class should act as a container of messages
 * and associated users. 
 * @author Lam Duong
 */
public class Conversation
{
    private final int conversationID;
    private ArrayList messages; // The IDs of the messages inside the Conversation
    private ArrayList users; // The IDs of the people inside the Conversation

    public Conversation()
    {
        this.conversationID = -1;
        this.messages = null;
        this.users = null;
    }

    /**
     * Takes 2 users to create a conversation. If a group chat is required,
     * then use the addUser() method to create a group chat.
     * @param t_user1
     * @param t_user2
     */
    @Override
    public Conversation(int t_user1ID, int t_user2ID)
    {
        Integer user1ID = Integer.valueOf(t_user1ID);
        Integer user2ID = Integer.valueOf(t_user2ID);
        this.users = new ArrayList<Integer>(Arrays.asList(t_user1ID, t_user2ID));
        this.messages = new ArrayList<Integer>();
        this.conversationID = generateConversationID();
        this.saveConversationToDB();
    }

    public int getConversationID()
    {
        return this.conversationID;
    }

    public List getMessages()
    {
        return this.messages;
    }

    public List getUsers()
    {
        return this.users;
    }

    public void addMessage(Message t_message)
    {
        if (t_message.getMessageID() != -1)
        {
            this.messages.add(t_message.getMessageID());
        }
    }

    public void removeMessage(int t_messageID)
    {
        this.messages.add(t_messageID);
    }

    public void editMessage(int t_messageID)
    {
        // TODO: Messages Object Required?
            // Maybe a container class that holds
            // every message that is part of this conversation
    }

    /**
     * Add a user into the conversation. However, each conversation
     * can only hold 5 users at a time. No more.
     * @param userID
     */
    public void addUser(int userID)
    {
        if(this.users.size() <= 5)
        {
            this.users.insert(userID);
        }
        else
        {
            throw RuntimeException("Cannot add more users. "
            + "Maximum size of converation is 5 users.");
        }
    }

    /**
     * Remove a user from the conversation. However, cannot remove
     * a user if the there are only 2 users left in the conversation.
     * @param userID
     */
    public void removeUser(int userID)
    {
        if(this.users.size() > 2)
        {
            this.users.remove(userID);
        }
        else
        {
            throw RuntimeException("Cannot remove another user. "
            + "Minimum size of converation is 2 users.");
        }
    }

    public static int generateConversationID()
    {
        int conversationID = 0;
        // Get the last conversationID from DB
        // Then add 1 to that.
        return conversationID;
    }

    public void saveConversationToDB()
    {
        
    }
}
