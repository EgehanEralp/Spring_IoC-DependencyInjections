package springIntro2;


//interface kullanımı - değişik durumlar için flexibility sağlar. Genelleme yapmamızı sağlamış olur.
//interface ile birbirinin alternatifi işlemleri yürüten sınıflar tek çatı altında toplanır. (tek kalıp)

public class CustomerManager implements ICustomerService{ //iş kuralları
	
	//dependency injection->
	private ICustomerDAL customerDAL;
	
	
	//constructor injection (setter injection yapmaya göre daha çok tercih edilir.)
	public CustomerManager(ICustomerDAL customerDAL) { // Constructor Injection -> Injection genelleme amaçlı yapılır. ICustomerDAL implemente etmiş olan tüm sınıflar tarafından CustomerManager oluşturulabilecektir.
		this.customerDAL = customerDAL;
	}


	public void add() {
		//Class lar arası NESNELER İLE İŞLEMLER GERÇEKLEŞTİRİLMEMELİ
		customerDAL.add();
	}


	
	
}
