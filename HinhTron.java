import java.util.Scanner;

public class HinhTron extends HinhHoc {

	// 1.Thuộc tính
	private float banKinh;

	// 2.Get Set
	public float getBanKinh() {
		return banKinh;
	}

	public void setBanKinh(float banKinh) {
		this.banKinh = banKinh;
	}

	// 3.PTKT
	public HinhTron() {
		// TODO Auto-generated constructor stub
	}

	public HinhTron(float chuVi, float dienTich) {
		super(chuVi, dienTich);
		// TODO Auto-generated constructor stub
	}

	public HinhTron(float banKinh) {
		super();
		this.banKinh = banKinh;
	}

	// 4.Nhập Xuất
	public void nhap() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Nhập vào bán kính hình tròn: ");
		this.banKinh = Float.parseFloat(scan.nextLine());
	}

	@Override
	public void xuat() {
		tinhChuVi();
		tinhDienTich();
		super.xuat();
	}

	// 5.PT tính toán
	public void tinhChuVi() {
		this.chuVi = 2f * this.banKinh * this.PI;
	}

	public void tinhDienTich() {
		this.dienTich = this.PI * this.banKinh * this.banKinh;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
