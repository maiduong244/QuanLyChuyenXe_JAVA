import java.util.Scanner;

/*
 * Múc dich: quản lý nghiệp vụ liên quan đến chuyến xe nội thành
 * người tạo 
 * ngày tạo
 * version: 1.0
 * */
public class ChuyenXeNoiThanh extends ChuyenXe {
	// attributes
	private String soTuyen;
	private float soKM;

	// get & set
	public String getSoTuyen() {
		return soTuyen;
	}

	public void setSoTuyen(String soTuyen) {
		this.soTuyen = soTuyen;
	}

	public float getSoKM() {
		return soKM;
	}

	public void setSoKM(float soKM) {
		this.soKM = soKM;
	}

	// constructors
	public ChuyenXeNoiThanh() {
		super();
	}

	public ChuyenXeNoiThanh(String maSoChuyen, String hoTenTaiXe, String soXe, float doanhThu, String soTuyen,
			float soKM) {
		super(maSoChuyen, hoTenTaiXe, soXe, doanhThu);
		this.soKM = soKM;
		this.soTuyen = soTuyen;
	}

	// input output
	@Override
	public void nhap(Scanner scan) {
		super.nhap(scan);
		System.out.print("Nhập mã số tuyến: ");
		this.maSoChuyen = scan.nextLine();
		System.out.print("Nhập số KM: ");
		this.doanhThu = Float.parseFloat(scan.nextLine());
	}
	@Override
	public void xuat() {
		super.xuat();
		System.out.println(" - Số tuyến: " + this.soTuyen + " - Số km đi được: " + this.soKM); 
	}
}
