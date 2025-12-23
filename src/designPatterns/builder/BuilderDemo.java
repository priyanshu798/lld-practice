package designPatterns.builder;

public class BuilderDemo {

    static void main() {
        UserBuilder userBuilder = new UserBuilder();
        User user1 = userBuilder
                .age(22).name("Priyanshu").build();

        System.out.println(user1.email);
    }



}
