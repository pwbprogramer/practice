package pers.pingweibo.interview.order;
/**
 * 选择排序O(N²)
 * 选择排序理论上要比冒泡排序快，因为交换花的时间短
 * 交换次数O(N)
 * 比较次数O(N²)
 * 选最大或最小的放在序列最左端
 * 选择排序（有序值放在最左边）
 * @author pingweibo
 *
 */
public class SelectOrder {
	
	
	private Object[] object;
	
	public SelectOrder(Object[] value) {
		this.object = value;
	}
	
	public void Desc() {
		for(int i = 0;i<this.object.length-1;i++) {
			for(int j = i+1;j<this.object.length;j++) {
				if(this.object[i].hashCode()<this.object[j].hashCode()) {
					Object temp = this.object[i];
					this.object[i] = this.object[j];
					this.object[j] = temp;
				}
			}
		}
	}
	
	public void Asc() {
		for(int i = 0;i<this.object.length-1;i++) {
			for(int j = i+1;j<this.object.length;j++) {
				if(this.object[i].hashCode()>this.object[j].hashCode()) {
					Object temp = this.object[i];
					this.object[i] = this.object[j];
					this.object[j] = temp;
				}
			}
		}
	}
	
	public void display() {
		for (Object value : this.object) {
			System.out.println(value);
		}
	}

}
