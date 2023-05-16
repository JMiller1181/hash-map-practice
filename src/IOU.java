import java.util.HashMap;
public class IOU {
    HashMap<String, Double> hashMap;
    public IOU(){
        this.hashMap = new HashMap<>();
    }
    public void setSum(String toWhom, double amount){
        hashMap.put(toWhom, amount);
    }
    public double howMuchDoIOweTo(String toWhom){
        if (hashMap.containsKey(toWhom)){
            return hashMap.get(toWhom);
        } else {
            return 0;
        }
    }
    public static void main(String[] args){
        IOU anIou = new IOU();
        anIou.setSum("Billy", 20);
        anIou.setSum("Madison", 9.19);
        System.out.println(anIou.howMuchDoIOweTo("Madison"));
        System.out.println(anIou.howMuchDoIOweTo("Timmy"));
    }
}
