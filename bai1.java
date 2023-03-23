/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labchap5;

/**
 *
 * @author nhatm
 */
import java.util.Scanner;

public class bai1 {
    /**
     * @param args the command line arguments
     */
    public static class chuyenxe
     {
        public double doanhthu;

        public double getDoanhthu() {
            return doanhthu;
        }

        public void setDoanhthu(double doanhthu) {
            this.doanhthu = doanhthu;
        }
          public chuyenxe(){}
        public chuyenxe(double doanhthu) {
            this.doanhthu = doanhthu;
        }
        public void doanhthu(){
            System.out.println("doanh thu la");
        }
    }
    public static class chuyenxenoithanh extends chuyenxe{
        public int masochuyen;
        public String hotentaixe;
        public String soxe;
        public int sotuyen;
        public double sokmdiduoc;

        public int getMasochuyen() {
            return masochuyen;
        }

        public void setMasochuyen(int masochuyen) {
            this.masochuyen = masochuyen;
        }

        public String getHotentaixe() {
            return hotentaixe;
        }

        public void setHotentaixe(String hotentaixe) {
            this.hotentaixe = hotentaixe;
        }

        public String getSoxe() {
            return soxe;
        }

        public void setSoxe(String soxe) {
            this.soxe = soxe;
        }

        public int getSotuyen() {
            return sotuyen;
        }

        public void setSotuyen(int sotuyen) {
            this.sotuyen = sotuyen;
        }

        public double getSokmdiduoc() {
            return sokmdiduoc;
        }

        public void setSokmdiduoc(double sokmdiduoc) {
            this.sokmdiduoc = sokmdiduoc;
        }
        public chuyenxenoithanh() {
        }
        public chuyenxenoithanh(int masochuyen, String hotentaixe, String soxe, int sotuyen, double sokmdiduoc) {
            this.masochuyen = masochuyen;
            this.hotentaixe = hotentaixe;
            this.soxe = soxe;
            this.sotuyen = sotuyen;
            this.sokmdiduoc = sokmdiduoc;
        }

        @Override
        public String toString() {
            return "chuyenxenoithanh{" + "masochuyen=" + masochuyen + ", hotentaixe=" + hotentaixe + ", soxe=" + soxe + ", sotuyen=" + sotuyen + ", sokmdiduoc=" + sokmdiduoc + '}';
        }
        @Override
        public void doanhthu() {
            System.out.println("doanh thu la");
        }

    }
    public static class chuyenxengoaithanh extends chuyenxe{
        public int masochuyen;
        public String hotentaixe;
        public String soxe;
        public String noiden;
        public double songaydiduoc;
        public int getMasochuyen() {
            return masochuyen;
        }

        public void setMasochuyen(int masochuyen) {
            this.masochuyen = masochuyen;
        }

        public String getHotentaixe() {
            return hotentaixe;
        }

        public void setHotentaixe(String hotentaixe) {
            this.hotentaixe = hotentaixe;
        }

        public String getSoxe() {
            return soxe;
        }

        public void setSoxe(String soxe) {
            this.soxe = soxe;
        }

        public String getNoiden() {
            return noiden;
        }

        public void setNoiden(String noiden) {
            this.noiden = noiden;
        }

        public double getSongaydiduoc() {
            return songaydiduoc;
        }

        public void setSongaydiduoc(double songaydiduoc) {
            this.songaydiduoc = songaydiduoc;
        }

        public chuyenxengoaithanh(int masochuyen, String hotentaixe, String soxe, String noiden, double songaydiduoc, double doanhthu) {
            super(doanhthu);
            this.masochuyen = masochuyen;
            this.hotentaixe = hotentaixe;
            this.soxe = soxe;
            this.noiden = noiden;
            this.songaydiduoc = songaydiduoc;
        }
       public chuyenxengoaithanh(){}

        @Override
        public String toString() {
            return "chuyenxengoaithanh{" + "masochuyen=" + masochuyen + ", hotentaixe=" + hotentaixe + ", soxe=" + soxe + ", noiden=" + noiden + ", songaydiduoc=" + songaydiduoc + '}';
        }

        @Override
       public void doanhthu(){
        System.out.println("12312");
    }

    }
    public class Danhsachchuyexe{
        public void nhapmang(int a[],int n){
            Scanner sc=new Scanner(System.in);
            for(int i=0;i<n;i++){
                System.out.println("nhap chuyen xe thu"+i);
                a[i]=sc.nextInt();
            }
        }
        public void xuatmang(int a[],int n){
             Scanner sc=new Scanner(System.in);
             for(int i=0;i<n;i++){
                System.out.println("cac chuyen xe da nhap la"+a[i]);
             }
        }
    }
    public static void main(String[] args) {
        chuyenxe cx= new chuyenxe();
        chuyenxe noithanh =new chuyenxenoithanh();
        noithanh.doanhthu();
        chuyenxe ngoaithanh=new chuyenxengoaithanh();
        ngoaithanh.doanhthu();
       }
        
}
    

