package io.codelex.typesandvariables.exercises;

import javax.swing.*;

public class ClassTable {
    public static void main(String[] arg) {
        String[] columnNames = {"Nr", "class", "Name"};
        Object[][] data = {
                {"1", "Home Economics", "Ms Pearl"},
                {"2", "Math", "Mr Garrison"},
                {"3", "Computer Lab", "Mr Mackey"},
                {"4", "Science", "Mr Sins"},
                {"5", "Chemistry", "Mr White"},
                {"6", "Physical Education", "Ms Kuznetsova"},
                {"7", "Spanish II", "Mr Gonzales"},
                {"8", "History", "Ms Einstein"},
                {"9", "French XIV", "Mr Louis"},
        };
        JTable table = new JTable(data, columnNames);
        JFrame frame = new JFrame();
        frame.add(table);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
