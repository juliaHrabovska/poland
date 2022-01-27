package com.test.serialization;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.Base64;

public class UserInfo implements Externalizable {

    private static final long SERIAL_VERSION_UID = 1L;

    private String firstName;
    private String lastName;
    private String superSecretInformation;

    public UserInfo() {
    }

    public UserInfo(String firstName, String lastName, String superSecretInformation) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.superSecretInformation = superSecretInformation;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSuperSecretInformation() {
        return superSecretInformation;
    }

    public void setSuperSecretInformation(String superSecretInformation) {
        this.superSecretInformation = superSecretInformation;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", superSecretInformation='" + superSecretInformation + '\'' +
                '}';
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(this.getFirstName());
        out.writeObject(this.getLastName());
        out.writeObject(this.encryptString(this.getSuperSecretInformation()));
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        firstName = (String) in.readObject();
        lastName = (String) in.readObject();
        superSecretInformation = this.decryptString((String) in.readObject());
    }

    private String encryptString(String data) {
        String encryptedData = Base64.getEncoder().encodeToString(data.getBytes());
        System.out.println(encryptedData);
        return encryptedData;
    }

    private String decryptString(String data) {
        String decrypted = new String(Base64.getDecoder().decode(data));
        System.out.println(decrypted);
        return decrypted;
    }

    public static void main(String[] args) {
        UserInfo serializedUserInfo = new UserInfo("Ivan", "Ivanov", "Ivan Ivanov's passport data");

        try (FileOutputStream fileOutputStream = new FileOutputStream("src/com/test/test_serialization.txt");
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(serializedUserInfo);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileInputStream fileInputStream = new FileInputStream("src/com/test/test_serialization.txt");
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            UserInfo userInfo = (UserInfo) objectInputStream.readObject();
            System.out.println(userInfo);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}