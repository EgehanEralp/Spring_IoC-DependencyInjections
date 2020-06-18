package springIntro2;

//MsSQL

public class MsSqlCustomerDal implements ICustomerDAL{

	String connectionPath; // String Injection - farklı şirketlerin MsSql bağlantı Path leri de farklı olacaktır.
							//String injection ile genelleme yaparız, parametre ile alırız.
	
	public String getConnectionPath() {
		return connectionPath;
	}
	
	public void setConnectionPath(String connectionPath) {
		this.connectionPath = connectionPath;
	}

	
	
	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("Connection string :"+ connectionPath);
		System.out.println("MsSQL veritabanına eklendi.");
	}

}
