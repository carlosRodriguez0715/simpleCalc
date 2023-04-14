/**
 * @author: Carlos Rodriguez
 * Class handles every element of the fxml file as well as
 * arithmetic operations. */

package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;

public class CalculatorController {
	
	@FXML private AnchorPane basePane;
	@FXML private Button btn9, btn8, btn7, btn6, btn5, btn4, btn3, btn2, btn1, btn0, eq, clear, div, mul, sub, add;
	@FXML private TextArea txtArea;
	@FXML private Label opLabel, resultLabel;
	private char op;
	private int result;
	
	@FXML private void initialize() {
		//btn9 hover on and off
		this.btn9.setOnMouseEntered(e -> this.btn9.setStyle("-fx-background-color: #029e89; -fx-border-color: #faa21e; -fx-border-width: 10;"));
		this.btn9.setOnMouseExited(e -> this.btn9.setStyle("-fx-background-color: #00ffee; -fx-border-color: #faa21e; -fx-border-width: 10;"));
		//btn8 hover on and off
		this.btn8.setOnMouseEntered(e -> this.btn8.setStyle("-fx-background-color: #029e89; -fx-border-color: #faa21e; -fx-border-width: 10;"));
		this.btn8.setOnMouseExited(e -> this.btn8.setStyle("-fx-background-color: #00ffee; -fx-border-color: #faa21e; -fx-border-width: 10;"));
		//btn7 hover on and off
		this.btn7.setOnMouseEntered(e -> this.btn7.setStyle("-fx-background-color: #029e89; -fx-border-color: #faa21e; -fx-border-width: 10;"));
		this.btn7.setOnMouseExited(e -> this.btn7.setStyle("-fx-background-color: #00ffee; -fx-border-color: #faa21e; -fx-border-width: 10;"));
		//btn6 hover on and off
		this.btn6.setOnMouseEntered(e -> this.btn6.setStyle("-fx-background-color: #029e89; -fx-border-color: #faa21e; -fx-border-width: 10;"));
		this.btn6.setOnMouseExited(e -> this.btn6.setStyle("-fx-background-color: #00ffee; -fx-border-color: #faa21e; -fx-border-width: 10;"));
		//btn5 hover on and off
		this.btn5.setOnMouseEntered(e -> this.btn5.setStyle("-fx-background-color: #029e89; -fx-border-color: #faa21e; -fx-border-width: 10;"));
		this.btn5.setOnMouseExited(e -> this.btn5.setStyle("-fx-background-color: #00ffee; -fx-border-color: #faa21e; -fx-border-width: 10;"));
		//btn4 hover on and off
		this.btn4.setOnMouseEntered(e -> this.btn4.setStyle("-fx-background-color: #029e89; -fx-border-color: #faa21e; -fx-border-width: 10;"));
		this.btn4.setOnMouseExited(e -> this.btn4.setStyle("-fx-background-color: #00ffee; -fx-border-color: #faa21e; -fx-border-width: 10;"));
		//btn3 hover on and off
		this.btn3.setOnMouseEntered(e -> this.btn3.setStyle("-fx-background-color: #029e89; -fx-border-color: #faa21e; -fx-border-width: 10;"));
		this.btn3.setOnMouseExited(e -> this.btn3.setStyle("-fx-background-color: #00ffee; -fx-border-color: #faa21e; -fx-border-width: 10;"));
		//btn2 hover on and off
		this.btn2.setOnMouseEntered(e -> this.btn2.setStyle("-fx-background-color: #029e89; -fx-border-color: #faa21e; -fx-border-width: 10;"));
		this.btn2.setOnMouseExited(e -> this.btn2.setStyle("-fx-background-color: #00ffee; -fx-border-color: #faa21e; -fx-border-width: 10;"));
		//btn1 hover on and off
		this.btn1.setOnMouseEntered(e -> this.btn1.setStyle("-fx-background-color: #029e89; -fx-border-color: #faa21e; -fx-border-width: 10;"));
		this.btn1.setOnMouseExited(e -> this.btn1.setStyle("-fx-background-color: #00ffee; -fx-border-color: #faa21e; -fx-border-width: 10;"));
		//btn0 hover on and off
		this.btn0.setOnMouseEntered(e -> this.btn0.setStyle("-fx-background-color: #029e89; -fx-border-color: #faa21e; -fx-border-width: 10;"));
		this.btn0.setOnMouseExited(e -> this.btn0.setStyle("-fx-background-color: #00ffee; -fx-border-color: #faa21e; -fx-border-width: 10;"));
		//eq hover on and off
		this.eq.setOnMouseEntered(e -> this.eq.setStyle("-fx-background-color: #029e89; -fx-border-color: #faa21e; -fx-border-width: 10;"));
		this.eq.setOnMouseExited(e -> this.eq.setStyle("-fx-background-color: #00ffee; -fx-border-color: #faa21e; -fx-border-width: 10;"));
		//div hover on and off
		this.div.setOnMouseEntered(e -> this.div.setStyle("-fx-background-color: #029e89; -fx-border-color: #faa21e; -fx-border-width: 10;"));
		this.div.setOnMouseExited(e -> this.div.setStyle("-fx-background-color: #00ffee; -fx-border-color: #faa21e; -fx-border-width: 10;"));
		//mul hover on and off
		this.mul.setOnMouseEntered(e -> this.mul.setStyle("-fx-background-color: #029e89; -fx-border-color: #faa21e; -fx-border-width: 10;"));
		this.mul.setOnMouseExited(e -> this.mul.setStyle("-fx-background-color: #00ffee; -fx-border-color: #faa21e; -fx-border-width: 10;"));
		//sub hover on and off
		this.sub.setOnMouseEntered(e -> this.sub.setStyle("-fx-background-color: #029e89; -fx-border-color: #faa21e; -fx-border-width: 10;"));
		this.sub.setOnMouseExited(e -> this.sub.setStyle("-fx-background-color: #00ffee; -fx-border-color: #faa21e; -fx-border-width: 10;"));
		//add hover on and off
		this.add.setOnMouseEntered(e -> this.add.setStyle("-fx-background-color: #029e89; -fx-border-color: #faa21e; -fx-border-width: 10;"));
		this.add.setOnMouseExited(e -> this.add.setStyle("-fx-background-color: #00ffee; -fx-border-color: #faa21e; -fx-border-width: 10;"));
		//dot hover on and off
		this.clear.setOnMouseEntered(e -> this.clear.setStyle("-fx-background-color: #029e89; -fx-border-color: #faa21e; -fx-border-width: 10;"));
		this.clear.setOnMouseExited(e -> this.clear.setStyle("-fx-background-color: #00ffee; -fx-border-color: #faa21e; -fx-border-width: 10;"));
		
		this.result = 0;
		this.op = 'a';
	}
	
