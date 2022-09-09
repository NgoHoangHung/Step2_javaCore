package Assignment06thUnit1;

public class CardManager {
    private Card[] listCardObj = null;
    private final int amountMax = 50;
    private static int totalID = 0;

    public int getPosition(String itemNumberCodeInput) {
        for (int i = 0; i < totalID; i++)
            if (itemNumberCodeInput.equalsIgnoreCase(this.listCardObj[i].getItemNumberCode()))
                return i;

        return -1;


    }

    public CardManager() {
        listCardObj = new Card[amountMax];
    }



    public void creat(Card card) {
    this.listCardObj[totalID] = card;
    this.totalID++;
        System.out.println("add success!");
    }

    public void read() {

    }

    public void delete(String itemNumberCode) {

    }

}
