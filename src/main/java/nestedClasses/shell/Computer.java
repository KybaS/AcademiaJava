package nestedClasses.shell;

public class Computer {

    public class Processor {
        private boolean isStart = false;

        public void start() {
            isStart = true;
        }

        public void shutDown() {
            isStart = false;
        }
    }

    public class Disc {
        private boolean isStart = false;

        Disc(){
        }

        Disc(boolean start){
            isStart = start;
        }

        public void loading(boolean start){
            isStart = start;
        }

        public void formating(boolean start) {
            isStart = start;
        }
    }

    public Processor processor = new Processor();
    public Disc disc = new Disc(true);
}
