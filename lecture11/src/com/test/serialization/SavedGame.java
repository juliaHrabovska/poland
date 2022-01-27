package com.test.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;

public class SavedGame implements Serializable {

    private static final long SERIAL_VERSION_UID = 1L;

    private String[] players;
    private String[] distance;
    private String[] numberOfLives;

    public SavedGame(String[] players, String[] distance, String[] numberOfLives) {
        this.players = players;
        this.distance = distance;
        this.numberOfLives = numberOfLives;
    }

    public String[] getPlayers() {
        return players;
    }

    public void setPlayers(String[] players) {
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
        String[] players = {"Player 1", "Player 2", "Player 3"};
        String[] distance = {"1567", "79", "2897"};
        String[] numberOfLives = {"2", "3", "1"};

        SavedGame serializedGame = new SavedGame(players, distance, numberOfLives);

//        serialization
        try (FileOutputStream outputStream = new FileOutputStream("src/com/test/test_serialization.txt");
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream)) {
            objectOutputStream.writeObject(serializedGame);
        } catch (IOException e) {
            e.printStackTrace();
        }

//        deserialization
        SavedGame deserializedGame = null;
        try (FileInputStream fileInputStream = new FileInputStream("src/com/test/test_serialization.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)){
            deserializedGame = (SavedGame) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }

        System.out.println(deserializedGame);
    }
}
