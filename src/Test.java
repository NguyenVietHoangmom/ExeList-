
import java.util.*;

public class Test {

    //Viết chương trình Java để tìm min, max trong một danh sách số nguyên,trong mảng gồm mảng tĩnh , arraylist/linkedlist
    public static int minmaxarr() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử của danh sách: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("nhap cac ptu");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                arr[i] = max;
            }
            if (arr[i] < min) {
                arr[i] = min;
            }
        }
        return min;
//        return max;
    }

    public static List<Integer> minmaxList() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử của danh sách: ");
        int n = scanner.nextInt();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        System.out.println("nhap cac ptu");
        for (int i = 0; i < n; i++) {
            arrayList.add(scanner.nextInt());
        }
        int min = Collections.min(arrayList);
        int max = Collections.max(arrayList);

        return Collections.singletonList(min);
    }

    //Viết chương trình Java để tính trung bình cộng của các phần tử trong một danh sách số nguyên,trong mảng gồm mảng tĩnh , arraylist/linkedlist
    public static double arrTBC() {
        int[] arr = {4, 2, 8, 6};
        int sum = 0;
        float tbc = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        tbc = sum / arr.length;
        return tbc;
    }

    public static List arrTBCList() {
        int sum = 0;
        double tbc = 0;
        List<Integer> tbcList = new ArrayList<>();
        tbcList.add(5);
        tbcList.add(4);
        tbcList.add(8);
        tbcList.add(7);
        for (int i = 0; i < tbcList.size(); i++) {
            sum += tbcList.get(i);
        }
        tbc = sum / tbcList.size();
        return Collections.singletonList(tbc);
    }

    //Viết chương trình Java để sắp xếp một mảng theo thứ tự tăng dần bằng thuật toán chèn , sắp xếp nổi bọt, sắp xếp lựa chọn,trong mảng gồm mảng tĩnh , arraylist/linkedlist
    public static List arrListChen() {
        List<Integer> arrChen = new ArrayList<>();
        arrChen.add(8);
        arrChen.add(2);
        arrChen.add(5);
        arrChen.add(9);
        Collections.sort(arrChen);
        return arrChen;
    }

    public static int arrChenNoiBot(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arrChenNoiBot(arr);
    }

    //Viết chương trình Java để đảo ngược các phần tử trong một danh sách số nguyên,trong mảng gồm mảng tĩnh , arraylist/linkedlist
    public static List arrListDaoNguoc() {
        List<Integer> arrDaoNguoc = new ArrayList<>();
        arrDaoNguoc.add(5);
        arrDaoNguoc.add(2);
        arrDaoNguoc.add(6);
        arrDaoNguoc.add(8);
        Collections.reverse(arrDaoNguoc);
        return arrDaoNguoc;
    }


    //Viết chương trình Java để xóa một phần tử khỏi một danh sách số nguyên,trong mảng gồm mảng tĩnh , arraylist/linkedlist
    public static List arrListXoa() {

        List<Integer> arrXoa = new ArrayList<>();
        arrXoa.add(5);
        arrXoa.add(2);
        arrXoa.add(7);
        arrXoa.add(3);
        arrXoa.remove(1);
        return arrXoa;
    }

    public static int[] arrMangTinhXoa() {
        int[] arr = {1, 4, 2, 8};
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == index) {
                index = i;
            }
        }
        for (int i = index; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];//di chuyen sang trai 1 vtri
        }
        int[] arrNew = new int[arr.length - 1];//
        return arrNew;
    }

    //Viết chương trình Java để chenf một phần tử trong một danh sách số nguyên,trong mảng gồm mảng tĩnh , arraylist/linkedlist
    public static List arrrChen() {

        List<Integer> arrChen = new ArrayList<>();
        arrChen.add(5);
        arrChen.add(1);
        arrChen.add(6);
        arrChen.add(9);
        arrChen.add(1, 2);
        return arrChen;
    }

    //Viết chương trình Java để sao chép một danh sách số nguyên sang một danh sách số nguyên khác,trong mảng gồm mảng tĩnh , arraylist/linkedlist
    public static int[] saoChepMang(int[] arr) {
        int[] arrNew = new int[arr.length];
        System.arraycopy(arr, 0, arrNew, 0, arr.length);
        return arrNew;
    }

    public static ArrayList<Integer> saoChepMangList(ArrayList<Integer> arrayList) {
        ArrayList<Integer> listNew = new ArrayList<>(arrayList.size());
        for (int i = 0; i < listNew.size(); i++) {
            listNew.add(arrayList.get(1));
        }
        return ((listNew));
    }


    //Viết chương trình Java để đếm số lượng ký tự trong một chuỗi.
    public static int demKiTu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("moi ban nhap chuoi");
        String kiTu = scanner.nextLine();
        int dem = kiTu.length();
        return dem;
    }

    public static int demKiTuBuffer() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("moi ban nhap chuoi");
        String input = scanner.nextLine();
        StringBuffer sb = new StringBuffer(input);
        int dem = sb.length();
        return dem;
    }

    public static int demKiTuBuilder() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("moi ban nhap chuoi");
        String kiTu = scanner.nextLine();
        StringBuilder sbd = new StringBuilder(kiTu);
        int dem = sbd.length();
        return dem;
    }

    //Viết chương trình Java để chuyển đổi một chuỗi thành chữ hoa.
    public static String chuyenChuHoa() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("moi ban nhap chuoi");
        String kiTu = scanner.nextLine();
        String chu = kiTu.toUpperCase(Locale.forLanguageTag(kiTu));
        return chu;
    }

    //Viết chương trình Java để chuyển đổi một chuỗi thành chữ thường.
    public static String chuyenChuThuong() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("moi ban nhap chuoi");
        String kiTu = scanner.nextLine();
        String chu = kiTu.toLowerCase(Locale.forLanguageTag(kiTu));
        return chu;
    }

    //Viết chương trình Java để xóa khoảng trắng đầu và cuối chuỗi.
    public static String loaiKhoangTrang() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("moi ban nhap chuoi");
        String kiTu = scanner.nextLine();
        String chu = kiTu.trim();
        return chu;
    }

    //Viết chương trình Java để thay thế tất cả các ký tự trong chuỗi bằng một ký tự khác.
//    public static String thayTheKiTu() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("moi ban nhap chuoi cu");
//        String chuoiCu = scanner.nextLine();
//        Scanner sc = new Scanner(System.in);
//        System.out.println("moi ban nhap chuoi");
//        char thayDoi = sc.next().charAt(0);
////        String chuoiMoi=chuoiCu.replaceAll("",String.valueOf());
//    return thayDoi;
//    }
}