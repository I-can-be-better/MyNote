package API.collection.set;
/**本类用来测试给set自定义对象去重*/
public class Student {
    //1.提供对应对象的属性并进行封装
    private String name;
    private int age;
    private String addr;
    /**注意1:如果提供了含参/全参构造,需要手动添加无参构造,否则创建对象时必须传参*/
    /**注意2:我们可以通过快捷方式生成构造方法:右键--Source--Generate Constructor using fields...*/
    /**注意3:给对象的属性赋值,可以通过构造方法[创建对象时直接赋值]/set()[创建对象后调用公共的设置方法赋值]*/

    //2.1提供无参构造
    public Student() {
        System.out.println("我是无参构造");
    }

    //2.2提供含参构造
    public Student(String name, int age, String addr) {
        super();
        this.name = name;
        this.age = age;
        this.addr = addr;
        System.out.println("我是全参构造");
    }

    /**注意4:以通过快捷方式生成:右键--Source--Generate Getters and Setters --Select All*/

    //3.提供公共的get()/set()
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    /**注意5:重写是为了能够看到对象的属性值
     * 我们可以通过快捷方式生成:右键--Source--Generate to String()...*/

    //4.重写toString()
    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + ", addr=" + addr + "]";
    }

    //5.重写hashCode() & equlas()
    //重写hashCode():我们并不想使用自动计算出的哈希值,而是要根据对象的属性值进行计算,如果两个对象的属性值都相同,想生成同一个哈希码
    //重写equals():我们想比较的不是对象的地址值(==),而是如果两个对象的属性值都一样,则返回true

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((addr == null) ? 0 : addr.hashCode());
        result = prime * result + age;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Student other = (Student) obj;
        if (addr == null) {
            if (other.addr != null)
                return false;
        } else if (!addr.equals(other.addr))
            return false;
        if (age != other.age)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }
}
