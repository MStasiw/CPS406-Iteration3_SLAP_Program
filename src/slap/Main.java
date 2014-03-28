/**
 * 
 */
package slap;
import javax.swing.JFrame;


/**
 * @author Michael
 *
 */
@SuppressWarnings("serial")
public class Main extends JFrame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccountManager.createAccount("Student1", "Test", "student", "student", Role.student);
		Account testStaff = new Instructor("Instructor1", "Test", "instructor", "instructor");
		Account testAdmin = new Administrator("Administrator1", "Test", "admin", "admin");
		
		String[] infos = {AccountManager.getAccountObj("student").getUsername(), AccountManager.getAccountObj("student").getPassword(), testStaff.getUsername(), testStaff.getPassword(),testAdmin.getUsername(), testAdmin.getPassword()};
		
		Login a = new Login(infos);
		a.execute();
		
	}
	


}
