public class single {
    public static void main(String[] args){
       girlfriend friend = girlfriend.getInstance();
       System.out.println(friend);
       System.out.println(girlfriend.b);
       int a = girlfriend.getInstance().getInstance().getInstance().getInstance().b;
       System.out.println(a);
 
    }
}
//单例模式——饿汉模式
class girlfriend{
    private String name;
    public static int b = 100;
   private static girlfriend xh = new girlfriend("小红");
//构造器私有
    private girlfriend(String name) {
        System.out.println("构造器被调用");
        this.name = name;
    }
//提供全局访问点
    public  static girlfriend getInstance(){
        System.out.println("单列模式被调用");
       return xh;
    }
 
    @Override
    public String toString() {
        return "girlfriend{" +
                "name='" + name + '\'' +
                '}';
    }
}