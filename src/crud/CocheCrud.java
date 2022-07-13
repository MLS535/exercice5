package crud;

public class CocheCrud implements CocheCrudInterface {
    @Override
    public void save() {
        System.out.println("CocheCrud => save method");
    }

    @Override
    public void findAll() {
        System.out.println("CocheCrud => findAll method");
    }

    @Override
    public void delete() {
        System.out.println("CocheCrud => delete method");
    }
}
