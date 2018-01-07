package Main;

import com.zyl.Entity.RankingList;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MainFrame extends Application{
	MainCanvas canvas=new MainCanvas();
	public void start(Stage stage) throws Exception {
		MenuBar menuBar=new MenuBar();
		Menu exit=new Menu("�˳�");
		exit.setMnemonicParsing(true);/*�ȼ�*/
		Menu help=new Menu("����");
		help.setMnemonicParsing(true);
		Menu ranking_List=new Menu("����");
		ranking_List.setMnemonicParsing(true);
		menuBar.getMenus().addAll(help,ranking_List,exit);
		
		MenuItem miExit=new MenuItem("�˳�");
		MenuItem miHelp=new MenuItem("��Ϸ�淨");
		MenuItem miRank=new MenuItem("���а�");
		help.getItems().add(miHelp);
		exit.getItems().add(miExit);
		ranking_List.getItems().add(miRank);
		miExit.setOnAction(e->{
			stage.close();
		});
		miHelp.setOnAction(e->{
			Illustrate illustrate=new Illustrate();
		});
		miRank.setOnAction(e->{
			RankingList list=new RankingList();
		});
		BorderPane pane=new BorderPane();
		pane.setCenter(canvas);
		pane.setTop(menuBar);
		
		Scene scene=new Scene(pane,MainCanvas.WIDTH,MainCanvas.HEIGHT);
		stage.setScene(scene);
		stage.setTitle("��ɻ�С��Ϸ");
		stage.show();
	}
}
