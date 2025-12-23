package designPatterns.Singleton;

import javax.xml.crypto.Data;

public class Database {
    private static Database instance;
    private static final Object lock = new Object();


    private Database() {

    }

    private static Database getInstance() {
        if (instance == null) {
            synchronized (lock) {
                if (instance == null) {
                    instance = new Database();
                }
            }
        }
        return instance;
    }
}
