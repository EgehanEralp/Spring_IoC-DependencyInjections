package springIntro2;

//OracleDB

public class CustomerDAL implements ICustomerDAL { //data access layer
	
	String connectionPath; // String Injection - farklı şirketlerin Oracle bağlantı Path leri de farklı olacaktır.
							//String injection ile genelleme yaparız, parametre ile alırız.
	
	public String getConnectionPath() {
		return connectionPath;
	}
	
	
	public void setConnectionPath(String connectionPath) {
		this.connectionPath = connectionPath;
	}

	

	public void add() {
		System.out.println("Connection string :"+ connectionPath);
		System.out.println("Oracle veritabanına eklendi.");
		
		
		
	}
	
	
}
