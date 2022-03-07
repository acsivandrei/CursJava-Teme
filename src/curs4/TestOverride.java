package curs4;

public class TestOverride {

	public static void main(String[] args) {
		
		Angajat angajat = new Angajat();
		angajat.work();
		
		Testerinheritence tester = new Testerinheritence();
		tester.work();
		tester.scrieTeste();
		
		Developer developer = new Developer();
		developer.work();
		
		Angajat tester2 = new Testerinheritence();
		tester2.work();
		((Testerinheritence) tester2).scrieTeste();
		
		
		Angajat tester3 = new Testerinheritence();
		tester3.work();
		
		tester3 = new Developer();
		tester3.work();
		
		
		
		//WebDriver obiect = new ChromeDriver();
		//numeClasa numeObiect = new constructorulClasei()
		
		
	}

}
