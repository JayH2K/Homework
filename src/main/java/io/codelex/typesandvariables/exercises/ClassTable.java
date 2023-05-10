package io.codelex.typesandvariables.exercises;
import javax.swing.*;

public class ClassTable {
    public static void main(String[] arg) {
        String[] columnNames = {"Nr","class","Name"};
        Object[][] data = {
                {new String("1"), new String("Home Economics"), new String("Ms Pearl")},
                {new String("2"), new String("Math"), new String("Mr Garrison")},
                {new String("3"), new String("Computer Lab"), new String("Mr Mackey")},
                {new String("4"), new String("Science"), new String("Mr Sins")},
                {new String("5"), new String("Chemistry"), new String("Mr White")},
                {new String("6"), new String("Physical Education"), new String("Ms Kuznetsova")},
                {new String("7"), new String("Spanish II"), new String("Mr Gonzales")},
                {new String("8"), new String("History"), new String("Ms Einstein")},
                {new String("9"), new String("French XIV"), new String("Mr Louis")},
        };
        JTable table = new JTable(data, columnNames);
        JFrame frame = new JFrame();
        frame.add(table);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
