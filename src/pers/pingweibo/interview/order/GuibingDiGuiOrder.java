package pers.pingweibo.interview.order;


/**
 * 归并排序(将俩个有序数组，合并为一个有序数组的的算法)
 * 
 * 
 * 归并排序的思想是：把一个完整的数组切成2半，然后对每一半进行排序，最后将2个数组归并；
 * 对每一个一半采用递归的思想，继续进行归并排序
 * 
 * 1.总方法
 * 2.递归拆分方法
 * 3.排序方法
 * 
 * @author pwb
 *
 */
public class GuibingDiGuiOrder {

	
	private long[] theArray;
	
	private int nElems;
	
	private int num;
	
	/**
	 * 构造方法
	 * @param max
	 */
	public GuibingDiGuiOrder(int max) {
       this.theArray = new long[max];
       this.nElems = 0;
       this.num = 1;
	}
	
	/**
	 * 插入数据
	 * @param value
	 */
	public void insert(long value) {
		this.theArray[nElems++] = value;
	}
	
	/**
	 * 执行归并排序
	 */
	public void mergeSort() {
		long[] workSpace = new long[this.nElems];
		recMergeSort(workSpace,0,this.nElems-1);
	}
    
	/**
	 * 递归执行排序
	 * @param workSpace 排序中间数组
	 * @param lowerBound 数组最小下标
	 * @param upperBound 数组最大上标
	 */
	private void recMergeSort(long[] workSpace,int lowerBound,int upperBound) {
		System.out.println("方法进入次数："+(this.num++));
		//当数组只有一个元素时，不排序
		if(lowerBound == upperBound) {
			return;
		}else {
			//切两半
			int mid = (lowerBound+upperBound)/2;
			//左边数组排序
			recMergeSort(workSpace,lowerBound,mid);
			//右边数组排序
			recMergeSort(workSpace, mid+1, upperBound);
			//排序合并
			merge(workSpace,lowerBound,mid+1,upperBound);
		}
	}
	
	private void merge(long[] workSpace,int lowPtr,int highPtr,int upperBound) {
		int j = 0;
		int lowerBound = lowPtr;
		int mid = highPtr-1;
		int n = upperBound - lowerBound+1;
		
		//左右两边都有数据的时候
		while(lowPtr <= mid && highPtr <=upperBound) {
			if( theArray[lowPtr] < theArray[highPtr]) {
				workSpace[j++] = theArray[lowPtr++];
			}else {
				workSpace[j++] = theArray[highPtr++];
			}
		}
		
		//右侧无数据，排左侧
		while(lowPtr <= mid) {
			workSpace[j++] = theArray[lowPtr++];
		}
		//左侧无数据，排右侧
		while(highPtr <= upperBound) {
			workSpace[j++] = theArray[highPtr++];
		}
		
		//将中间数组数据复制进原数组
		for(j=0;j<n;j++) {
			theArray[lowerBound+j] = workSpace[j];
		}
	}
	
	/**
	 * 展示结果
	 */
	public void display() {
		for (long l : theArray) {
			System.out.println(l);
		}
	}
}

