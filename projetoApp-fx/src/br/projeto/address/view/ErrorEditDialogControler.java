package br.projeto.address.view;
public class ErrorEditDialogControler {

/*    @FXML
    private TextField erroField;
    @FXML
    private TextField solucaoField;
    @FXML
    private TextField categoriaField;
    @FXML
    private TextField dataField;


    private Stage dialogStage;
    private InformacaoErro infErro;
    private boolean okClicked = false;

    @FXML
    private void initialize() {
    }

    public void setDialogStage(Stage dialogStage) {
        this.dialogStage = dialogStage;
    }

    public void setErro(InformacaoErro erro) {
        this.infErro = erro;

        erroField.setText(erro.getErro());
        //solucaoField.setText(erro.getSolucao());
        categoriaField.setText(erro.getCategoria());
        //dataField.setPromptText("dd.mm.yyyy");
    }
*/
  /*  public boolean isOkClicked() {
        return okClicked;
    }

    @FXML
    private void handleOk() {
        if (isInputValid()) {
            infErro.setErro(erroField.getText());
            infErro.setSolucao(solucaoField.getText());
            infErro.setCategoria(categoriaField.getText());
            infErro.setData(DateUtil.parse(dataField.getText()));

            okClicked = true;
            dialogStage.close();
        }
    }

    @FXML
    private void handleCancel() {
        dialogStage.close();
    }

    private boolean isInputValid() {
        String errorMessage = "";

        if (erroField.getText() == null || erroField.getText().length() == 0) {
            errorMessage += "Nome do erro inv�lido!\n"; 
        }
        if (solucaoField.getText() == null || solucaoField.getText().length() == 0) {
            errorMessage += "Solucao inv�lido!\n"; 
        }
        if (categoriaField.getText() == null || categoriaField.getText().length() == 0) {
            errorMessage += "Categoria inv�lida!\n"; 
        }

        if (dataField.getText() == null || dataField.getText().length() == 0) {
            errorMessage += "Data inv�lida!\n";
        } else {
            if (!DateUtil.validDate(dataField.getText())) {
                errorMessage += "Data inv�lido. Use o formato dd.mm.yyyy!\n";
            }
        }

        if (errorMessage.length() == 0) {
            return true;
            
        } else {
            Alert alert = new Alert(AlertType.ERROR);
                      alert.setTitle("Campos Inv�lidos");
                      alert.setHeaderText("Por favor, corrija os campos inv�lidos");
                      alert.setContentText(errorMessage);
                alert.showAndWait();
                
            return false;
        }
    }*/
}
