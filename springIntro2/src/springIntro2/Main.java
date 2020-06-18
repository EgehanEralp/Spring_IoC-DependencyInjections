package springIntro2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context=
				new ClassPathXmlApplicationContext("applicationContext.xml"); //XML i okumak
		
		ICustomerService customerService = context.getBean("service", ICustomerService.class); //CustomerManager cm = new CustomerManager(); İLE AYNI bu yüzden constructor parametresi lazım
		customerService.add();
		
		//BİRBİRİNİN ALTERNATİFİ OLAN İŞLEMLER İF LER İLE AYRILMAMALI !!!!!! -> SAYISALLAR İF LER İLE AYRILIR
		
		//iki ayrı database kullanan kullanıcıları ekleyebilmek
		//Dependency Injection;
		/*
		CustomerManager customerMysql = new CustomerManager(context.getBean("database1",ICustomerDAL.class)); //parametre olarak interface veremeyiz.
		customerMysql.add();
		
		CustomerManager customer = new CustomerManager(context.getBean("database2",ICustomerDAL.class)); //1-mysql, 2-oracle, 3-mssql
		customer.add();
		*/
		
		
	}
	
	
	//IoC - Inversion of Control
	//IoC ile birbirinin alternatifi olan işleri ayrı sınıflarda yürütüyoruz.
	
}
