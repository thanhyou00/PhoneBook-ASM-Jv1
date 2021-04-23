
package AsmFinal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
/**
 *
 * @author Nguyen Truc
 */
public class ServicePhoneBook {
    ArrayList<PhoneBook> _lstphone = new ArrayList<>();
    PhoneBook _pb ;
    Scanner _sc = new Scanner(System.in);
    void MadeAvailable() {     // Tạo liên hệ có sẵn
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
    void AddPerson() {    // Thêm liên hệ mới
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
        }  }
    void getAddPerson() {
        for (PhoneBook x : _lstphone) {
            x.inraManhinhPhone();
        } }
        public void EditPerson() {   // Sửa liên hệ
        System.out.println("Nhập số điện thoại người liên hệ cần sửa : ");
        String phoneNum = _sc.nextLine();
        for (int i = 0; i < _lstphone.size(); i++) {
        if(phoneNum.equals(_lstphone.get(i).getNumberPhone())){
        int choice;
        do {
            System.out.println("1. Sửa họ");
            System.out.println("2. Sửa tên đệm");
            System.out.println("3. Sửa tên");
            System.out.println("4. Sửa năm sinh");
            System.out.println("5. Sửa giới tính");
            System.out.println("6. Sửa số điện thoại");
            System.out.println("7. Sửa email");
            System.out.println("8. Sửa ghi chú");
            System.out.println("9. Thoát");
            System.out.println("Vui lòng nhập lựa chọn : ");
            choice = _sc.nextInt();
        switch(choice) {
            case 1 : 
        _sc = new Scanner(System.in);        
        System.out.println("Nhập vào họ mới: ");
       String ho = _sc.nextLine();
        _lstphone.get(i).setHo(ho);
        _lstphone.add(_pb);
       // getEditPerson();
        break;
            case 2 :
        _sc = new Scanner(System.in);        
        System.out.println("Nhập vào tên đệm mới: ");
        String tenDem = _sc.nextLine();
        _lstphone.get(i).setTenDem(tenDem);
        //getEditPerson();
        break;
            case 3 :
        _sc = new Scanner(System.in);        
        System.out.println("Nhập vào tên mới: ");
        String name = _sc.nextLine();
        _lstphone.get(i).setTen(name);
       // getEditPerson();
        break;
            case 4 :
        _sc = new Scanner(System.in);        
        System.out.println("Nhập vào năm sinh mới: ");
        int namSinh = Integer.parseInt(_sc.nextLine());
        _lstphone.get(i).setNamSinh(namSinh);
        //getEditPerson();
        break;
            case 5 :
        _sc = new Scanner(System.in);        
        System.out.println("Nhập vào giới tính mới: ");
        String gioiTinh = _sc.nextLine();
        _lstphone.get(i).setGioiTinh(gioiTinh); 
       // getEditPerson();
        break;
            case 6 :
        _sc = new Scanner(System.in);        
        System.out.println("Nhập vào số điện thoại mới: ");
        String numberPhone = _sc.nextLine();
        _lstphone.get(i).setNumberPhone(numberPhone);
        //getEditPerson();
        break;
            case 7 :
        _sc = new Scanner(System.in);        
        System.out.println("Nhập vào email mới: ");
        String email = _sc.nextLine();
        _lstphone.get(i).setEmail(email);
       // getEditPerson();
        break;
            case 8:
        _sc = new Scanner(System.in);        
        System.out.println("Nhập vào ghi chú mới : ");
        String note = _sc.nextLine();
        _lstphone.get(i).setNote(note);
       // getEditPerson();
        break;
            case 9: {
                System.exit(0); break;
            }
        } }  while(!(choice == 9)) ; } } }
    void getEditPerson() {
        for (PhoneBook y : _lstphone) {
            y.inraManhinhPhone();
        } }
    void DeletePerson() {    // Xóa liên hệ
        _sc = new Scanner(System.in);
        System.out.println("Nhập số điện thoại liên hệ người cần xóa : "); 
        String phoneNum = _sc.nextLine();
        for (int i = 0; i <_lstphone.size(); i++) {
            if(phoneNum.equals(_lstphone.get(i).numberPhone)){
                _lstphone.remove(i);
            } } }
    void getDeletePerson() {
        for (PhoneBook y : _lstphone) {
            y.inraManhinhPhone();
        } }
   public  void SearchName() {// Tìm kiếm theo tên
        System.out.println("Nhập tên người cần tìm : ");
        String namePer = _sc.nextLine();
        for (int i = 0; i < _lstphone.size(); i++) {
        if(namePer.equalsIgnoreCase(_lstphone.get(i).getTen())){
        _lstphone.get(i).inraManhinhPhone();
        } } }
   // Load
           void LoaddingBook() {
        int mydate=2000,ns;
        String ten,gioiTinh,ho,tenDem,sodienThoai,email;
        do {
            System.out.println("Mời bạn nhập họ: ");
            ho = _sc.nextLine();
            System.out.println("Mời bạn nhập tên đệm:");
            tenDem = _sc.nextLine();
            System.out.println("Mời bạn nhập tên :");
            ten = _sc.nextLine();
            System.out.println("Mời bạn nhập số điện thoại:");
            sodienThoai = _sc.nextLine();
            System.out.println("Mời bạn nhập email:");
            email = _sc.nextLine();
            System.out.println("Mời bạn nhập giới tính:");
            gioiTinh = _sc.nextLine();
            System.out.println("Mời bạn nhập năm sinh:");
            ns = Integer.parseInt(_sc.nextLine());
            String resultNam = (gioiTinh.equalsIgnoreCase("nam")&&(mydate> ns))?"Anh":null;
            String resultNu = (gioiTinh.equalsIgnoreCase("nữ")&&(mydate> ns))?"Chị":null;
            System.out.printf("Chao %s %s %s %s,số điện thoại:%s , email: %s \n",
                    (resultNam!=null)?resultNam:(resultNu!=null)?resultNu:
                    (resultNam==null&&resultNu==null&&mydate>ns)?"Em":"Bạn",ho,tenDem,ten,sodienThoai,email );
        } while(true);       
        }
   
