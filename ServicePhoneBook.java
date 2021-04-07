
package AsmFinal;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Nguyen Truc
 */

public class ServicePhoneBook {
    ArrayList<PhoneBook> _lstphone = new ArrayList<>();
    PhoneBook _pb ;
    Scanner _sc = new Scanner(System.in);
    // Tạo liên hệ có sẵn
    void MadeAvailable() {
        PhoneBook pb1 = new PhoneBook("0973919394","email1","note1","Nguyen","Van","Trung",2001,"Nam");
        pb1.inraManhinhPhone();
        _lstphone.add(pb1);
        PhoneBook pb2 = new PhoneBook("0987463553","email2","note2","Nguyen","Van","Thanh",2001,"Nam");
        pb2.inraManhinhPhone();
        _lstphone.add(pb2);
        PhoneBook pb3 = new PhoneBook("0396520888","email3","note3","Tran","Thi","Thanh",2002,"Nu");
        pb3.inraManhinhPhone();
        _lstphone.add(pb3);
        PhoneBook pb4 = new PhoneBook("0962467467","emai4","note4","Nguyen","Van","Duy",2003,"Nu");
        pb4.inraManhinhPhone();
        _lstphone.add(pb4);
        PhoneBook pb5 = new PhoneBook("0972382788","email5","note5","Dang","Thanh","Nam",1999,"Nam");
        pb5.inraManhinhPhone();
        _lstphone.add(pb5);
        PhoneBook pb6 = new PhoneBook("0379801888","emai6","note6","Nguyen","Thi","Huyen",1998,"Nu");
        pb6.inraManhinhPhone();
        _lstphone.add(pb6);
        PhoneBook pb7 = new PhoneBook("0981637068","emai7","note7","Phung","Van","Hung",2003,"Nam"); 
        pb7.inraManhinhPhone();
        _lstphone.add(pb7);
        PhoneBook pb8 = new PhoneBook("0977212620","emai8","note8","Nguyen","Duy","Hao",2000,"Nam");
        pb8.inraManhinhPhone();
        _lstphone.add(pb8);
        PhoneBook pb9 = new PhoneBook("0986354774","email9","note9","Trieu","Thi","Tuyet",2002,"Nu");
        pb9.inraManhinhPhone();
        _lstphone.add(pb9);
        PhoneBook pb10 = new PhoneBook("0964982858","email10","note10","Nguyen","Van","Nam",1998,"Nam");
        pb10.inraManhinhPhone();
        _lstphone.add(pb10);
        PhoneBook pb11 = new PhoneBook("0968859515","email11","note11","Nguyen","Van","Kiet",2000,"Nam");  
        pb11.inraManhinhPhone();
        _lstphone.add(pb11);
        PhoneBook pb12 = new PhoneBook("0377960888","email12","note12","Le","Van","Phuong",2003,"Nam");
        pb12.inraManhinhPhone();
        _lstphone.add(pb12);
        PhoneBook pb13 = new PhoneBook("0365376888","email13","note13","Tran","Thi","Trang",2000,"Nu");
        pb13.inraManhinhPhone();
        _lstphone.add(pb13);
        PhoneBook pb14 = new PhoneBook("0984093443","emai14","note14","Duong","Van","Duc",1998,"Nam");
        pb14.inraManhinhPhone();
        _lstphone.add(pb14);
        PhoneBook pb15 = new PhoneBook("0388579888","emai15","note15","Nguyen","Van","Dung",2002,"Nam");
        pb15.inraManhinhPhone();
        _lstphone.add(pb15);
    }
    // Thêm liên hệ mới
    void AddPerson() {
        int size;
        System.out.println("Bạn muốn thêm bao nhiêu người : ");
        size = Integer.parseInt(_sc.nextLine());
        _sc = new Scanner(System.in);
        for (int i = 0; i <size; i++) {
         _pb= new  PhoneBook();
        System.out.println("Người thứ "+ (i+1));    
        System.out.println("Nhập vào họ : ");
        _pb.setHo(_sc.nextLine());
        System.out.println("Nhập vào tên đệm : ");
        _pb.setTenDem(_sc.nextLine());
        System.out.println("Nhập vào tên : ");
        _pb.setTen(_sc.nextLine());
        System.out.println("Nhập vào năm sinh : ");
        _pb.setNamSinh(Integer.parseInt(_sc.nextLine()));
        System.out.println("Nhập vào giới tính : ");
        _pb.setGioiTinh(_sc.nextLine());
        System.out.println("Nhập vào số điện thoại : ");
        _pb.setNumberPhone(_sc.nextLine());
        System.out.println("Nhập vào email : ");
        _pb.setEmail(_sc.nextLine());
        System.out.println("Nhập vào ghi chú : ");
        _pb.setNote(_sc.nextLine());
        _lstphone.add(_pb);// Nhập xong từng đối tượng và thêm vào danh sách
        }  
    }
    void getAddPerson() {
        for (PhoneBook x : _lstphone) {
            x.inraManhinhPhone();
        }
    }
    // Sửa liên hệ
    void EditPerson() {
        System.out.println("Nhập số điện thoại người liên hệ cần sửa : ");
        String phoneNum = _sc.nextLine();
        for (int i = 0; i < _lstphone.size(); i++) {
        if(phoneNum.equals(_lstphone.get(i).getNumberPhone())){
        int choice;
            System.out.println("1. Sửa họ");
            System.out.println("2. Sửa tên đệm");
            System.out.println("3. Sửa tên");
            System.out.println("4. Sửa năm sinh");
            System.out.println("5. Sửa giới tính");
            System.out.println("6. Sửa số điện thoại");
            System.out.println("7. Sửa email");
            System.out.println("8. Sửa ghi chú");
            System.out.println("Vui lòng nhập lựa chọn : ");
            choice = _sc.nextInt();
        switch(choice) {
            case 1 : 
        _sc = new Scanner(System.in);        
        System.out.println("Nhập vào họ : ");
       String ho = _sc.nextLine();
        _lstphone.get(i).setHo(ho);
        break;
            case 2 :
        _sc = new Scanner(System.in);        
        System.out.println("Nhập vào tên đệm : ");
        String tenDem = _sc.nextLine();
        _lstphone.get(i).setTenDem(tenDem);
        break;
            case 3 :
        _sc = new Scanner(System.in);        
        System.out.println("Nhập vào tên : ");
        String name = _sc.nextLine();
        _lstphone.get(i).setTen(name);
        break;
            case 4 :
        _sc = new Scanner(System.in);        
        System.out.println("Nhập vào năm sinh : ");
        int namSinh = Integer.parseInt(_sc.nextLine());
        _lstphone.get(i).setNamSinh(namSinh);
        break;
            case 5 :
        _sc = new Scanner(System.in);        
        System.out.println("Nhập vào giới tính : ");
        String gioiTinh = _sc.nextLine();
        _lstphone.get(i).setGioiTinh(gioiTinh);
        break;
            case 6 :
        _sc = new Scanner(System.in);        
        System.out.println("Nhập vào số điện thoại : ");
        String numberPhone = _sc.nextLine();
        _lstphone.get(i).setNumberPhone(numberPhone);
        break;
            case 7 :
        _sc = new Scanner(System.in);        
        System.out.println("Nhập vào email : ");
        String email = _sc.nextLine();
        _lstphone.get(i).setEmail(email);
        break;
            case 8:
        _sc = new Scanner(System.in);        
        System.out.println("Nhập vào ghi chú : ");
        String note = _sc.nextLine();
        _lstphone.get(i).setNote(note);
        break;
        }
            }
        }
    }
    void getEditPerson() {
        for (PhoneBook x : _lstphone) {
            x.inraManhinhPhone();
        }
    }
    // Xóa liên hệ
    void DeletePerson() {
        _sc = new Scanner(System.in);
        System.out.println("Nhập số điện thoại liên hệ người cần xóa : "); 
        String phoneNum = _sc.nextLine();
        for (int i = 0; i <_lstphone.size(); i++) {
            if(phoneNum.equals(_lstphone.get(i).numberPhone)){
                _lstphone.remove(i);
            }
        }
    }
    void getDeletePerson() {
        for (PhoneBook y : _lstphone) {
            y.inraManhinhPhone();
        }
    }
    // Tìm kiếm theo tên
    void SearchName() {
        String namePer;
        int i;
        do {
        System.out.println("Nhập tên người cần tìm : ");
        namePer = _sc.nextLine();
        for ( i = 0; i < _lstphone.size(); i++) {
        if(namePer.equals(_lstphone.get(i).getTen())){
        System.out.println("Họ : "+_lstphone.get(i).getHo()+", tên đệm : "+
        _lstphone.get(i).getTenDem()+", tên : "+_lstphone.get(i).getTen()+""
        + ", năm sinh : "+_lstphone.get(i).getNamSinh()+", giới tính : "+_lstphone.get(i).getGioiTinh()+
        " Số điện thoại : "+_lstphone.get(i).numberPhone+ " ,Email : "+_lstphone.get(i).email+" ,Ghi chú : "+_lstphone.get(i).note);
        }
        }
        } while(true);
    }
    //Tìm kiếm theo số điện thoại
    void SearchNumber() {
        do {            
            System.out.println("Nhập số điện thoại người cần tìm :");
            String phoneNumber = _sc.nextLine();
            for (int i = 0; i < _lstphone.size(); i++) {
                if (phoneNumber.equals(_lstphone.get(i).getNumberPhone())) {
                    System.out.println("Họ : " + _lstphone.get(i).getHo() + ", tên đệm : "
                            + _lstphone.get(i).getTenDem() + ", tên : " + _lstphone.get(i).getTen() + ""
                            + ", năm sinh : " + _lstphone.get(i).getNamSinh() + ", giới tính : " + _lstphone.get(i).getGioiTinh()
                            + " Số điện thoại : " + _lstphone.get(i).numberPhone + " ,Email : " + _lstphone.get(i).email + " ,Ghi chú : " + _lstphone.get(i).note);                    
                }
            }
        } while (true);
    }
    // Tìm kiếm
    void SearchArr(){
        _sc = new Scanner(System.in);
        int choice;
        System.out.println("------------------------------");
        System.out.println("1. Tìm kiếm theo tên  ");
        System.out.println("2. Tìm kiếm theo số điện thoại");
        System.out.println("Bạn chọn ? ");
        choice = Integer.parseInt(_sc.nextLine());
        switch(choice) {
            
            case 1 : {
                SearchName(); 
                break;
            }
            case 2 : {
                SearchNumber();
                break;
            }
            default:System.out.println("Nhập sai vui lòng nhập lại !"); break;
        }
    }
        void SearchAppName() {
        String namePer;
        int i;
        do {
        System.out.println("Nhập tên người cần tìm : ");
        namePer = _sc.nextLine();
        for ( i = 0; i < _lstphone.size(); i++) {
        if(_lstphone.get(i).getTen().startsWith(namePer)){
        System.out.println("Họ : "+_lstphone.get(i).getHo()+", tên đệm : "+
        _lstphone.get(i).getTenDem()+", tên : "+_lstphone.get(i).getTen()+""
        + ", năm sinh : "+_lstphone.get(i).getNamSinh()+", giới tính : "+_lstphone.get(i).getGioiTinh()+
        " Số điện thoại : "+_lstphone.get(i).numberPhone+ " ,Email : "+_lstphone.get(i).email+" ,Ghi chú : "+_lstphone.get(i).note);
        }
        }
        } while(true);
    }
        void SearchAppNum() {
        do {            
        System.out.println("Nhập số điện thoại người cần tìm :");
        String phoneNumber = _sc.nextLine();
        for (int i = 0; i < _lstphone.size(); i++) {
        if (_lstphone.get(i).getNumberPhone().startsWith(phoneNumber)) {
        System.out.println("Họ : " + _lstphone.get(i).getHo() + ", tên đệm : "
        + _lstphone.get(i).getTenDem() + ", tên : " + _lstphone.get(i).getTen() + ""
        + ", năm sinh : " + _lstphone.get(i).getNamSinh() + ", giới tính : " + _lstphone.get(i).getGioiTinh()
        + " Số điện thoại : " + _lstphone.get(i).numberPhone + " ,Email : " + _lstphone.get(i).email + " ,Ghi chú : " + _lstphone.get(i).note);                    
        }
        }
        } while (true);    
        }
        // Sắp xếp
        void Sortreverse() {
            do {                
                
            } while (true);
        }
        void SortDown() {
            
        }
        void SortArr() {
            _sc = new Scanner(System.in);
            int choice;
            System.out.println("---------------------");
            System.out.println("1. Sắp xếp ngược");
            System.out.println("2. Sắp xếp xuôi");
            System.out.println("Bạn chọn ?");
            choice = Integer.parseInt(_sc.nextLine());
            switch(choice) {
                case 1: {
                    Sortreverse();
                    break;
                }
                case 2 : {
                    SortDown();
                    break;
                }
                default:System.out.println("Nhập sai vui lòng nhập lại !"); break;
            }
        }
    
}
