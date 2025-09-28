package com.dev.alan.patterns.behavioral.mediator;

public class Application {
    public static void main(String[] args) {
        ChatMediator mediator = new ChatMediatorImpl();

        User user1 = new UserImpl(mediator, "Alan");
        User user2 = new UserImpl(mediator, "Maria");
        User user3 = new UserImpl(mediator, "Joao");

        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);

        user1.send("Ola pessoal!");
        user2.send("Oi Alan!");
    }
}
