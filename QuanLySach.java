import java.util.ArrayList;
import java.util.Scanner;

public class QuanLySach {
    private ArrayList<Sach> danhSachSach;
    private Scanner scanner;

    public QuanLySach() {
        this.danhSachSach = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }
    public void themSach(Sach sach) {
        danhSachSach.add(sach);
        System.out.println("Thêm sách thành công: " + sach.getTieuDe());
    }
    public void hienThiDanhSachSach() {
        System.out.println("\n===== DANH SÁCH TẤT CẢ SÁCH (" + danhSachSach.size() + " cuốn) =====");
        for (Sach sach : danhSachSach) {
            System.out.println(sach.toString());
            System.out.println("---------------------------------");
        }
    }
    public Sach timKiemTheoMa(String maSach) {
        for (Sach sach : danhSachSach) {
            if (sach.getMaSach().equalsIgnoreCase(maSach)) {
                return sach; 
            }
        }
        return null;
    }
    public void capNhatSach(String maSach) {
        Sach sachCanCapNhat = timKiemTheoMa(maSach);
        if (sachCanCapNhat == null) {
            System.out.println("❌ Không tìm thấy sách với mã: " + maSach);
            return;
        }
        System.out.println("\n--- Cập nhật sách có mã: " + maSach + " ---");
        System.out.print("Nhập Tiêu đề mới (Hiện tại: " + sachCanCapNhat.getTieuDe() + ", để trống để bỏ qua): ");
        String tieuDeMoi = scanner.nextLine();
        sachCanCapNhat.setTieuDe(tieuDeMoi.isEmpty() ? sachCanCapNhat.getTieuDe() : tieuDeMoi);
        System.out.print("Nhập Tác giả mới (Hiện tại: " + sachCanCapNhat.getTacGia() + ", để trống để bỏ qua): ");
        String tacGiaMoi = scanner.nextLine();
        sachCanCapNhat.setTacGia(tacGiaMoi.isEmpty() ? sachCanCapNhat.getTacGia() : tacGiaMoi);
        try {
            System.out.print("Nhập Năm XB mới (Hiện tại: " + sachCanCapNhat.getNamXuatBan() + ", nhập số, để trống để bỏ qua): ");
            String input = scanner.nextLine();
            if (!input.isEmpty()) {
                int namXBMoi = Integer.parseInt(input);
                sachCanCapNhat.setNamXuatBan(namXBMoi);
            }
        } catch (NumberFormatException e) {
            System.out.println("⚠ Lỗi: Năm xuất bản phải là số nguyên. Bỏ qua cập nhật Năm XB.");
        }
        System.out.println("Cập nhật sách thành công!");
    }
    public void xoaSach(String maSach) {
        boolean removed = danhSachSach.removeIf(sach -> sach.getMaSach().equalsIgnoreCase(maSach));
        if (removed) {
            System.out.println("Đã xoá sách có mã: " + maSach);
        } else {
            System.out.println("Không tìm thấy sách với mã: " + maSach);
        }
    }
}
