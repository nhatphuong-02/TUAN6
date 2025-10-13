public class Test {
    public static void main(String[] args) {
        QuanLySach quanLy = new QuanLySach();
        Sach sach1 = new Sach("S001", "Lập trình Java cơ bản", "Nguyễn Văn A", 2023, 10);
        Sach sach2 = new Sach("S002", "Cấu trúc dữ liệu và giải thuật", "Trần Thị B", 2022, 5);
        SachGiaoTrinh sach3 = new SachGiaoTrinh();
        sach3.setMaSach("001");
        sach3.setTieuDe("Cô nan");
        sach3.setTacGia("Phạm Thanh Tiến");
        sach3.setNamXuatBan(2006);
        sach3.setSoLuong(1);
        sach3.setmonHoc("toan");
        sach3.setcapDo("3");
        System.out.println(sach3.toString());
        SachTieuThuyet sach4=new SachTieuThuyet("001", "Sách giáo khoa", "Tien bịp",2006,2,"sgv",true);
        quanLy.themSach(sach1);
        quanLy.themSach(sach2);
        quanLy.themSach(sach3);
        quanLy.themSach(sach4);
        quanLy.hienThiDanhSachSach();
         String maCanTim = "TT01";
        Sach timThay = quanLy.timKiemTheoMa(maCanTim);
        if (timThay != null) {
            System.out.println("✅ Đã tìm thấy: " + timThay.getTieuDe());
            System.out.println(timThay.toString());
        } else {
            System.out.println("❌ Không tìm thấy sách với mã: " + maCanTim);
        }
         System.out.println("\n--- 4. CẬP NHẬT SÁCH (Mã GT01) ---");
        String maCanCapNhat = "001";
        quanLy.capNhatSach(maCanCapNhat);
        System.out.println("\n--- 5. DANH SÁCH SAU KHI CẬP NHẬT ---");
        quanLy.hienThiDanhSachSach();
        System.out.println("\n--- 6. XOÁ SÁCH (Mã S001) ---");
        String maCanXoa = "S001";
        quanLy.xoaSach(maCanXoa);
        quanLy.xoaSach("MAKHONGTONTAI"); 
        System.out.println("\n--- 7. DANH SÁCH CUỐI CÙNG ---");
        quanLy.hienThiDanhSachSach();
    }   
}
