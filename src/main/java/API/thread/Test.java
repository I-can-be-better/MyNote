package API.thread;

import java.util.Arrays;

/**
 * 测试从数组中删除指定元素
 */
public class Test {
    public static void main(String[] args) {
        int[]allOut={1,5,8,10,0,44,-1,-9,7};
        int pw=0;
        System.out.println(Arrays.toString(allOut));
        //将pw从数组中删除
        for(int i=0;i<allOut.length;i++){
            if(pw==allOut[i]){
                allOut[i]=allOut[allOut.length-1];
                allOut=Arrays.copyOf(allOut,allOut.length-1);
                break;
            }
        }
        System.out.println(Arrays.toString(allOut));
    }
}
