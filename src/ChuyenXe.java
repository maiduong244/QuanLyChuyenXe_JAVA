import java.util.Scanner;

/*
 * Múc dich: lớp cha quản lý các chuyến xe
 * người tạo 
 * ngày tạo
 * version: 1.0
 * */
public class ChuyenXe {
	// attributes
	protected String maSoChuyen;
	protected String hoTenTaiXe;
	protected String soXe;
	protected float doanhThu;
	
	//get & set
	public String getMaSoChuyen() {
		return maSoChuyen;
	}
	public void setMaSoChuyen(String maSoChuyen) {
		this.maSoChuyen = maSoChuyen;
	}
	public String getHoTenTaiXe() {
		return hoTenTaiXe;
	}
	public void setHoTenTaiXe(String hoTenTaiXe) {
		this.hoTenTaiXe = hoTenTaiXe;
	}
	public String getSoXe() {
		return soXe;
	}
	public void setSoXe(String soXe) {
		this.soXe = soXe;
	}
	public float getDoanhThu() {
		return doanhThu;
	}
	public void setDoanhThu(float doanhThu) {
		this.doanhThu = doanhThu;
	}
	
	//constructors
	public ChuyenXe() {
		
	}
	
	public ChuyenXe(String maSoChuyen, String hoTenTaiXe, String soXe, float doanhThu) {
		super();
		this.maSoChuyen = maSoChuyen;
		this.hoTenTaiXe = hoTenTaiXe;
		this.soXe = soXe;
		this.doanhThu = doanhThu;
	}
	
	//input output
	
	public void nhap(Scanner scan) {
		System.out.print("Nhập mã số chuyến: ");
		this.maSoChuyen = scan.nextLine();
		System.out.print("Nhập mã họ tên tài xế: ");
		this.hoTenTaiXe = scan.nextLine();
		System.out.print("Nhập mã số xe: ");
		this.soXe = scan.nextLine();
		System.out.print("Nhập doanh thu: ");
		this.doanhThu = Float.parseFloat(scan.nextLine());
	}
	
	public void xuat() {
		System.out.println("Mã số chuyến: " + this.maSoChuyen + " - Họ tên tài xế: " + this.hoTenTaiXe + " - Mã số xe: " + this.soXe + " - doanh thu: " + this.doanhThu);
	}
}
