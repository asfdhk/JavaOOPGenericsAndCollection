import java.util.ArrayList;

public class Demo {

    private ArrayList<String> list = new ArrayList<>();

    public void createList(String... a){
        for (int i = 0;i<a.length;i++){
            list.add(a[i]);
        }
    }

    public void queue(int i){
        String []b =new String[i];
        for (int a =0;a<i;a++){
            b[a] = list.get(0);
            list.remove(0);
        }
        for (String a : b){
            list.add(a);
        }
        list.add(b[i-1]);
    }

    public ArrayList<String> getList() {
        return list;
    }

    public void setList(ArrayList<String> list) {
        this.list = list;
    }
}
