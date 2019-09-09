/**
 * Handles message content, such as text content,
 * who sent the message, and which conversation the
 * message belongs to.
 * @author Lam Duong
 */
public class Message
{
    private String message;
    private final int messageID;
    private int conversationID;
    private int userID;
    private boolean edited;

    // Time Stamp
    // Seen
    // Attached
    // Emoji?
    // GIFs?

    /**
     * Default empty constructor for Message. Null string
     * and -1 for messageID, conversationID, and userID.
     */
    public Message()
    {
        this.message = null;
        this.mesageID = -1;
        this.conversationID = -1;
        this.userID = -1;
        this.edited = false;
    }

    /**
     * Message Constructor to take in a message string, the ID
     * of the Conversation it is a part of, and the ID of the
     * user that sent it.
     * @param message
     * @param conversationID
     * @param userID
     */
    @Override
    public Message(String t_message, int t_conversationID, int t_userID)
    {
        if (t_message.length() < 300)
        {
            this.message = t_message;
        }
        else
        {
            throw RuntimeException("Message cannot be more than 300 characters long");
        }
        this.conversationID = t_conversationID;
        this.userID = t_userID;
        this.edited = false;
        this.userID = generateMessageID();
        this.saveToDatabase();
    }

    public String getMessage()
    {
        return this.message;
    }

    public int getMessageID()
    {
        return this.messageID;
    }

    public int getConversationID()
    {
        return this.conversationID;
    }

    public int getUserID()
    {
        return this.userID;
    }

    public boolean isEdited()
    {
        return this.edited;
    }

    /**
     * Static method that finds the last entry of messages
     * in the database and its corresponding messageID. From
     * there, get a new messageID by adding 1 to generate
     * a new messageID.
     * @return generatedMessageID
     */
    public static int generateMessageID()
    {
        int lastMessageIDinDB;
        int generatedMessageID;
        // TODO: Find the last messageID in DB
        return generatedMessageID;
    }
    
    /**
     * TODO: Save all the information to database.
     * NOTE: IT SHOULD NOT SAVE ANYTHING THAT IS NULL
     */
    public void saveToDatabase()
    {
        
    }

    public void setMessage(String t_message)
    {
        this.message = t_message;
        this.edited = true;

        // TODO: Reflect these changes in Database.
            // NOTE: Only change if messageID != 1
    }


}