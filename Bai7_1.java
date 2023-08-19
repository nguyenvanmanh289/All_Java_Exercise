import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

class NhanVien {
    private String ID;
    private String hoTen;
    private String soDienThoai;
    private String email;
    private String gioiTinh;
    private int namSinh;
    private String queQuan;

    public NhanVien(String ID, String hoTen, String soDienThoai, String email, String gioiTinh, int namSinh, String queQuan) {
        this.ID = ID;
        this.hoTen = hoTen;
        this.soDienThoai = soDienThoai;
        this.email = email;
        this.gioiTinh = gioiTinh;
        this.namSinh = namSinh;
        this.queQuan = queQuan;
    }

    public String getID() {
        return ID;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String toString() {
        return ID + "-" + hoTen + "-" + namSinh;
    }

    public String getEmail() {
        return null;
    }

    public String getSoDienThoai() {
        return null;
    }
}

public class Bai7_1 {
    private static ArrayList<NhanVien> danhSachNhanVien = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("----------------------QL Nhân Viên--------------------------------");
            System.out.println("1- Xem danh sách nhân viên");
            System.out.println("2- Thêm mới 1 nhân viên");
            System.out.println("3- Xóa 1 nhân viên truyền vào mã nhân viên");
            System.out.println("4- Chỉnh sửa 1 nhân viên truyền vào mã nhân viên");
            System.out.println("5- Tìm kiếm nhân viên dựa vào mã nhân viên/email/sdt");
            System.out.println("6- Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    xemDanhSachNhanVien();
                    break;
                case 2:
                    themMoiNhanVien();
                    break;
                case 3:
                    xoaNhanVien();
                    break;
                case 4:
                    chinhSuaNhanVien();
                    break;
                case 5:
                    timKiemNhanVien();
                    break;
                case 6:
                    System.out.println("Đã thoát khỏi chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        } while (choice != 6);
    }

    private static void xemDanhSachNhanVien() {
        System.out.println("Danh sách nhân viên:");
        for (NhanVien nv : danhSachNhanVien) {
            System.out.println(nv);
        }
    }

    private static void themMoiNhanVien() {
        System.out.print("Nhập ID: ");
        String ID = scanner.nextLine();
        System.out.print("Nhập Họ và Tên: ");
        String hoTen = scanner.nextLine();
        System.out.print("Nhập Số điện thoại: ");
        String soDienThoai = scanner.nextLine();
        System.out.print("Nhập Email: ");
        String email = scanner.nextLine();
        System.out.print("Nhập Giới tính: ");
        String gioiTinh = scanner.nextLine();
        System.out.print("Nhập Năm sinh: ");
        int namSinh = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhập Quê quán: ");
        String queQuan = scanner.nextLine();

        NhanVien nv = new NhanVien(ID, hoTen, soDienThoai, email, gioiTinh, namSinh, queQuan);
        danhSachNhanVien.add(nv);
        System.out.println("Thêm nhân viên thành công.");
    }

    private static void xoaNhanVien() {
        System.out.print("Nhập mã nhân viên cần xóa: ");
        String maNV = scanner.nextLine();
        NhanVien nvToRemove = null;

        for (NhanVien nv : danhSachNhanVien) {
            if (nv.getID().equals(maNV)) {
                nvToRemove = nv;
                break;
            }
        }

        if (nvToRemove != null) {
            danhSachNhanVien.remove(nvToRemove);
            System.out.println("Xóa nhân viên thành công.");
        } else {
            System.out.println("Không tìm thấy nhân viên có mã " + maNV);
        }
    }

    private static void chinhSuaNhanVien() {
        System.out.print("Nhập mã nhân viên cần chỉnh sửa: ");
        String maNV = scanner.nextLine();
        NhanVien nvToEdit = null;

        for (NhanVien nv : danhSachNhanVien) {
            if (nv.getID().equals(maNV)) {
                nvToEdit = nv;
                break;
            }
        }

        if (nvToEdit != null) {
            System.out.print("Nhập Họ và Tên mới: ");
            String hoTenMoi = scanner.nextLine();
            System.out.print("Nhập Số điện thoại mới: ");
            String soDienThoaiMoi = scanner.nextLine();
            System.out.print("Nhập Email mới: ");
            String emailMoi = scanner.nextLine();
            System.out.print("Nhập Giới tính mới: ");
            String gioiTinhMoi = scanner.nextLine();
            System.out.print("Nhập Năm sinh mới: ");
            int namSinhMoi = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Nhập Quê quán mới: ");
            String queQuanMoi = scanner.nextLine();

            nvToEdit = new NhanVien(nvToEdit.getID(), hoTenMoi, soDienThoaiMoi, emailMoi, gioiTinhMoi, namSinhMoi, queQuanMoi);
            danhSachNhanVien.remove(nvToEdit);
            danhSachNhanVien.add(nvToEdit);
            System.out.println("Chỉnh sửa nhân viên thành công.");
        } else {
            System.out.println("Không tìm thấy nhân viên có mã " + maNV);
        }
    }

    private static void timKiemNhanVien() {
        System.out.print("Nhập mã nhân viên, email hoặc số điện thoại cần tìm: ");
        String keyword = scanner.nextLine();

        System.out.println("Kết quả tìm kiếm:");
        for (NhanVien nv : danhSachNhanVien) {
            if (nv.getID().equalsIgnoreCase(keyword) || nv.getEmail().equalsIgnoreCase(keyword) || nv.getSoDienThoai().equalsIgnoreCase(keyword)) {
                System.out.println(nv);
            }
        }
    }
}
