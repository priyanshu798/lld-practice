package designPatterns.builder;

public class User {

    String name;
    int age;
    String email;

    User(UserBuilder userBuilder) {
        this.age = userBuilder.age;
        this.name = userBuilder.name;
        this.email = userBuilder.email;
    }
}
