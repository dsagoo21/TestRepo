package com.flexon.roaster_pick;

import java.util.Random;
import javax.swing.JOptionPane;

public class Picker {

    public static void main(String[] args) {
        String[] names = {"Abby Truong",
                "Ahmed Mujtaba",
                "Azeez Temitope Olanrewaju",
                "Deep",
                "Diming Chu",
                "Dongshuo Li",
                "Honorinicy",
                "Jason",
                "Junyu Liu",
                "Kelly Liu",
                "Kinjan",
                "Kun Li",
                "Muhammed Umar",
                "Oaz",
                "PQ",
                "Prithviatani",
                "Richard",
                "Sahil Singh Sandhu",
                "Samuel Yang",
                "Scott(Shi-Kai) Jhou",
                "Shahbaz Mansahia",
                "Shahriar Kabir",
                "Shakur",
                "Shrina Patel",
                "Siyu Qiu",
                "Siyu Lei",
                "Sumid",
                "Tao",
                "Trivediakshay",
                "Yan Huang",
                "Zhaosaitong"};
        Random random = new Random();
        int idx = random.nextInt(names.length);
        JOptionPane.showMessageDialog(null,names[idx],"Call Student:",1);

    }
}

