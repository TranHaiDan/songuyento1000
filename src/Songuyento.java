public class Songuyento {
    public static void main(String[] args) {
        // chuoi de chua cac so nguyen to
        String chuoiSoNguyento = "";

        for (int i = 2; i < 1000; i++) {
            boolean laSoNguyento = true;
            for (int num = 2;num * num <= i; num++) {
                if (i % num == 0) {
                    laSoNguyento = false;
                    break;
                }
            }
            if (laSoNguyento) {
                chuoiSoNguyento += i + " ";

            }
        }
        System.out.println("cac so nguyen to tu 1 den 1000 la:");
        System.out.println(chuoiSoNguyento);
    }
}