public class App {
    public static void main(String[] args) throws Exception {
        int ikä = 17;

        //if (ikä >= 0 && ikä < 18)
        if (ikä >= 0 && ikä < 18){
            System.out.println("olet alaikäinen");
        }
        else
        {
            System.out.println("olet täysi-ikäinen");
        }
        if (ikä > 0 && ikä < 18){
            System.out.println("olet ala-ikäinen");
        }
        if (ikä >= 15 ) {
            System.out.println("Saat ajaa mopolla");
        }
            if (ikä >15 && ikä < 18){
                System.out.println("saat ajaa kevarilla");
        }
        else if (ikä >= 66){
            System.out.println("Olet eläkeläinen");
        }
        if (ikä > 0 && ikä < 18){
            System.out.println ("odota autolla ajoa");
        }
        // else
        // {
        //     System.out.println("Olet täysi-ikäinen ja saat ajaa autolla");
        // }
    }
}
