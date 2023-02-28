import java.util.Scanner;

public class XuLy {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DanhSachChuyenXe  dsChuyenXeObj= new DanhSachChuyenXe();
//		dsChuyenXeObj.nhap(scan);
		dsChuyenXeObj.dummyData();
		dsChuyenXeObj.xuat();
//		dsChuyenXeObj.tinhTongDoanhThu();
//		System.out.println("Tổng doanh thu: " + dsChuyenXeObj.getTongDoanhThu());
//		dsChuyenXeObj.tinhDoanhThuNoi();
//		System.out.println("Tổng doanh thu nội: " + dsChuyenXeObj.getDoanhThuNoi());
		dsChuyenXeObj.tinhDoanhThuNgoai();
		System.out.println("Tổng doanh thu ngoại: " + dsChuyenXeObj.getDoanhThuNgoai());
		float doanhThu = dsChuyenXeObj.tinhDTCXBinhThuan();
		System.out.println("Tổng doanh thu đến Bình Thuận: " + doanhThu);
	}

}
