public class Puppy {
    private int age;
    private String name;

    //构造器
    public Puppy(String name){
        this.name = name;
        System.out.println("Name is: " + name);
    }

    //设置age的值
    public void setAge(int age){
        this.age = age;
    }
    
    //获取age的值
    public int getAge(){
        return age;
    }

    //主方法
    public static void main(String[] args){
        //创建对象
        Puppy myPuppy = new Puppy("tommy");
        //设置age
        myPuppy.setAge(2);
        //获取age
        System.out.println("Age is: " + myPuppy.getAge());
    }
}
