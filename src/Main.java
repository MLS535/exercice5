import crud.CocheCrud;

public class Main {
    public static void main(String[] args) {
        CocheCrud cocheCrud = new CocheCrud();
        cocheCrud.save();
        cocheCrud.delete();
        cocheCrud.findAll();
    }
}
