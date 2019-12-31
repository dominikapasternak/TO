import java.util.ArrayList;
import java.util.List;

public class Students implements Cloneable{

    private List<String> stuList;

    public Students(){
        stuList = new ArrayList<String>();
    }

    public Students(List<String> list){
        this.stuList=list;
    }
    public void loadData(){
        stuList.add("Jhon");
        stuList.add("Monica");
        stuList.add("David");
        stuList.add("Lisa");
    }

    public List<String> getStuList() {
        return stuList;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        List<String> temp = new ArrayList<String>();
        for(String s : this.getStuList()){
            temp.add(s);
        }
        return new Students(temp);
    }

}


