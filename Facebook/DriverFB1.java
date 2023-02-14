class DriverFB1
{
	public static void main(String[] args) 
	{
		FaceBook1 ref=new FaceBook1(9566977073l);
		System.out.println("Initial Email:"+ref.getEmail());
		ref.setEmail("Dinesh360mec@gmail.com");
		System.out.println("New Email:"+ref.getEmail());
	}
}

