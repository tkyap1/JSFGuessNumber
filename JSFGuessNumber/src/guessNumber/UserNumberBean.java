package guessNumber;

import java.io.Serializable;
import java.util.Random;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

@ManagedBean
// @RequestScoped
@SessionScoped
public class UserNumberBean implements Serializable {
	private static final long serialVersionUID = 5443351151396868724L;
	Integer randomInt = null;
	Integer userNumber = null;
	String response = null;
	private long minimum = 0;
	private long maximum = 20;

	public UserNumberBean() {
		Random randomGR = new Random();
		randomInt = new Integer(randomGR.nextInt((int)maximum));
		System.out.println("Duke's number: " + randomInt);
	}

	public void setUserNumber(Integer user_number) {
		userNumber = user_number;
	}

	public Integer getUserNumber() {
		return userNumber;
	}

	public String getResponse() {
		if ((userNumber != null) && (userNumber.compareTo(randomInt) == 0)) {
			return "Yay! You got it brother!";
		} else {
			return "Sorry, " + userNumber + " is incorrect.";
		}
	}

	public long getMaximum() {
		return (this.maximum);
	}

	public void setMaximum(long maximum) {
		this.maximum = maximum;
	}

	public long getMinimum() {
		return (this.minimum);
	}

	public void setMinimum(long minimum) {
		this.minimum = minimum;
	}
}