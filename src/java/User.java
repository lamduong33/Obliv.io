/**
 * @author Lam Duong
 */
public class User
{
	// Password handled by Google Authentication
	private String userName;
	private int userID;
	private String eMail;

	public User()
	{
		this.userName = null;
		this.userID = 0;
		this.email = null;
	}

	@Override
	public User(String email, int userID)
	{
		this.eMail = eMail;
		this.userName = userID;
	}
}