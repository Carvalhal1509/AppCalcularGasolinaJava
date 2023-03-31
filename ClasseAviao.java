package trabalhojava;
import java.util.Scanner;

public class ClasseAviao extends SuperClasse {
	//Atributos
	private String prefixo;
	private String datarevisao;
	//Metodos
	//Metodos-set
	public void setprefixo(String pref) {
		this.prefixo = pref;
		}
	public void setdataRevisao(String dataR) {
		this.datarevisao = dataR;
		}
	//Metodos-get
	public String getprefixo() {
		return this.prefixo;
		}
	public String getdataRevisao() {
		return this.datarevisao;
		}
	public void reajustapreco() {
		String reajustar;
		String teste = "s";
		float reajuste;System.out.println("Deseja reajustar o preço? digite s para continuar" );
		reajustar = scan.nextLine();
		if (teste.equals(reajustar)) {
			System.out.print("Digite o valor percentual para ajustar o preço, exemplo  50 para 50% de reajuste: ");
			reajuste = Float.parseFloat(scan.nextLine());
			System.out.print("Valor Reajustado: " + (getvalor() * ((reajuste / 100) + 1)) + "\n");
			}
		}
	public void EntradaPrefixo() {
		System.out.print("Digite o prefixo: ");
		setprefixo(scan.nextLine());
		}
	public void EntradadataRevisao() {
		System.out.print("Digite a data de Revisão: ");
		setdataRevisao(scan.nextLine());
		}
	public void Cadastrar() {
		super.Cadastrar();
		EntradadataRevisao();
		EntradaPrefixo();
		}
	public void Imprimir() {
		super.Imprimir();
		getprefixo();
		getdataRevisao();
		reajustapreco();
	}
}
