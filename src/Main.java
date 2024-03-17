import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
	
	public static void islemleri_bastir() {
		
		System.out.println("0 - islemleri görüntüle.");
		System.out.println("1 - bir sonraki sehre git.");
		System.out.println("2 - bir önceki şehre git.");
		System.out.println("3 - uygulamadan cik.");
		
	}
	
	public static void sehirleri_turla(LinkedList<String> sehirler) {
		ListIterator<String> iterator = sehirler.listIterator();
		
		int islem;
		
		Scanner scan = new Scanner(System.in);
		
		if(!iterator.hasNext()) {
			System.out.println("Herhangi bir şehir bulunmuyor.");
		}
		
		boolean cikis = false;
		boolean ileri = true;
		while(!cikis) {
			
			System.out.println("Bir islem seciniz:");
			
			islem = scan.nextInt();
			
			switch(islem) {
				
				case 0:
					islemleri_bastir();
					break;
				
				case 1:
					
					if(!ileri) {
						if(iterator.hasNext()) {
							iterator.next();
						}
						ileri = true;
					}
					if(iterator.hasNext()) {
						 System.out.println("sehre gidiliyor.. " + iterator.next());
					}
					else {
						
						System.out.println("gidilecek şehir kalmadı.");
						
						ileri = true;
					}
					break;
					
				case 2:
					
					if(ileri) {
						if(iterator.hasPrevious()) {
							
							iterator.previous();
						}
						ileri = false;
					}
					if(iterator.hasPrevious()) {
						
						System.out.println("sehre gidiliyor.." +iterator.previous());
					}
					else {
						System.out.println("sehir turu basladi..");
					}
					break;
					
				case 3:
					cikis=true;
					System.out.println("uygulamadan cikiliyor..");
					break;
			}
		}
		
		islemleri_bastir();
	}

	public static void main(String[] args) {
		
		LinkedList<String> sehirler = new LinkedList<String>();
		
		sehirler.add("Ankara");
		sehirler.add("Eskişehir");
		sehirler.add("Afyon");
		System.out.println("İSLEMLER:");
		islemleri_bastir();
		sehirleri_turla(sehirler);

	}

}
