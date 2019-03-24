package pers.pingweibo.interview.order;

/**
 * 快速排序
 * 执行时间O(N*logN)
 * 始终把最右边的 划分为‘枢纽值’;
 * 
 * "三数据项取中划分"
 * @author pingweibo
 *
 */
public class BaseQuickOrder {
    
	private long[] theArray;
	
	private int nElems;
	
	public BaseQuickOrder(int max) {
		theArray = new long[max];
		nElems = 0;
	}
	
	public void insert(long value) {
		theArray[nElems] = value;
		nElems++;
 	}
	
	public void display() {
		for(int j = 0;j<nElems;j++) {
			System.out.println(theArray[j]+" ");
		System.out.println("");	
		}
	}
	
	/**
	 * 开始快速排序
	 */
	public void quickSort() {
		recQuickSort(0,nElems-1);
	}
	
	/**
	 * 
	 * @param left
	 * @param right
	 */
	public void recQuickSort(int left , int right) {
		if(right - left <= 0) {//空数组
			return;
		}else {
			long pivot = theArray[right];
			int partition = partitionIt(left,right,pivot);//每回把最右端的作为枢纽值
			recQuickSort(left,partition-1);
			recQuickSort(partition+1,right);
		}
	}
	
	/**
	 * 枢纽默认永远为最右边那个
	 * @param left
	 * @param right
	 * @param pivot
	 * @return
	 */
	public int partitionIt(int left,int right,long pivot) {
		int leftPtr = left-1;
		int rightPtr = right;
		while(true) {
			while( theArray[++leftPtr] < pivot);
			while( rightPtr > 0 && theArray[--rightPtr] > pivot);//大于零，判断是否越界
			if(leftPtr >= rightPtr) {
				break;
			}else {
				swap(leftPtr,rightPtr);
			}
		}
		swap(leftPtr,right);//枢纽放在最右侧
		return leftPtr;
	}
	
	/**
	 * 交换
	 * @param dex1
	 * @param dex2
	 */
	public void swap(int dex1, int dex2) {
		long temp = theArray[dex1];
		theArray[dex1] = theArray[dex2];
		theArray[dex2] = temp;
	}
}