   //Load
   public void SearchNumber() {      //Tìm kiếm theo số điện thoại        
        System.out.println("Nhập số điện thoại người cần tìm :");
        String phoneNumber = _sc.nextLine();
        for (int i = 0; i < _lstphone.size(); i++) {
        if (phoneNumber.equals(_lstphone.get(i).getNumberPhone())) {
        _lstphone.get(i).inraManhinhPhone();
        }  } }
    void SearchArr(){// Tìm kiếm
        _sc = new Scanner(System.in);
        String choice;
        System.out.println("------------------------------");
        System.out.println("1. Tìm kiếm theo tên  ");
        System.out.println("2. Tìm kiếm theo số điện thoại");
        System.out.println("Bạn chọn ? ");
        choice = _sc.nextLine();
        switch(choice) {
            case "1" : {
                SearchName(); 
                break;
            }
            case "2" : {
                SearchNumber();
                break;
            }
            default:System.out.println("Nhập sai vui lòng nhập lại !"); break;
        } }
        void SearchAppName() {
        System.out.println("Nhập tên người cần tìm : ");
        String namePer = _sc.nextLine();
        for (int i = 0; i < _lstphone.size(); i++) {
        if(_lstphone.get(i).getTen().toLowerCase().startsWith(namePer)){
        _lstphone.get(i).inraManhinhPhone();
        } } }
        void SearchAppNum() {         
        System.out.println("Nhập số điện thoại người cần tìm :");
        String phoneNumber = _sc.nextLine();
        for (int i = 0; i < _lstphone.size(); i++) {
        if (_lstphone.get(i).getNumberPhone().startsWith(phoneNumber)) {  
        _lstphone.get(i).inraManhinhPhone();
        } } }
        // Sắp xếp ngược, xuôi
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
                    Collections.sort(_lstphone, new Comparator<PhoneBook>() {
                    @Override
                    public int compare(PhoneBook o1, PhoneBook o2) {
                    return o1.getNamSinh()-o2.getNamSinh(); 
                    } }) ;
                    for (PhoneBook o : _lstphone) {
                        o.inraManhinhPhone();
                    }
                    break;
                }
                case 2 : {
                    Collections.sort(_lstphone, new Comparator<PhoneBook>() {
                    @Override
                    public int compare(PhoneBook o1, PhoneBook o2) {
                    return o2.getNamSinh()-o1.getNamSinh(); 
                    } }) ; 
                    for (PhoneBook o : _lstphone) {
                        o.inraManhinhPhone();
                    }
                    break;
                }
                default:System.out.println("Nhập sai vui lòng nhập lại !"); break;
            } }
}
