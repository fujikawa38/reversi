package com.example.reversi.controller;

import org.springframework.stereotype.Controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

@Controller
public class ReversiContoroller {

	@FXML
	private GridPane boardGrid;

	@FXML
	private Label statusLabel;

	@FXML
	public void initialize() {

	}

}
