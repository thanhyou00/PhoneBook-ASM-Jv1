
package AsmFinal;
import java.util.Scanner;
/**
 *
 * @author Nguyen Truc
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ServicePhoneBook book = new ServicePhoneBook();
        String choice;
        do {
        System.out.println("+------------------MENU------------------+");
        System.out.println("+1. Thêm người vào danh bạ               +");
        System.out.println("+2. Sửa người trong danh bạ              +");
        System.out.println("+3. Xóa người trong danh bạ              +");
        System.out.println("+4. Tìm kiếm theo tên hoặc số điện thoại +");
        System.out.println("+5. Tải thông tin danh bạ                +");
        System.out.println("+6. Tìm kiếm theo tên gần đúng           +");
        System.out.println("+7. Tìm kiếm theo số điện thoại gần đúng +");
        System.out.println("+8. Sắp xếp danh bạ ngược, xuôi          +");
        System.out.println("+9. Thoát                                +");
        System.out.println("+----------------------------------------+");
        System.out.println("Mời bạn chọn chức năng : ");
        choice = scanner.nextLine();          
            switch (choice) {
                case "1": {
                    book.AddPerson();
                    book.getAddPerson();
                    book.MadeAvailable();
                    break;
                }
                case "2": {
                    book.MadeAvailable();
                    book.EditPerson();
                    //book.getEditPerson();
                    break;
                }
                case "3": {
                    book.MadeAvailable();
                    book.DeletePerson();
                    book.getDeletePerson();
                    break;
                }
                case "4": {
                    book.MadeAvailable();
                    book.SearchArr();
                    break;
                }
                case "5": {
                    book.LoaddingBook();
                    break;
                }
                case "6": {
                    book.MadeAvailable();
                    book.SearchAppName();
                    break;
                }
                case "7": {
                    book.MadeAvailable();
                    book.SearchAppNum();
                    break;
                }
                case "8": {
                    book.MadeAvailable();
                    book.SortArr();
                    break;
                }
                case "9": {
                    System.out.println("Bạn đã thoát thành công !");
                    System.exit(0);
                    break;
                }
                default:
                    System.out.println("Nhập sai vui lòng nhập lại ! ");
            }
        } while (!(choice.equals("9")));
} 
}
