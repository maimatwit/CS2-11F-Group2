package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("Sample12.fxml"));
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
/*
package application;
	
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main extends Application {
    private static final String OFF_STRING = "   ";
    private static final String UP_STRING = ":-)";
    private static final String DOWN_STRING = ":-(";
    private static final Color OFF_COLOR = Color.LIGHTGRAY;
    private static final Color UP_COLOR = Color.LIMEGREEN;
    private static final Color DOWN_COLOR = Color.RED;

    private int count = 20;
    private int score = 0;
    private Button startButton;
    private Button[] buttons;
    private Label timeLabel, scoreLabel;
    private ScheduledExecutorService scheduler;
    private Random random = new Random();

    @Override
    public void start(Stage primaryStage) {
        GridPane grid = new GridPane();
        grid.setHgap(5);
        grid.setVgap(5);

        startButton = new Button("Start");
        startButton.setFont(Font.font("Monospaced", 14));
        startButton.setOnAction(e -> startGame());
        grid.add(startButton, 0, 0, 5, 1);

        timeLabel = new Label("Time Left: " + count);
        grid.add(timeLabel, 0, 1);

        scoreLabel = new Label("Score: " + score);
        grid.add(scoreLabel, 1, 1);

        buttons = new Button[35];
        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new Button(OFF_STRING);
            buttons[i].setFont(Font.font("Monospaced", 14));
            buttons[i].setStyle("-fx-background-color: lightgray;");
            buttons[i].setMinSize(50, 50);
            buttons[i].setOnAction(e -> whackMole((Button) e.getSource()));
            grid.add(buttons[i], i % 7, 2 + i / 7);
        }

        Scene scene = new Scene(grid, 400, 350);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Whack-a-Mole (JavaFX)");
        primaryStage.show();
    }

    private void startGame() {
        startButton.setDisable(true);
        score = 0;
        count = 20;
        updateLabels();

        scheduler = Executors.newScheduledThreadPool(2);

        // Timer countdown
        scheduler.scheduleAtFixedRate(() -> {
            if (count > 0) {
                count--;
                Platform.runLater(this::updateLabels);
            } else {
                endGame();
            }
        }, 1, 1, TimeUnit.SECONDS);

        // Mole movement
        for (Button button : buttons) {
            scheduler.scheduleAtFixedRate(() -> {
                Platform.runLater(() -> toggleMole(button));
            }, random.nextInt(3) + 1, random.nextInt(3) + 1, TimeUnit.SECONDS);
        }
    }

    private void toggleMole(Button button) {
        if (count > 0) {
            if (button.getText().equals(OFF_STRING)) {
                button.setText(UP_STRING);
                button.setStyle("-fx-background-color: limegreen;");
            } else {
                button.setText(OFF_STRING);
                button.setStyle("-fx-background-color: lightgray;");
            }
        }
    }

    private void whackMole(Button button) {
        if (count > 0 && button.getText().equals(UP_STRING)) {
            score++;
            button.setText(DOWN_STRING);
            button.setStyle("-fx-background-color: red;");
            updateLabels();
        }
    }

    private void updateLabels() {
        timeLabel.setText("Time Left: " + count);
        scoreLabel.setText("Score: " + score);
    }

    private void endGame() {
        Platform.runLater(() -> {
            startButton.setDisable(false);
            if (scheduler != null) scheduler.shutdown();
            for (Button button : buttons) {
                button.setText(OFF_STRING);
                button.setStyle("-fx-background-color: lightgray;");
            }
        });
    }

    public static void main(String[] args) {
        launch(args);
    }
}*/
