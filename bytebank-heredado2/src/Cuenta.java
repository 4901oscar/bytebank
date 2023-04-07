//entidad Cuenta: 
abstract class Cuenta{
		protected double saldo;
		private int agencia = 1;
		private int numero;
		private Cliente titular = new Cliente();
		
		private static int total;
		
		
		
		public Cuenta(int agencia, int numero) {
			
			this.agencia = agencia;
			this.numero = numero;
			System.out.println("estoy creando una cuenta");
			
			Cuenta.total ++;
		
		}
		
		abstract public  void depositar(double valor);
		
		public boolean retirar(double valor) {
			if(this.saldo >= valor) {
				this.saldo -=  valor;
				return true;
			}else {
				return false;
			}
		
		}
		public boolean transferir(double valor, Cuenta cuenta ){
			if(this.saldo >= valor) {
				this.saldo = this.saldo - valor;
				cuenta.depositar(valor);
				return true;
			}else {
				return false;
				
			}
		}
		public double getSaldo() {
			return this.saldo;
		}
		
		public int getAgencia() {
			return agencia;
		}
		public void setTitular(Cliente titular) {
			this.titular = titular;
		}
		public Cliente getTitular() {
			return titular;
		}
		
		public static int getTotal() {
			return Cuenta.total;
		}
	}
	

	