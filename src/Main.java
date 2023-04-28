import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 1, 2, 4};
        List<Integer> listArray = new ArrayList<>();
        List<Integer> listLinked = new LinkedList<>();
        listArray.add(2);
        listArray.add(3);
        listArray.add(78);
        listArray.add(8);
        listLinked.addAll(listArray);

        Scanner scanner = new Scanner(System.in);
        System.out.println("moi ban nhap bai");
        int number = scanner.nextInt();
        switch (number) {
            case 1 -> System.out.println(Test.minmaxarr());
            case 2-> System.out.println(Test.minmaxList());

            case 3 -> System.out.println(Test.arrTBCList());
            case 4 -> System.out.println(Test.arrListDaoNguoc());


//            case 4 -> System.out.println(Arrays.toString(Test.arrDaoNguoc(arr)));


            case 5 -> System.out.println(Test.arrMangTinhXoa());
            case 6 -> System.out.println(Test.arrrChen());
            case 7 -> System.out.println(Arrays.toString(Test.saoChepMang(arr)));
//            case 10-> System.out.println(Test.copyList());
//            case 11-> System.out.println(Test.ts());
//            case 12-> System.out.println(Test.SearchNumber());
//            case 13-> System.out.println(Test.RemoveArr());
//            case 14-> System.out.println(Test.Update());
//            case 15-> System.out.println(Test.Arr());

            case 20-> System.out.println(Test.demKiTu());
            case 21-> System.out.println(Test.demKiTuBuffer());
            case 22-> System.out.println(Test.demKiTuBuilder());
            case 23-> System.out.println(Test.chuyenChuHoa());
            case 24-> System.out.println(Test.chuyenChuThuong());
            case 25-> System.out.println(Test.loaiKhoangTrang());


        }
    }
}
