package com.test.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;

public class NotFullySerializableSavedGame implements Serializable {

    private static final long SERIAL_VERSION_UID = 1L;

    private Player[] players;
    private String[] distance;
    private String[] numberOfLives;

    public NotFullySerializableSavedGame(Player[] players, String[] distance, String[] numberOfLives) {
        this.players = players;
        this.distance = distance;
        this.numberOfLives = numberOfLives;
    }

    public Player[] getPlayers() {
        return players;
    }

    public void setPlayers(Player[] players) {
        this.players = players;
    }

    public String[] getDistance() {
        return distance;
    }

    public void setDistance(String[] distance) {
        this.distance = distance;
    }

    public String[] getNumberOfLives() {
        return numberOfLives;
    }

    public void setNumberOfLives(String[] numberOfLives) {
        this.numberOfLives = numberOfLives;
    }

    @Override
    public String toString() {
        return "SavedGame{" +
                "players=" + Arrays.toString(players) +
                ", distance=" + Arrays.toString(distance) +
                ", numberOfLives=" + Arrays.toString(numberOfLives) +
                '}';
    }

    public static void main(String[] args) {
        Player[] players = {
                new Player(10,"Ivan", "Ivanov"),
                new Player(10,"Petr", "Petrov"),
                new Player(10,"Tamara", "Ivanovna")
        };
        String[] distance = {"1567", "79", "2897"};
        String[] numberOfLives = {"2", "3", "1"};

        NotFullySerializableSavedGame serializedGame = new NotFullySerializableSavedGame(players, distance, numberOfLives);

//        serialization
        try (FileOutputStream outputStream = new FileOutputStream("src/com/test/test_serialization.txt");
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream)) {
            objectOutputStream.writeObject(serializedGame);
        } catch (IOException e) {
            e.printStackTrace();
        }

//        deserialization
        NotFullySerializableSavedGame deserializedGame = null;
        try (FileInputStream fileInputStream = new FileInputStream("src/com/test/test_serialization.txt");
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            deserializedGame = (NotFullySerializableSavedGame) objectInputStream.readObject();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println(deserializedGame);
    }
}
