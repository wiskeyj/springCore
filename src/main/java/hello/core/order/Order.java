package hello.core.order;

public class Order {

    private Long memberId;
    private String imenName;
    private int itemPrice;
    private int discountPrice;

    public Order(Long memberId, String imenName, int itemPrice, int discountPrice) {
        this.memberId = memberId;
        this.imenName = imenName;
        this.itemPrice = itemPrice;
        this.discountPrice = discountPrice;
    }

    public int calculaterPrice(){
        return itemPrice - discountPrice;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public String getImenName() {
        return imenName;
    }

    public void setImenName(String imenName) {
        this.imenName = imenName;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(int discountPrice) {
        this.discountPrice = discountPrice;
    }

    @Override
    public String toString() {
        return "Order{" +
                "memberId=" + memberId +
                ", imenName='" + imenName + '\'' +
                ", itemPrice=" + itemPrice +
                ", discountPrice=" + discountPrice +
                '}';
    }

}
