// Lop cha
package AsmFinal;

/**
 *
 * @author Nguyen Truc
 */
public class Person {
    //Ho, Ten, TenDem, NamSinh, GioITinh - inRaManHinh())
    private String ho;
    private String tenDem;
    private  String ten;
    private int namSinh;
    private String gioiTinh;
   // Contructor đối số 
    public Person(String ho, String tenDem, String ten, int namSinh, String gioiTinh) {
        this.ho = ho;
        this.tenDem = tenDem;
        this.ten = ten;
        this.namSinh = namSinh;
        this.gioiTinh = gioiTinh;
    }
    // Contructor không đối số
    public Person() {
        
    }

// Getter and Setter
    public String getHo() {
        return ho;
    }
    public void setHo(String ho) {
        this.ho = ho;
    }

    public String getTenDem() {
        return tenDem;
    }

    public void setTenDem(String tenDem) {
        this.tenDem = tenDem;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    
    
    public void inraManhinh() {
        System.out.println("Họ : "+ho+", tên đệm : "+tenDem+", tên : "+ten+", năm sinh : "+namSinh+", giới tính : "+gioiTinh );
    }
    
    
    
}
