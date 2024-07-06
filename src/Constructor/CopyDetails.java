package Constructor;

public class CopyDetails {

    int id;
    String name;

    CopyDetails(int i, String n){
        id = i;
        name = n;
    }

    CopyDetails(CopyDetails c){
        id = c.id;
        name = c.name;
    }

    void display(){
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        CopyDetails c1 = new CopyDetails(100, "lucas");
        CopyDetails c2 = new CopyDetails(c1);
        c1.display();
        c2.display();
    }
}
