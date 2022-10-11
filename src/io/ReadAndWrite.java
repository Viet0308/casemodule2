package io;
import models.Account;

import java.io.*;
import java.util.ArrayList;


public class ReadAndWrite<E> {
    public void write(ArrayList<E> list, File file) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(list);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ArrayList<E> read(File file){

        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            ArrayList<E> list = (ArrayList<E>) objectInputStream.readObject();
            return list;
        } catch (Exception e) {
            System.err.println("Error!!!");
            return new ArrayList<>();
        }

    }
}
