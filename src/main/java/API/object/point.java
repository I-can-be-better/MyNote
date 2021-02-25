package API.object;

import java.util.Objects;

/**
 * 使用当前类测试场被重写的object相关方法
 */
public class point {
    public point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    private int x;
    private int y;

    @Override
    public String toString() {
        return "point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        point point = (API.object.point) o;
        return x == point.x &&
                y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
//自动生成代码快捷键:alt+insert
    //或点击鼠标右键,点击generate(快捷键alt+insert),点击constructor,即自动生成构造方法
    //点击get and set ,自动生成get set方法
    //点击tostring,自动重写转换成字符串类型


}
