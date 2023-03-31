package trabalhojava;
import java.util.Scanner;

public class SuperClasse {
	//Atributos
	private int capacidadetanque;
	private int numeropassageiros;
	private float valor;
	Scanner scan = new Scanner(System.in);

	//metodos de acesso (setters e getters)
	//Metodos-set
	public void setcapacidadeTanque(int capactanq) {
		this.capacidadetanque = capactanq;
		}
	public void setnumeroPassageiros(int numpass) {
		this.numeropassageiros = numpass;
		}
	public void setpreco(float preco) {
		this.valor = preco;
		}
	//Metodos-get
	public int getcapacidadeTanque() {
		return this.capacidadetanque;
	}
	public int getnumeroPassageiros() {
		return this.numeropassageiros;
		}
	public float getvalor() {
		return this.valor;
		}
	public void EntradaCapacidadeTanque() {
		System.out.print("Capacidade do tanque(numeros): ");
		setcapacidadeTanque(Integer.parseInt(scan.nextLine()));
		}
	public void EntradanumeroPassageiros() {
		System.out.print("Numero de Passageiros: ");
		setnumeroPassageiros(Integer.parseInt(scan.nextLine()));
		}
	public void EntradaPreco() {
		System.out.print("Valor: ");
		setpreco(Float.parseFloat(scan.nextLine()));
		}
	public void Cadastrar() {
		EntradaCapacidadeTanque();
		EntradanumeroPassageiros();
		EntradaPreco();
		}
	public void Imprimir() {
	System.out.print("Capacidade do tanque(numeros): " + getcapacidadeTanque() + "\n");
	System.out.print("NumeroPassageiros: " + getnumeroPassageiros() + "\n");
	System.out.print("Valor: " + getvalor() + "\n");
	}
	}
