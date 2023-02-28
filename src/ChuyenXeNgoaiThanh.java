import java.util.Scanner;

public class ChuyenXeNgoaiThanh extends ChuyenXe {
	// attributes
		private String noiDen;
		private float soNgayDiDuoc;

		// get & set
		public String getNoiDen() {
			return noiDen;
		}

		public void setNoiDen(String noiDen) {
			this.noiDen = noiDen;
		}

		public float getSoNgayDiDuoc() {
			return soNgayDiDuoc;
		}

		public void setSoNgayDiDuoc(float soNgayDiDuoc) {
			this.soNgayDiDuoc = soNgayDiDuoc;
		}

		// constructors
		public ChuyenXeNgoaiThanh() {
			super();
		}

		public ChuyenXeNgoaiThanh(String maSoChuyen, String hoTenTaiXe, String soXe, float doanhThu, String noiDen,
				float soNgayDiDuoc) {
			super(maSoChuyen, hoTenTaiXe, soXe, doanhThu);
			this.soNgayDiDuoc = soNgayDiDuoc;
			this.noiDen = noiDen;
		}

		// input output
		@Override
		public void nhap(Scanner scan) {
			super.nhap(scan);
			System.out.print("Nhập địa điểm đến: ");
			this.maSoChuyen = scan.nextLine();
			System.out.print("Nhập số ngày đi được: ");
			this.doanhThu = Float.parseFloat(scan.nextLine());
		}
		@Override
		public void xuat() {
			super.xuat();
			System.out.println(" - Nơi đến: " + this.noiDen + " - Số ngày đi được: " + this.soNgayDiDuoc); 
		}
}
