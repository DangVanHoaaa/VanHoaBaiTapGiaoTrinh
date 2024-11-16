package baitap.chuong3.bai12;

public class Main {
    public static void main(String[] args) {
        // Tạo đối tượng SVCĐN
        SVCDN svCDN = new SVCDN("van hoa", "19/10/2005", "Hung yen", "SVCĐN");
       
        // Tạo đối tượng SVCĐCQ
        SVCDCQ svCDCQ = new SVCDCQ("van huy", "1/06/2014", "ha noi", "SVCĐCQ");
       
        svCDN.nhapThongTin();
        svCDCQ.nhapThongTin();
        // In thông tin các đối tượng
        System.out.println("\nthong tin sinh vien cao dang nghe:");
        svCDN.inThongTin();

        System.out.println("\nthong tin sinh vien cao dang chinh quy:");
        svCDCQ.inThongTin();
    }
}