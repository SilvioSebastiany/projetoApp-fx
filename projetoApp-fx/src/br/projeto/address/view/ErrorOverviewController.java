package br.projeto.address.view;

import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.time.LocalDate;
import java.time.LocalDateTime;

import br.projeto.address.MainApp;
import br.projeto.address.Util.DateUtil;
import br.projeto.address.model.InformacaoErro;

public class ErrorOverviewController {
	
	@FXML
	private TableView<InformacaoErro> erroTiTable;
    @FXML
    private TableColumn<InformacaoErro, String> erroColumn;
    @FXML
    private TableColumn<InformacaoErro, String> categoriaColumn;
    @FXML
    private TableColumn<InformacaoErro, String> dataColumn;
    
  /*  @FXML
    private Label erroLabel;
    @FXML
    private Label solucaoLabel;
    @FXML
    private Label categoriaLabel;
    @FXML
    private Label dateLabel;
	*/
    
    
    private MainApp mainApp;


    @FXML
    private void initialize() {
        erroColumn.setCellValueFactory(p -> p.getValue().erroProperty());
        categoriaColumn.setCellValueFactory(p -> p.getValue().categoriaProperty());
        dataColumn.setCellValueFactory(p -> p.getValue().getHojeFormatado());
        /*dataColumn.setCellValueFactory(
        		p ->{
        			SimpleStringProperty property = new SimpleStringProperty();
        			property.setValue(DateUtil.format(p.getValue().));
        		});*/
        

        
        
        
        //showInformacaoErrorDetails(null);

       // erroTiTable.getSelectionModel().selectedItemProperty().addListener(
       //       (observable, oldValue, newValue) -> showInformacaoErrorDetails(newValue));
    }

    
    public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;

        erroTiTable.setItems(mainApp.getErrorData());
    }
    
    
    
    /*private void showInformacaoErrorDetails(InformacaoErro erro) {
        if (erro != null) {
            erroLabel.setText(erro.getErro());
            solucaoLabel.setText(erro.getSolucao());
            categoriaLabel.setText(erro.getCategoria());
            dateLabel.setText(DateUtil.format(erro.getData()));

        } else {
        	erroLabel.setText("");
            erroColumn.setText("");
            solucaoColumn.setText("");
            categoriaLabel.setText("");
            dateLabel.setText("");
        }
    }*/
    
  /*  @FXML
    private void handleDeleteErro() {
        int selectedIndex = erroTiTable.getSelectionModel().getSelectedIndex();
        if (selectedIndex >= 0) {
        	erroTiTable.getItems().remove(selectedIndex);
        	
        } else {
        	Alert alert = new Alert(AlertType.WARNING);
            alert.setTitle("Nenhuma seleção");
            alert.setHeaderText("Nenhum Erro Selecionado");
            alert.setContentText("Por favor, selecione uma linha na tabela.");

            alert.showAndWait();
   
        }
    }*/
    
   /* 
    @FXML
    private void handleNewError() {
        InformacaoErro tempErro = new InformacaoErro();
        boolean okClicked = mainApp.showErroEditDialog(tempErro);
        if (okClicked) {
            mainApp.getErrorData().add(tempErro);
        }
    }

    @FXML
    private void handleEditError() {
    	InformacaoErro selectedErro = erroTiTable.getSelectionModel().getSelectedItem();
        if (selectedErro != null) {
            boolean okClicked = mainApp.showErroEditDialog(selectedErro);
            if (okClicked) {
                showInformacaoErrorDetails(selectedErro);
            }

        } else {
            Alert alert = new Alert(AlertType.WARNING);
                alert.setTitle("Nenhuma seleção");
                alert.setHeaderText("Nenhuma Pessoa Selecionada");
                alert.setContentText("Por favor, selecione uma pessoa na tabela.");
                alert.showAndWait();
        }
    }*/
     
}
