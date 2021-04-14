// Lop con ke 
package AsmFinal;

/**
 *
 * @author Nguyen Truc
 */
public class PhoneBook extends Person{
    
    public String numberPhone;
    public String email;
    public String note;
    
    public PhoneBook() {
    }

    public PhoneBook(String numberPhone, String email, String note) {
        this.numberPhone = numberPhone;
        this.email = email;
        this.note = note;
    }

    public PhoneBook(String numberPhone, String email, String note, String ho, String tenDem, String ten, int namSinh, String gioiTinh) {
        super(ho, tenDem, ten, namSinh, gioiTinh);
        this.numberPhone = numberPhone;
        this.email = email;
        this.note = note;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public void inraManhinhPhone() {
//        super.inraManhinh(); //To change body of generated methods, choose Tools | Templates.
    System.out.println("Họ : "+getHo()+", tên đệm : "+getTenDem()+", tên : "+getTen()+", năm sinh : "+getNamSinh()+", giới tính : "+getGioiTinh()+
            " Số điện thoại : "+numberPhone+ " ,Email : "+email+" ,Ghi chú : "+note);
    }   
}
