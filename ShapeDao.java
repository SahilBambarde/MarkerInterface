public class ShapeDao {
    public boolean delete(Object object){
        if(!(object instanceof Shape || object instanceof Person)){
            return false;
        }
        //delete implementation details
        return true;
    }
}
