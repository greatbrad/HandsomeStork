/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hom.jama.HawkStats.ui;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
/**
 *
 * @author Dad
 */
public class HawksStatsUI extends Application{
private static Logger log = LogManager.getLogger( HawksStatsUI.class );
    @Override
    public void start(Stage mainStage) throws Exception {
        log.debug("getting FXML document");
        Parent root = FXMLLoader.load(getClass().getResource("HawkStatsFXML.fxml"));
        
        Scene scene = new Scene(root);
        
        mainStage.setScene(scene);
        mainStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}
