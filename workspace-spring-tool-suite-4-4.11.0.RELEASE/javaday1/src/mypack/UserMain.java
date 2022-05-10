package mypack;

public class UserMain {
	public static void main(String[] args) {
		User user = new User();
		
		user.setuId(101);
		user.setuName("pankaj");
		user.setuEmail("pankaj@mail.com");
		
		System.out.println(user.getuId() + " " + user.getuEmail());
	}

}
