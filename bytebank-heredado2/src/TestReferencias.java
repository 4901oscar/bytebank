
public class TestReferencias {
public static void main(String[] args) {
	Gerente g1 = new Gerente();
	g1.setNombre("Marcos");
	g1.setSalario(5000.0);
	
	EditorVideo ev = new EditorVideo();
	ev.setSalario(5000.0);
	
	Designer d = new Designer();
	d.setSalario(2000.0);
	
	ControlBonificacion controle = new ControlBonificacion();
	controle.registrar(ev);
	controle.registrar(d);
	controle.registrar(g1);
	
	System.out.println(controle.getSuma());
}	
}
