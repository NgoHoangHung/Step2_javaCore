package Assignment06thUnit1;
public class Card {

    private String itemNumberCode;
    private String BorrowedDate ;
    private String deadlineDate;
    private String BookID;

    private StudentManager student;
    public Card(){

    }
    public Card(String itemNumberCode, String borrowedDate, String deadlineDate, String bookID,StudentManager student) {
        this.itemNumberCode = itemNumberCode;
        this.BorrowedDate = borrowedDate;
        this.deadlineDate = deadlineDate;
        this.BookID = bookID;
        this.student=student;
//        studentObj = new StudentManager[amountMax] ;
    }



    public String getItemNumberCode() {
        return itemNumberCode;
    }

    public void setItemNumberCode(String itemNumberCode) {
        this.itemNumberCode = itemNumberCode;
    }

    public String getBorrowedDate() {
        return BorrowedDate;
    }

    public void setBorrowedDate(String borrowedDate) {
        BorrowedDate = borrowedDate;
    }

    public String getDeadlineDate() {
        return deadlineDate;
    }

    public void setDeadlineDate(String deadlineDate) {
        this.deadlineDate = deadlineDate;
    }

    public String getBookID() {
        return BookID;
    }

    public void setBookID(String bookID) {
        BookID = bookID;
    }


    public StudentManager getStudent() {
        return student;
    }

    public void setStudent(StudentManager student) {
        this.student = student;
    }

    public void delete(String cardObj){

    }
}
