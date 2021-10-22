package com.webapp.webshop.handler;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileHandler {

    public static <T> void saveObjectsToFile(List<T> objects, String filename) {
        File file = new File("..//" + filename);

        try (ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream(file.getAbsolutePath()))) {
            for (T object : objects) {
                stream.writeObject(object);
            }
            stream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static <T> void saveObjectToFile(T object, String filename) {
        File file = new File("..//" + filename);

        try (ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream(file.getAbsolutePath()))) {
            stream.writeObject(object);
            stream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static <T> List<T> readObjectsFromFile(Class<T> clazz, String filename) {
        List<T> results = new ArrayList<>();

        File file = new File("..//" + filename);

        try (ObjectInputStream stream = new ObjectInputStream(new FileInputStream(file.getAbsolutePath()))) {
            while (true) {
                T ob = clazz.cast(stream.readObject());
                results.add(ob);
                System.out.println(ob);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return results;
    }
}
