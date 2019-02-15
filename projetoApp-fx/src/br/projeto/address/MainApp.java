package br.projeto.address;
// Alterado do github- haha
import java.io.IOException;

import br.projeto.address.model.InformacaoErro;
import br.projeto.address.view.ErrorOverviewController;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainApp extends Application {

    private Stage primaryStage;
    private VBox ErrorOverview2;

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("ProjetoApp ErrosTi");

        initErrorOverview();
    }
    

    public void initErrorOverview() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("view/ErrorOverview2.fxml"));
            ErrorOverview2 = (VBox) loader.load();
            
            Scene scene = new Scene(ErrorOverview2);
            primaryStage.setScene(scene);
            primaryStage.show();
            
            ErrorOverviewController controller = loader.getController();
            controller.setMainApp(this);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private ObservableList<InformacaoErro> errorData = FXCollections.observableArrayList();

    public MainApp() {

    	errorData.add(new InformacaoErro("Erro no pinpad", "Equipamentos"));
    	errorData.add(new InformacaoErro("Erro na impressora fiscal", "Equipamentos"));
    	errorData.add(new InformacaoErro("Sistema P2K travado", "Sistema"));
    }
  
    public ObservableList<InformacaoErro> getErrorData() {
        return errorData;
    }

    public Stage getPrimaryStage() {
        return primaryStage;
    }

    public static void main(String[] args) {
        launch(args);
    }
    
    
   /* public boolean showErroEditDialog(InformacaoErro erro) {
    	try {
    		FXMLLoader loader = new FXMLLoader();
    		loader.setLocation(MainApp.class.getResource("view/ErrorEditDialog.fxml"));
    		AnchorPane page = (AnchorPane) loader.load();
    		
    		Stage dialogStage = new Stage();
    		dialogStage.setTitle("Edit Erro");
    		dialogStage.initModality(Modality.WINDOW_MODAL);
    		dialogStage.initOwner(primaryStage);
    		Scene scene = new Scene(page);
    		dialogStage.setScene(scene);
    		
    		ErrorEditDialogControler controller = loader.getController();
    		controller.setDialogStage(dialogStage);
    		controller.setErro(erro);
    		
    		dialogStage.showAndWait();
    		
    		return controller.isOkClicked();
    	} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
    }*/
    
    
    
    
}
