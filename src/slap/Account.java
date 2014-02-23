/**
 * 
 */
package slap;

/**
 * @author Michael
 *
 */
class Account{
	protected long id = -1;
	protected String firstName = "unspecified";
	protected String lastName = "unspecified";
	protected String username = "unspecified";
	protected String psw = "";
	protected Role role = null;
	
	protected Account(String firstName, String lastName, String username, String password, Role name) {
		setFirstName(firstName);
		setLastName(lastName);
		setUsername(username);
		setPsw(password);
		setRole(name);
	}
	
	/**
	 * @param id the id to set
	 */
	protected void setId(long id) {
		this.id = id;
	}

	/**
	 * @param firstName the firstName to set
	 */
	protected void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	/**
	 * @param lastName the lastName to set
	 */
	protected void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	/**
	 * @param username the username to set
	 */
	protected void setUsername(String username) {
		this.username = username;
	}
	
	/**
	 * @param psw the password to set
	 */
	protected void setPsw(String psw) {
		this.psw = psw;
	}
	
	/**
	 * @param role the role to set
	 */
	protected void setRole(Role role) {
		this.role = role;
	}
	
	
	/**
	 * @return the id
	 */
	protected long getId() {
		return id;
	}

	/**
	 * @return the firstName
	 */
	protected String getFirstName() {
		return firstName;
	}

	/**
	 * @return the lastName
	 */
	protected String getLastName() {
		return lastName;
	}
	
	/**
	 * @return the username
	 */
	protected String getUsername() {
		return username;
	}
	
	/**
	 * @return the password
	 */
	protected String getPsw() {
		return psw;
	}
	
	/**
	 * @return the role
	 */
	protected Role getRole() {
		return role;
	}
}
