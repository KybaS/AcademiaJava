package nestedClasses;

import nestedClasses.shell.Computer;

public class Users {
    public static void main(String[] args) {

        Computer pc = new Computer();

        pc.processor.start();
        pc.disc.loading(true);
        pc.disc.formating(false);
        pc.processor.shutDown();
    }
}
