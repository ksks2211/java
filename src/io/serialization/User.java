package io.serialization;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class User implements Serializable {

    private String email;
    transient private String password;
    private String nickname;


    public User(String email, String password, String nickname) {
        this.email = email;
        this.password = password;
        this.nickname = nickname;
    }



    private void readObject(ObjectInputStream in) throws IOException {
        System.out.println("[Read Object]");
        this.email = in.readUTF();
        this.nickname = in.readUTF();
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        System.out.println("[Write Object]");
        out.writeUTF(email);
        out.writeUTF(nickname);
    }


    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", nickname='" + nickname + '\'' +
                '}';
    }
}
