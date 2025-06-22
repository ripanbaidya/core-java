package record;

public record Employee(Integer id, String name, String role, Double salary) {

    public void display(){
        System.out.println("id: "+id());
        System.out.println("name: "+name);
    }
}
