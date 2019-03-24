package pers.pingweibo.interview.order;


/**
 * 插入排序 对于完全无需来说 O(N²) 对于局部有序来说速度快。
 * 插入排序理论上要比冒泡排序快一倍，比选择排序还快一点
 *主要快速在局部有序上；局部有序后，while循环就不进了，提升速度；
 *永远先把左侧有序；
 * 插入排序
 * 
 * 思想就是从左边开始排
 * 0,1排，然后0 1 2 排，然后0 1 2 3 排，相当于把一个数插入到一个有序数组中进行排列。
 * 所以局部有序对于插入排序很重要。
 * 即挪动，把其余数挪到他的右边，空出的位置插入他，
 * 从最右往最左比，最终使得整个数组的左半边有序，
 * 然后继续向右。外层数组相当于打断原数组，只排序左边的。
 * 插入排序使用了增量算法，在排序子数组A[1..j-1],将单个元素A[j]插入子数组的适当位置，产生排序好的子数组A[1..j]。
 * @author pingweibo
 *
 */
public class InsertOrder {
	
	private Object[] object;
	
	public InsertOrder(Object[] value) {
		this.object = value;
	}
	
	public void insertionSort() {
		int in,out;
		for(out=1; out<this.object.length;out++) {
			Object temp = this.object[out];
			in = out;
			while(in>0 && this.object[in-1].hashCode() >= temp.hashCode()) {
				this.object[in] = this.object[in-1];
				--in;
			};
			this.object[in] = temp;
		}
	}
	
	public void display() {
		for (Object object2 : object) {
			System.out.println(object2);
		}
	}

}
