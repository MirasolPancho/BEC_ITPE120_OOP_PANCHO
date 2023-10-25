public class MyClass{
    /*Static Variables*/
    private static int instanceCount = 0;
    private String name;

    public MyClass(String name){
        this.name = name;
        instanceCount++;
    }
    public String getName(){
        return name;
    }
    public static int getInstanceCount(){
        return instanceCount;
    }
    public static void main(String[] args){
        MyClass obj1 = new MyClass("Instance 1");
        MyClass obj2 = new MyClass("Instance 2");
        MyClass obj3 = new MyClass("Instance 3");
        MyClass obj4 = new MyClass("Instance 4");
        MyClass obj5 = new MyClass("Instance 5");

        System.out.println("Number of instances."+MyClass.getInstanceCount());
        System.out.println("1. "+obj1.getName());
        System.out.println("2. "+obj2.getName());
        System.out.println("3. "+obj3.getName());
        System.out.println("4. "+obj4.getName());
        System.out.println("5. "+obj5.getName());
        System.out.println("Instances created.");

    }
}