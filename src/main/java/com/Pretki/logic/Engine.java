package com.Pretki.logic;

import com.Pretki.model.Account;
import com.Pretki.model.User;

import java.util.Scanner;

public class Engine {

    private User[] users = new User[10];

    public void start() {
        System.out.println("Witamy w naszym banku");
        System.out.println("Podaj swój login");

        Scanner scanner = new Scanner(System.in);
        NumberGenerator generator = new NumberGenerator(users);

        String login = scanner.next();
        User checkUser = null;

        checkUser = findUser(login, checkUser);

        if (checkUser == null) {
            System.out.println("Konto zostało utworzone");
            User newUser = new User();
            newUser.setLogin(login);

            Account newAccount = createAccount(generator);

            newUser.setAccount(newAccount);

            addUser(newUser);
        }
    }

    private void addUser(User newUser) {
        for (int i = 0; i < users.length; i++) {
            if (users[i] == null) {
                users[i] = newUser;
                break;
            }
        }
    }

    private Account createAccount(NumberGenerator generator) {
        Account newAccount = new Account();
        newAccount.setNumber(generator.generateNumber());
        newAccount.setSumOfMoney(0d);
        return newAccount;
    }

    private User findUser(String login, User checkUser) {
        for (User user : users) {
            if (user != null && login.equals(user.getLogin())) {
                checkUser = user;
                break;
            }
        }
        return checkUser;
    }

    public void printUsers() {
        for (User user : users) {
            System.out.println(user);
        }
    }

}
