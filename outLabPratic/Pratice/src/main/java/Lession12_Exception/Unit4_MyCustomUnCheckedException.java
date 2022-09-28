package Lession12_Exception;

public class Unit4_MyCustomUnCheckedException extends RuntimeException {
    /*
    sau khi kế thừa RuntimeException thì ta sẽ tạo tiếp ra một constructor chứa cái  message để khi
ném ra cái ngoại lệ này thì ta sẽ bắn ra cái message. Vậy là ta đã có một Exception do bản thân ta tự định nghĩa (Unit4_MyCustomException)

     */

    public Unit4_MyCustomUnCheckedException(String message) {
        super(message);
    }
}
/*
Được sử dụng để tùy biến theo đúng nhu cầu của người dùng. Để tạo CustomException thì ta sẽ có hai loại.
Vói loại CheckedException thì ta sẽ cho nó kế thừa class Exception
 còn loại unCheckedException thì ta sẽ cho nó kế thừa Runtime Exception
 */