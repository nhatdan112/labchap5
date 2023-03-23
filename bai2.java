/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labchap5;

/**
 *
 * @author nhatm
 */
import java.util.ArrayList
public class bai2 {

    /**
     * @param args the command line arguments
     */
    public static class hinh{
        public double dienTich(double dientich){
            System.out.println("dientich la");
            return dientich;
        }
    }
    public static class hinhchunhat extends hinh{
        public float cd;
        public float cr;

        public float getCd() {
            return cd;
        }

        public void setCd(float cd) {
            this.cd = cd;
        }

        public float getCr() {
            return cr;
        }

        public void setCr(float cr) {
            this.cr = cr;
        }
         
        public hinhchunhat(float cd, float cr) {
            this.cd = cd;
            this.cr = cr;
        }
        public hinhchunhat(){}

        @Override
        public String toString() {
            return "hinhchunhat{" + "cd=" + cd + ", cr=" + cr + '}';
        }

        @Override
        public double dienTich(double dientich) {
            System.out.println("dien tich la "+ dientich);
            return dientich=cd*cr;
        }
        
        
    }
    public static class hinhtron extends hinh{
        public float r=2.0f;

        public float getR() {
            return r;
        }

        public void setR(float r) {
            this.r = r;
        }

        public hinhtron(float r) {
            this.r = r;
        }
         public hinhtron(){}
        @Override
        public String toString() {
            return "hinhtron{" + "r=" + r + '}';
        }
        
        @Override
        public double dienTich(double dientich) {
            System.out.println("dien tich la " +dientich);
            return dientich=r*r*Math.PI;
        }
        public class danhsachhinh{
            ArrayList<hinh>hinh=new ArrayList<hinh>();
            public danhsachhinh(){}
            public void them(ArrayList hinh){
                System.out.println("them hinh ");
            }
            public void Indanhsach(){
                System.out.println("danh sach hinh la"+hinh);
            }
            
        }
    }
    public static void main(String[] args) {
        hinh moi=new hinh();
        hinh cn =new hinhchunhat();
        cn.dienTich(0);
        hinh tron=new hinhtron();
        tron.dienTich(0);
        
    }
    
}
