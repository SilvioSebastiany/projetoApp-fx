package br.projeto.address.model;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDate;
import java.time.format.DateTimeFormatter;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class InformacaoErro {
	
    private final StringProperty erro;
    private final StringProperty categoria;
    private final ObjectProperty<LocalDateTime> data;
    //private final StringProperty solucao;
    private final StringProperty hojeFormatado;
    

    public InformacaoErro() {
        this(null, null);
    }

    public InformacaoErro(String erro, String categoria) {
    	
        this.erro = new SimpleStringProperty(erro);
        this.categoria = new SimpleStringProperty(categoria);
        this.data = new SimpleObjectProperty<LocalDateTime>(LocalDateTime.now());
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        this.hojeFormatado = new SimpleStringProperty(data.get().format(formatter));
        
    }
    
    public StringProperty getHojeFormatado() {
		return hojeFormatado;
	}
    
    public void setHojeFormatado(String hojeFormatado) {
        this.hojeFormatado.set(hojeFormatado);
    }
    
    public StringProperty hojeFormatadoProperty() {
        return hojeFormatado;
    }

	public String getErro() {
        return erro.get();
    }

    public void setErro(String erro) {
        this.erro.set(erro);
    }
    
    public StringProperty erroProperty() {
        return erro;
    }

   /* public String getSolucao() {
        return solucao.get();
    }

    public void setSolucao(String solucao) {
        this.solucao.set(solucao);
    }
    
    public StringProperty solucaoProperty() {
        return solucao;
    }*/

    public String getCategoria() {
        return categoria.get();
    }

    public void setCategoria(String categoria) {
        this.categoria.set(categoria);
    }
    
    public StringProperty categoriaProperty() {
        return categoria;
    }

    public LocalDateTime getData() {
        return data.get();
    }

    public void setData(LocalDateTime data) {
        this.data.set(data);
    }
    
    public ObjectProperty<LocalDateTime> dataProperty() {
        return data;
    }

}
