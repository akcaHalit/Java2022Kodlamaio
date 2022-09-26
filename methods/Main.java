public class Main {
    public static void main(String[] args) {

        sayiBulmaca();
    }

    public static void sayiBulmaca() {
        int[] sayılar = new int[]{1, 2, 3, 7, 9, 0};
        int aranacak = 5;
        boolean isExist = false;
        for (int i = 0; i < sayılar.length; i++) {
            if (aranacak == sayılar[i]) {
                isExist = true;
            }
        }
        if (isExist) {
            mesajVer("Sayı mevcuttur:"+aranacak);
        } else {
            System.out.println("Sayı bulunmuyor");
        }
    }

    public static void mesajVer(String mesaj) {

        System.out.println(mesaj);
    }
}