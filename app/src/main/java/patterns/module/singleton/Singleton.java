package patterns.module.singleton;

class Singleton {

    /*
    * 1.Tworzy jedną instancja obiektu danej klasy
    * 2.Dostęp do singletonu jest globalny;
    *
    * 3.Jeśli używany z activity moze powodować memory leak
    * 4.Bibloteki z singletonem (Knox)
    * */
    private static Singleton singleton = null;

    private Singleton(){

    }

    static synchronized Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }

        return singleton;
    }
}
