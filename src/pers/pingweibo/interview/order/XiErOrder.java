package pers.pingweibo.interview.order;

/**
 * 希尔排序大约要(O(N*(logN)²))
 * 希尔排序对于多达几千个数据项的，中等大小规模的数组排序表现良好。
 * @author pingweibo
 *
 */
public class XiErOrder {
      
	private long[] theArray;//待排序数组
	
	private int nElems;  //数组下标
	
	public XiErOrder(int max) {     //构造方法
		theArray = new long[max]; //创建数组
		nElems = 0; //赋值初始下标为0
	}
	
	/**
	 * 插入数据
	 * @param value
	 */
	public void insert(long value) {
		theArray[nElems] = value; //插入数据
		nElems++; //下标增加
	}
	
	/**
	 * 展示数据
	 */
	public void display() {
		for(int j=0;j<nElems;j++) {
			System.out.println(theArray[j]);
		}
	}
	
	/**
	 * 希尔排序算法
	 */
	public void shellOrder() {
		int inner; //内层 
		int outer; //外层
		long temp; //临时变量
		
		int h = 1;
		
		/**
		 * 跨度公式（需要思考一下）
		 */
		while(h <= nElems/3) {
			h = h*3+1;
		}
		System.out.println("初始步距："+h);
		System.out.println("=======");
		while(h>0) {
			for(outer=h; outer<nElems; outer++) {
				temp = theArray[outer];
				inner = outer;
				System.out.println("for循环inner值"+inner);
				System.out.println("=======");
				while(inner > h-1 && theArray[inner-h] >= temp){
					theArray[inner] = theArray[inner-h];
					inner -= h;
					System.out.println("while循环inner值"+inner);
					System.out.println("=======");
				}
				theArray[inner] = temp;
			}
			h = (h-1)/3;
			System.out.println("while每次步距："+h);
			System.out.println("=======");
		}
	}
	
	
}
