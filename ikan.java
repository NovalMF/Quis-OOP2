public class ikan {
	
	public void berenang() {
	System.out.println ("Ikan Berenang");
	}
	public void berkembangbiak() {
	System.out.println ("Ikan Berkembangbiak");
	}
	public void bernafas() {
	System.out.println ("Ikan Bernafas");
	}
}

class piranha extends ikan {
	
	public void berenang() {
	System.out.println("Piranha Bisa Berenang");
	}
	public void berkembangbiak() {
	System.out.println("Piranha Bisa Berkembangbiak");
	}
	public void bernafas() {
	System.out.println("Piranha Bisa Bernafas");
	}
	public void tampilkan() {
		super.berenang();
		super.berkembangbiak();
		super.bernafas();
	}
	public static void main(String []args){
	piranha Piranha = new piranha();
	Piranha.tampilkan();
	Piranha.berenang();
	Piranha.berkembangbiak();
	Piranha.bernafas();
	}
}

class lele extends ikan {
	
	public void berenang() {
	System.out.println("Lele Bisa Berenang");
	}
	public void berkembangbiak() {
	System.out.println("Lele Bisa Berkembangbiak");
	}
	public void bernafas() {
	System.out.println("Lele Bisa Bernafas");
	}
	public void tampilkan() {
		super.berenang();
		super.berkembangbiak();
		super.bernafas();
	}
	public static void main(String []args){
	lele Lele = new lele();
	Lele.tampilkan();
	Lele.berenang();
	Lele.berkembangbiak();
	Lele.bernafas();
	}
}