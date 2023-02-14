import java.util.Scanner;
class FaceBook1
{
	static Scanner s=new Scanner(System.in);
	private String email="dineshdairymilk@gmail.com";
	private String pwd="Dinee36";
	String userName="Dinesh";
	private long ph_num;
    //constructor

    FaceBook1()
    {}
    FaceBook1(long ph_num)
	{
		this.ph_num=ph_num;
	}
	public String getEmail()
	{
		return this.email;
	}
	public void setEmail(String n_email)
	{
		System.out.println("Enter the phone number which is registered ");
		long in_ph=s.nextLong();// for entering ph number
		if (this.ph_num==in_ph)
		{//for the otp process
			int otp=Otp.randomOtp();
			System.out.println("Enter the OTP");
			System.out.println(otp);
			  if (otp==s.nextInt())
			  {
                 System.out.println("Data Modified Successfully");
			    this.email=n_email;
			   }
			  else
               {
				  System.out.println("OTP is Incorrect can't Modify the email");
			   }
		}
		 else
			{
				 System.out.println("phone number you entered is wrong ");
				 System.out.println("Modification is failed ");
			}

		

		}
}
