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
	public User(String t_email, int t_userID)
	{
		this.eMail = t_eMail;
		this.userID = t_userID;
		this.userName = null;
	}

	public String getUserName()
	{
		return this.userName;
	}
	
	public int getUserID()
	{
		return this.userID;
	}

	public String getEmail()
	{
		return this.eMail;
	}

	public void setUserName(String t_userName)
	{
		this.userName = t_userName;
	}

	public void setUserID(int t_userID)
	{
		this.userID = t_userID;
	}

	public void setEmail(String t_eMail)
	{
		this.eMail = t_eMail;
	}
}