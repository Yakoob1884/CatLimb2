public class Cat {
    //Attributes
    private String name;
    private boolean permission;


    //Constructor
    public Cat(String name, boolean permission){
        this.name = name;
        this.permission = permission;
    }

    //Setter
    public void setPermission(boolean permission){
        this.permission = permission;
    }

    @Override
    public String toString(){
        return String.format("%-5s%-5s%-5b", name, ":" , permission);
    }
}
