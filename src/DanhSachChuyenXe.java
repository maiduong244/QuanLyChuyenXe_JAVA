import java.util.ArrayList;
import java.util.Scanner;

/*
 * Múc dich: quản ly danh sách chuyến xe
 * người tạo 
 * ngày tạo
 * version: 1.0
 * */
public class DanhSachChuyenXe {

	private ArrayList<ChuyenXe> dsChuyenXe;
	private float tongDoanhThu;
	private float doanhThuNoi;
	private float doanhThuNgoai;

	public ArrayList<ChuyenXe> getDsChuyenXe() {
		return dsChuyenXe;
	}

	public void setDsChuyenXe(ArrayList<ChuyenXe> dsChuyenXe) {
		this.dsChuyenXe = dsChuyenXe;
	}

	public float getTongDoanhThu() {
		return this.tongDoanhThu;
	}

	public float getDoanhThuNoi() {
		return this.doanhThuNoi;
	}

	public float getDoanhThuNgoai() {
		return this.doanhThuNgoai;
	}

	public DanhSachChuyenXe() {
		dsChuyenXe = new ArrayList<ChuyenXe>();
	}

	public void nhap(Scanner scan) {
		boolean flag = true;
		ChuyenXe chuyenXe;
		do {
			System.out.println("Vui lòng chọn thực hiện");
			System.out.println("1. Chuyến xe nội thành");
			System.out.println("2. Chuyến xe ngoại thành");

			System.out.println("0. Thoát");
			int chon = Integer.parseInt(scan.nextLine());
			switch (chon) {
			case 1:
				chuyenXe = new ChuyenXeNoiThanh();
				chuyenXe.nhap(scan);
				this.dsChuyenXe.add(chuyenXe);
				break;
			case 2:
				chuyenXe = new ChuyenXeNgoaiThanh();
				chuyenXe.nhap(scan);
				this.dsChuyenXe.add(chuyenXe);
				break;

			case 0:
				flag = false;
				break;
			}
		} while (flag);
	}

	public void xuat() {
		for (ChuyenXe cx : this.dsChuyenXe) {
			cx.xuat();
		}
	}

	public void tinhSoLuongGiaoDichNha() {
		this.tongDoanhThu = 0;
		for (ChuyenXe cx : this.dsChuyenXe) {
			this.tongDoanhThu += cx.getDoanhThu();
		}
	}

	public void tinhSoLuongGiaoDichDat() {
		this.doanhThuNoi = 0;
		for (ChuyenXe cx : this.dsChuyenXe) {
			if (cx instanceof ChuyenXeNoiThanh) {
				this.doanhThuNoi += cx.getDoanhThu();
			}
		}
	}

	public void tinhDoanhThuNgoai() {
		this.doanhThuNgoai = 0;
		for (ChuyenXe cx : this.dsChuyenXe) {
			if (cx instanceof ChuyenXeNgoaiThanh) {
				this.doanhThuNgoai += cx.getDoanhThu();
			}
		}
	}

	public void dummyData() {
		ChuyenXe chuyenXe;
		chuyenXe = new ChuyenXeNoiThanh("1", "nội 1", "02", 1200, "số 12", 35);
		this.dsChuyenXe.add(chuyenXe);
		chuyenXe = new ChuyenXeNoiThanh("2", "nội 2", "12", 1200, "số 22", 45);
		this.dsChuyenXe.add(chuyenXe);
		chuyenXe = new ChuyenXeNgoaiThanh("3", "ngoại 1", "03", 1200, "Bình Dương", 2);
		this.dsChuyenXe.add(chuyenXe);
		chuyenXe = new ChuyenXeNgoaiThanh("4", "ngoại 2", "07", 1200, "Bình Thuận", 3);
		this.dsChuyenXe.add(chuyenXe);
		chuyenXe = new ChuyenXeNoiThanh("5", "nội 3", "17", 1200, "số 24", 8);
		this.dsChuyenXe.add(chuyenXe);
		chuyenXe = new ChuyenXeNgoaiThanh("7", "ngoại 3", "07", 1500, "Bình Thuận", 1.5f);
		this.dsChuyenXe.add(chuyenXe);
	}

	public float tinhDTCXBinhThuan() {
		float doanhThu = 0;
		for (ChuyenXe cx : this.dsChuyenXe) {
			if (cx instanceof ChuyenXeNgoaiThanh) {
				
//				ép kiểu đối tượng casting
				ChuyenXeNgoaiThanh cxnt = ((ChuyenXeNgoaiThanh) cx);
				if (cxnt.getNoiDen().equalsIgnoreCase("Bình Thuận")) {
					doanhThu += cx.getDoanhThu();
				}
			}
		}
		return doanhThu;
	}
}
