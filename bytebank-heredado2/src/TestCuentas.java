
	public class TestCuentas {
		public static void main(String[] args) {
			CuentaCorriente cc = new CuentaCorriente(111, 111);
			cc.depositar(100.0);
			
			CuentaAhorros ca = new CuentaAhorros(222,222);
			ca.depositar(100);
			
			cc.transferir(10.0, ca);
			
			System.out.println("CC :" + cc.getSaldo());
			System.out.println("CA :" + ca.getSaldo());
		}
}
