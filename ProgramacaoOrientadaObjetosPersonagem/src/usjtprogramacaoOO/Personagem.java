	package usjtprogramacaoOO;
	
	public class Personagem {
	//atributos
	String nome;
	private int energia ;
	private int fome ;
	private int sono ;
	
	//construtor
	
	public Personagem (int energia, int fome, int sono) {
		if(energia >=0 && energia <= 10) {
			this.energia = energia;
		}
		
		if(fome >= 0 && fome <= 10) {
			this.fome = fome;
		}
		
		if(sono >= 0 && sono <= 10) {
			this.sono = sono;
		}
	}
	
	//sobrecarga de construtor
	public Personagem (String nome, int energia, int fome, int sono) {
		this(energia,fome,sono);
		this.nome = nome;
	}
	
	
	public Personagem (){
		
	}
	
	
	//metodos
		void cacar() {
			if(energia >= 2) {
				System.out.println("\n" + nome + " cacando");
				energia = energia - 2;
			}
			else {
				System.out.println( "\n" + nome + " esta sem energias para cacar");
			}
			//atribuição de valores no intervalo [0, 10].
			fome = Math.min (10,fome + 1); //Metodo minimo
			sono = Math.min (10,sono + 1);
		}
			
		void comer () {
			if(fome >= 1) {
				System.out.println("\n"+ nome +  " comendo");
				fome = fome -1;
				energia = Math.min(10, energia + 1);
			}
			else {
				System.out.println("\n" + nome + " esta sem fome");
			}
		}
		
		void dormir() {
			if(sono >= 1) {
				System.out.println("\n" + nome +  " dormindo");
				sono = sono - 1;
				energia = energia + 1 > 10 ? 10: energia + 1;
			}
			else {
				System.out.println("\n" + nome + " esta sem sono");
			}
		}
		
		String informacoes () {
				String s = "\nComo " + nome + " esta agora:" + "\nenergia = " + energia + "\nfome = " + fome +"\nsono = " + sono;
				return s;
			}
			
	
	}
	
	// os parametros e aquilo que precisa passar para o metodo funcionar