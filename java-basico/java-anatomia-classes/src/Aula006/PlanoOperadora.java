package Aula006;

public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "M";
        /* 
        if (plano == "B") {
            System.out.println("100 minutos de ligação");
        }else if (plano == "M") {
            System.out.println("100 minutos de ligação");
            System.out.println("WhatsApp e Instagram gratis");
        }else if (plano == "T"){
            System.out.println("100 minutos de ligação");
            System.out.println("WhatsApp e Instagram gratis");
            System.out.println("5Gb Youtube");
        }
        */

        switch (plano) {
            case "T": {
                System.out.println("5Gb Youtube");
            }
            case "M":{
                System.out.println("WhatsApp e Instagram gratis");
            }
            case "B":{
                System.out.println("100 minutos de ligação");
            }
        }
    }
}
