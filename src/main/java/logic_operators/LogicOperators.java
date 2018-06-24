package logic_operators;

public class LogicOperators {
    public static void main(String[] args) {

        int gold = 0, silver = 0, bronze = 0;

        System.out.println("General amount of medals are " + (gold + silver + bronze));

        if (gold > 0 && silver > 0 && bronze >0){   // && means AND
            System.out.println("Our team have all type of medals");
            }else{
            System.out.println("Our team doesn't have all type of medals");
        }

        if (gold > 0 || silver > 0 || bronze > 0){  // || means OR
            System.out.println("Our team have minimum one medal");
        }else {
            System.out.println("Our team doesn't have medals at all");
        }

//        if (gold > 0){
//            if (silver > 0){
//                if (bronze > 0){
//                    System.out.println("Our team have all type of medals");
//                }
//            }
//        }
    }
}
