package trabalhojava;
import java.util.Scanner;

public class ClasseNavio extends SuperClasse {
	//Atributos
	private String nome;
	private int numerotripulantesnavio;
	private String datalancamento;
	//Metodo
	//Metodos-set
	public void setnome(String no) {
		this.nome = no;
		}
	public void setnumeroTripulantes(int numt) {
		this.numerotripulantesnavio = numt;
		}
	public void setdataLancamento(String dataL) {
		this.datalancamento = dataL;
		}
	//Metodos-get
	public String getnome() {
		return this.nome;
		}
	public int getnumeroTripulantes() {
		return this.numerotripulantesnavio;
		}
	public String getdataLancamento() {
		return this.datalancamento;
		}
	public void passageirosportripulante() {
		int passag = getnumeroPassageiros();
		int tripulantes = getnumeroTripulantes();
		float divisao = (passag / tripulantes);
		if (passag >= tripulantes ) {
			System.out.println("numero de passageiros x tripulantes = " + divisao );
			} else {
				System.out.println("numero de tripulantes é maior do que o de  passageiros ");
				}
		        }
	public void InsercaoNumerodeTripulantes() {
		System.out.print("Numero de Tripulantes: ");
		setnumeroTripulantes(Integer.parseInt(scan.nextLine()));
		}
	public void Cadastrar() {
		Scanner scan = new Scanner(System.in);
		super.Cadastrar();
		InsercaoNumerodeTripulantes();
		}
	public void Imprimir() {
		super.Imprimir();
		System.out.print("Numero de Tripulantes: " + getnumeroTripulantes() + "\n");
		passageirosportripulante();
		}
	}
