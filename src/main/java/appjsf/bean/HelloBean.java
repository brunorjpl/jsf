package appjsf.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class HelloBean {

	private String mensagem = "Ol� Jsf mundo";

	public String getMensagem() {
		return mensagem;
	}

	
	
	
}
