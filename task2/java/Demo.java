import java.io.*;
import java.util.*;

public class Demo {

    private File file;
    private String nameFile;

    public Demo (String nameFile){
        this.nameFile = nameFile;
    }

    public void createFile(String text){
        file = new File(nameFile+".txt");
        try {
            FileWriter writer = new FileWriter(file);
            writer.write(text);
            writer.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public ArrayList<Character> createList(){
        String a ="";
        ArrayList<Character> characterArrayList = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            while ((a = reader.readLine()) != null){
                for (int i = 0;i<a.length();i++){
                    characterArrayList.add(a.charAt(i));
                }
                System.out.println(a);
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
       return characterArrayList;
    }

    public void amountChar(ArrayList<Character> list){
        HashSet<Character> set = new HashSet<>();
        for (char a:list){
            set.add(a);
        }
        ArrayList<Integer> num = new ArrayList<>();
        HashMap<Character,Integer> map = new HashMap<>();
        for (char b: set){
            int count = Collections.frequency(list,b);
            num.add(count);
            map.put(b,count);
        }
        List<Map.Entry<Character,Integer>> lis = new ArrayList<>(map.entrySet());
        Collections.sort(lis, new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        LinkedHashMap<Character,Integer> sort = new LinkedHashMap<>();
        for (Map.Entry<Character,Integer> bn: lis){
            sort.put(bn.getKey(),bn.getValue());
        }
        System.out.println(sort);
    }

    public String getNameFile() {
        return nameFile;
    }

    public File getFile() {
        return file;
    }

    public void setNameFile(String nameFile) {
        this.nameFile = nameFile;
    }

    public void setFile(File file) {
        this.file = file;
    }
}
