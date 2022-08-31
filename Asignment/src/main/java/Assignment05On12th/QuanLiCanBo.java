package Assignment05On12th;

public class QuanLiCanBo {
    private final int amountMax = 50;
    private int totalEmployee = 0;
    private CanBo[] listEmployee = null;
/*
 Trong lớp quản lí cán bộ thì ta sẽ khởi tạo số lượng phần tử cho mảng có kiểu là kiểu cán bộ mà ta đã khởi tạo
 trước đó. điều này có nghĩa, mỗi lần thao tác với biến kiểu cán bộ thì mảng listEmployee sẽ coi như là
 một bản ghi dữ liệu
 */
    public QuanLiCanBo(){
        listEmployee = new CanBo[amountMax];
    }

    public int getTotalEmployee(String name){
        for(int i=0; i<totalEmployee; i++){
            if(name.equals(listEmployee[i].getName()))
                return i;
        }
        return -1;
    }
    public boolean checkEmpty(){
        if(this.totalEmployee==0)
            return true;
        return false;
    }
    public void add(CanBo canBoObj){

        this.listEmployee[totalEmployee] = canBoObj;
        this.totalEmployee++;
        System.out.println("Add sucessful");
    }

    public void findEmployee(String name){
        int position = this.getTotalEmployee(name) +1;
        System.out.println("Cán bộ có tên cần tìm nằm ở vị trí thứ " +position +" trong danh sách.");
        System.out.println("tuổi: " + this.listEmployee[position-1].getAge());
        System.out.println("Giới tính : " + this.listEmployee[position-1].getGender());
        System.out.println("Địa chỉ : " + this.listEmployee[position-1].getAddress());
    }


    public void infoEmployee(){
       if(!checkEmpty()) {
           for (int i = 0; i <= totalEmployee; i++) {
               System.out.println(this.listEmployee[i].getName());
               System.out.println(this.listEmployee[i].getAge());
               System.out.println(this.listEmployee[i].getGender());
               System.out.println(this.listEmployee[i].getAddress());
               System.out.println("---------------------------------------------------------");
           }
       }
    }
}
