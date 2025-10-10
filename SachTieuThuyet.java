package Tuan5;

public class SachTieuThuyet extends Sach {
    private String theLoai;
    private boolean laSachSeries;

    public SachTieuThuyet(){
        super();
    } 

    public SachTieuThuyet(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong){
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong);
    }

    public SachTieuThuyet(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, String theLoai, boolean laSachSeries){
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong);
        this.theLoai=theLoai;
        this.laSachSeries=laSachSeries;
    }

    public void hienThiThongTin(){
        super.hienThiThongTin();
        System.out.println("The loai: "+theLoai);
        System.out.println("Nha xuat ban: "+(laSachSeries ? "Co" : "Khong"));
        System.out.println("---------------------");
    }

    public String getMaSach() {
        return super.getMaSach();
    }

    public int getNamXuatBan() {
        return super.getNamXuatBan();
    }

    public int getSoLuong() {
        return super.getSoLuong();
    }

    public String getTacGia() {
        return super.getTacGia();
    }

    public String getTieuDe() {
        return super.getTieuDe();
    }

    public boolean isLaSachSeries() {
        return laSachSeries;
    }

    public String getTheLoai() {
        return theLoai;
    }
    
    public void setMaSach(String maSach) {
        super.setMaSach(maSach);
    }

    public void setNamXuatBan(int namXuatBan) {
        super.setNamXuatBan(namXuatBan);
    }
    
    public void setSoLuong(int soLuong) {
        super.setSoLuong(soLuong);
    }

    public void setTacGia(String tacGia) {
        super.setTacGia(tacGia);
    }

    public void setTieuDe(String tieuDe) {
        super.setTieuDe(tieuDe);
    }

    public void setLaSachSeries(boolean laSachSeries) {
        this.laSachSeries = laSachSeries;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    @Override
    public String toString() {
        return super.toString()
        + "\nThe loai: "+theLoai
        + "\nLa sach series: "+(laSachSeries ? "Co" : "Khong")
        +"\n-----------------------";
    }
}
