package pers.pingweibo.interview.order;

/**
 * 当有两个已经有序的数组想合成第三个有序数组时，使用归并。
 * 归并排序(O(N*logN))
 * 归并缺点（需要一个与原数据项目大小相同的数组）如果没有足够的存储空间则没办法运行归并排序
 * 归并算法的核心 是归并‘两个’ ‘有序’ 的数组 到第‘三’个。
 * @author pingweibo
 *
 */
//循环解释归并思想
public class GuiBingOrder {
   
	private int[] result = null;
	
	public void GuiBing(int[] arrayA,int sizeA,
			            int[] arrayB,int sizeB,
			            int[] arrayC) {
		this.result = arrayC;
		int aDex = 0, bDex=0, cDex=0;
		//数组A，数组B空不空作为判断条件
		 //1.两个都不空的判断
		while(aDex<sizeA&&bDex<sizeB) {
			if(arrayA[aDex] < arrayB[bDex]) {
				arrayC[cDex++] = arrayA[aDex++];
			}else {
				arrayC[cDex++] = arrayB[bDex];
			}
		}
		
		//当B数组为空时
		while(aDex<sizeA) {
			arrayC[cDex++] = arrayA[aDex++];
		}
		
		while(bDex<sizeB) {
			arrayC[cDex++] = arrayB[bDex++];
		}
	}
	
	public void display() {
		if(this.result!=null) {
			for (int i : result) {
				System.out.println(i);
			}
		}
	}
}
