package com.example.reversi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

@SpringBootApplication
public class ReversiApplication extends Application {

	private ConfigurableApplicationContext springContext;
	private Parent root;

	@Override
	public void init() throws Exception {
		springContext = SpringApplication.run(ReversiApplication.class);
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/reversi.fxml"));
		fxmlLoader.setControllerFactory(springContext::getBean);
		root = fxmlLoader.load();
	}

	@Override
	public void start(Stage stage) throws Exception {
		stage.setTitle("リバーシ");
		Scene scene = new Scene(root, 600, 600);
		stage.setScene(scene);
		stage.show();
	}

	@Override
	public void stop() throws Exception {
		springContext.close();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