	@FXML private void print(ActionEvent ae) {
		Object obj = ae.getSource();
		Button b = (Button) obj;
		if(obj.equals(this.add) || obj.equals(this.sub) || obj.equals(this.mul) || obj.equals(this.div) || obj.equals(this.eq) || obj.equals(this.clear)) {
			if(obj.equals(this.add)) {
				if(this.result == 0) {
					this.result = Integer.parseInt(this.opLabel.getText());
				}
				this.op = 'a';
				this.opLabel.setText("");
			}
			if(obj.equals(this.sub)) {
				if(this.result == 0) {
					this.result = Integer.parseInt(this.opLabel.getText());
				}
				this.op = 's';
				this.opLabel.setText("");
			}
			if(obj.equals(this.mul)) {
				if(this.result == 0) {
					this.result = Integer.parseInt(this.opLabel.getText());
				}
				this.op = 'm';
				this.opLabel.setText("");
			}
			if(obj.equals(this.div)) {
				if(this.result == 0) {
					this.result = Integer.parseInt(this.opLabel.getText());
				}
				this.op = 'd';
				this.opLabel.setText("");
			}
			if(obj.equals(this.clear)) {
				this.result = 0;
				this.opLabel.setText("");
				this.resultLabel.setText("");
			}
			if(obj == this.eq) {
				switch(this.op) {
					case 'a':
						this.result += Integer.parseInt(this.opLabel.getText());
						this.resultLabel.setText("" + this.result);
						break;
					case 's':
						this.result -= Integer.parseInt(this.opLabel.getText());
						this.resultLabel.setText("" + this.result);
						break;
					case 'm':
						this.result *= Integer.parseInt(this.opLabel.getText());
						this.resultLabel.setText("" + this.result);
						break;
					case 'd':
						int dividedBy = Integer.parseInt(this.opLabel.getText());
						if(dividedBy == 0) {
							Alert alert = new Alert(AlertType.ERROR);
							alert.setContentText("Can't divide by 0, try another number!");
							alert.showAndWait();
						}
						else {
							this.result /= Integer.parseInt(this.opLabel.getText());
							this.resultLabel.setText("" + this.result);
						}
						break;
				}
				this.opLabel.setText("");
			}
		}
		
		else {
			if(this.opLabel.getText().length() < 9) {
				this.opLabel.setText(this.opLabel.getText() + b.getText());
			}
		}
		
	}

	
}