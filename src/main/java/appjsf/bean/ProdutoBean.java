package appjsf.bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

@ManagedBean
@RequestScoped
public class ProdutoBean {

	private Produto produto;
	private static List<Produto> lista;
	
	private DataModel<Produto> produtos;

	public String adicionaForm() {
		produto = new Produto();
		return "produto_form";
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public DataModel<Produto> getProdutos() {
		lista = new ArrayList<Produto>();
		lista.add(new Produto("Iphone", 9000.0));
		lista.add(new Produto("xiaomi", 1000.0));
		produtos = new ListDataModel<Produto>(lista);
		return produtos;
	}

	public void setProdutos(DataModel<Produto> produtos) {
		this.produtos = produtos;
	}
	
	
	
	
	
}
