package pers.pingweibo.interview.order;

/**
 * 
 * @author pingweibo
 *
 */
public class ThreeQuickOrder {
    
	
	private long[] theArray;
	
	private int nElems;
	
	/**
	 * 构造方法 初始化数组
	 * @param max
	 */
	public ThreeQuickOrder(int max) {
		theArray = new long[max];
		nElems = 0;
	}
	
	/**
	 * 插入方法
	 * @param value
	 */
	public void insert(long value) {
		theArray[nElems] = value;
		nElems++;
	}
	
	/**
	 * 展示数组
	 */
	public void display() {
		for(int j=0;j<nElems;j++) {
			System.out.println(theArray[j]);
		}
	}
	
	/**
	 * 执行快排
	 */
	public void quickSort() {
		recQuickSort(0,nElems);
	}
	
	/**
	 * 分为数组小于等于3 的情况 和大于3的情况
	 * @param left
	 * @param right
	 */
	public void recQuickSort(int left,int right) {
		//总个数
		int size = right-left+1;
		if(size<=3) {//小于等于3的数组长度
			manualSort(left,right);
		}else {
			long median = medianOf3(left,right);//算枢纽
			int partition = partitionIt(left,right,median);//划分为每一个小数组,不断地划分;
			recQuickSort(left,partition-1);
			recQuickSort(partition+1,right);
		}
	}
	
	/**
	 * 三项取中算枢纽算法
	 * @param left
	 * @param right
	 * @return
	 */
	public long medianOf3(int left, int right) {
		int center = (left+right)/2;
		
		if( theArray[left] > theArray[center]) {
			swap(left,center);
		}
		
		if( theArray[left] > theArray[right]) {
			swap(left,right);
		}
		
		if( theArray[center] > theArray[right]) {
			swap(center,right);
		}
		
		swap(center,right-1);//把枢纽放在最右边
		return theArray[right-1];
	}
	
	/**
	 * 执行交换
	 * @param dex1
	 * @param dex2
	 */
	public void swap(int dex1, int dex2) {
		long temp = theArray[dex1];
		theArray[dex1] = theArray[dex2];
		theArray[dex2] = temp;
	}
	
	/**
	 * 快排比较划分
	 * @param left
	 * @param right
	 * @param pivot
	 * @return
	 */
	public int partitionIt(int left, int right, long pivot) {
		
		int leftPtr = left;
		int rightPtr = right - 1;
		
		while(true) {
			while( theArray[++leftPtr] < pivot);//最右侧为枢纽，不用害怕越界
			while( theArray[--rightPtr] > pivot);//确定了数组最左侧肯定小于枢纽，同样不用害怕越界
			if(leftPtr >= rightPtr) {
				break;
			}else {
				swap(leftPtr,right-1);
			}
		}
		swap(leftPtr,right-1);
		return leftPtr;
	}
	
	/**
	 * 当数组小于等于3的时候的算法
	 * @param left
	 * @param right
	 */
	public void manualSort(int left, int right) {
		int size = right-left+1;//算个数
		if(size <= 1) {
			return;
		}
		if(size == 2) {
			if( theArray[left] > theArray[right]) {
				swap(left,right);
			  return;	
			}
		}else {//size=3
			if( theArray[left] > theArray[right-1]) {
				swap(left,right-1);
			}
			if( theArray[left] > theArray[right]) {
				swap(left,right);
			}
			if( theArray[right-1] > theArray[right]) {
				swap(right-1,right);
			}
		}
	}
}
