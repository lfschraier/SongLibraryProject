import javafx.application.Application; 
import javafx.geometry.Insets; 
import javafx.geometry.Pos; 
import javafx.scene.Scene; 
import javafx.scene.control.Button; 
import javafx.scene.layout.GridPane; 
import javafx.scene.text.Text; 
import javafx.scene.control.TextField; 
import javafx.stage.Stage; 
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.event.*;
import javafx.scene.control.*;

public class Main extends Application {
	
	Stage window;
	Scene scene;
	ListView<Song> listView;
	
	Song song1 = new Song("title 1","artist 1");
	Song song2 = new Song("title 2","artist 2");
	Song song3 = new Song("title 3", "artist 3");
	
	public static void main(String[] args) {
		launch(args);
	}
	
	public void start(Stage stage) throws Exception {
		
		/* Initializing the layout */
		window = stage;
		stage.setTitle("Song Library"); 
		GridPane layout = new GridPane();
		layout.setPadding(new Insets(20,20,20,20)); 
		layout.setVgap(8);
		layout.setHgap(10);
		
		/* Texts field for song information */
		
		Label titleLabel = new Label("Title:");
		GridPane.setConstraints(titleLabel, 0, 0);
		
		TextField titleInput = new TextField("Song Title");
		GridPane.setConstraints(titleInput, 1, 0);
		
		Label artistLabel = new Label("Artist:");
		GridPane.setConstraints(artistLabel, 0, 1);
		
		TextField artistInput = new TextField("Artist");
		GridPane.setConstraints(artistInput, 1, 1);
		
		Label albumLabel = new Label("Album:");
		GridPane.setConstraints(albumLabel, 0, 2);
		
		TextField albumInput = new TextField("Album Title");
		GridPane.setConstraints(albumInput, 1, 2);
		
		Label yearLabel = new Label("Year:");
		GridPane.setConstraints(yearLabel, 0, 3);
		
		TextField yearInput = new TextField("Year Released");
		GridPane.setConstraints(yearInput, 1, 3);
		
		/* Buttons */ 
		
		Button newButton = new Button ("Add New");
		GridPane.setConstraints(newButton,0,4);
		
		Button editButton = new Button ("Edit");
		GridPane.setConstraints(editButton,0,5);
		
		Button deleteButton = new Button ("Delete");
		GridPane.setConstraints(deleteButton,1,4);
		
		Button clearButton = new Button("Clear");
		GridPane.setConstraints(clearButton,1,5);
		
		/* ListView for list of songs */
		
		listView = new ListView<>();
		listView.getItems().addAll(song1,song2,song3);
		GridPane.setConstraints(listView, 2, 0, 20, 20);
		listView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
		
		/* Sets up scene for display */
		
		layout.getChildren().addAll(listView, titleLabel, titleInput, artistLabel, artistInput, albumLabel, albumInput, yearLabel, yearInput, newButton, editButton, deleteButton, clearButton);
		scene = new Scene(layout, 550,600);
		window.setScene(scene);
		window.show();
		
		
	}
	
}
