package pers.pingweibo.interview.order;

/**
 * 划分
 * 将一个数组根据一个‘标准值’划分为2半
 * 左侧一半全部小于‘标准值’ 右侧一半全部大于‘标准值’
 * 划分过程，设置两个‘指针’，分边从最左端，和最右端开始，像‘对侧遍历’ 交换‘相互一侧不符合条件的值’
 * O(N)
 * @author pingweibo
 *
 */
public class ArrayPar {

	private long[] theArray;
	
	private int nElems;
	
	public ArrayPar(int max) {
		theArray = new long[max];
		nElems = 0;
	}
	
	public void insert(long value) {
		theArray[nElems] = value;
		nElems++;
	}
	
	public int size() {
		return nElems;
	}
	
	public void display() {
        for(int j=0;j<nElems;j++) {
        	System.out.println(theArray[j]);
        System.out.println("");
        }
	}
	
	/**
	 * 
	 * @param left 左端点
	 * @param right 右端点
	 * @param pivot 划分值
	 * @return
	 */
	public int partitionIt(int left,int right,long pivot) {
		int leftPtr = left - 1;
		int rightPtr = right + 1;
		while(true) {
			while(leftPtr<right && theArray[++leftPtr] < pivot);
			while(rightPtr>left && theArray[--rightPtr] > pivot);
			if(leftPtr >= rightPtr) {
				break;
			}else {
				swap(leftPtr,rightPtr);
			}
		}
		return leftPtr;
	}
	
	public void swap(int dex1,int dex2) {
		long temp;
		temp = theArray[dex1];
		theArray[dex1] = theArray[dex2];
		theArray[dex2] = temp;
	}
}
