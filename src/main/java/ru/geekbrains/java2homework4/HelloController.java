package ru.geekbrains.java2homework4;


import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;


public class HelloController {

    @FXML
    private TextField textChat;

    @FXML
    private TextArea windowChat;


    @FXML
    void enterText() {

        if (textChat.getText().equals("")) {
            return;
        }
        windowChat.appendText("\n" + textChat.getText());
        textChat.setText("");


        /*String textString = textChat.getText().trim();
        windowChat.setText(textString);*/
        // вариант без сохранения текста и переноса строки

    }

    @FXML
    void initialize() {

    }

}
