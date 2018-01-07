package Main;

import com.zyl.Config.Image_Config;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Illustrate{
	public Illustrate() {
		Stage stage=new Stage();
		GridPane gridPane=new GridPane();
		BorderPane pane=new BorderPane();
		HBox hbox=new HBox();
			
		Text text=new Text("��Ϸ����");
		text.setFont(Font.font(30));
		hbox.setStyle("-fx-border-width:6;-fx-border-color:RED");
		hbox.getChildren().add(text);
		hbox.setAlignment(Pos.CENTER);
		pane.setTop(hbox);
		
		Label label=new Label();
		label.setGraphic(new ImageView(Image_Config.enemy_plane));
		gridPane.add(label, 0, 0);
		Text text1=new Text("��ͼ�α�ʾ�з��ɻ�");
		gridPane.add(text1, 1, 0);
		
		Label label1=new Label();
		label1.setGraphic(new ImageView(Image_Config.fire));
		gridPane.add(label1, 0, 1);
		Text text2=new Text("�������ͼ�κ�ͻ���˫������");
		gridPane.add(text2, 1, 1);
		
		Label label2=new Label();
		label2.setGraphic(new ImageView(Image_Config.new_live));
		gridPane.add(label2, 0, 2);
		Text text3=new Text("�������ͼ�κ�ͻ�����һ������");
		gridPane.add(text3, 1, 2);
		
		Label label3=new Label();
		label3.setGraphic(new ImageView("com/res/miniPlane.png"));
		gridPane.add(label3, 0, 3);
		Text text4=new Text("����������ٿصķɻ�");
		gridPane.add(text4, 1, 3);
		
		Label label4=new Label("�淨˵����");
		label4.setTextFill(Color.RED);
		label4.setFont(Font.font("Times",20));
		gridPane.add(label4, 0, 4);
		TextArea texts=new TextArea("\n\rÿ�λ���һ�ܵл����ܵ���֣�"
				+ "�ӵ���������ǻ��һ����������������¾ͻ��˫���Ļ�����\n\r�÷�ÿ����100���л����ٶȾͻ�����1��"
				+ "\n\r����Ƴ���Ϸ���棬��Ϸ����ͣ\n\r");
		texts.setEditable(false);
		texts.setPrefColumnCount(20);
		texts.setPrefRowCount(8);
		texts.setWrapText(true);
		texts.setStyle("-fx-border-color:red;-fx-border-width:3");
		gridPane.add(texts, 1, 4);
		Button button=new Button("��֪����");
		HBox hbox1=new HBox();
		hbox1.setAlignment(Pos.CENTER);
		hbox1.getChildren().add(button);
		pane.setBottom(hbox1);
		hbox1.setPadding(new Insets(10,10,10,10));
		button.setOnAction(e->{
			stage.close();
		});
		
		gridPane.setAlignment(Pos.CENTER);
		gridPane.setHgap(60);
		gridPane.setVgap(10);
		pane.setCenter(gridPane);
		
		Scene scene=new Scene(pane, 600,600);
		stage.setTitle("˵��");
		stage.setScene(scene);
		stage.show();
	}
}
