package ss2_loop_java.baitap;

public class HienThi20SoNguyentoDauTien {
    public static void main(String[] args) {
        int n = 2;
        int dem = 0;
        while(dem < 20){
            if(n>=2){
                boolean check = true;
                for(int i = 2; i <= Math.sqrt(n); i++){
                    if(n%i==0){
                        check = false;
                        break;
                    }
                }
                if(check==true){
                    System.out.print(n+" ");
                    dem++;
                }
                n++;
            }
        }
    }
}
