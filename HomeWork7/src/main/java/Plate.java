public class Plate {
    private static final int FULL_SIZE = 10;
    private int size = FULL_SIZE;

    public boolean decreaseFood(int request){
        if(request <= size){
            size -= request;
            return true;
        }
        return false;
    }

    public void increaseFood(int request){
        int tempSum = request + size;


        size = Math.min(tempSum, FULL_SIZE);

    }

     public void increaseFood() {
         size = FULL_SIZE;

     }

}
