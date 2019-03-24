package pers.pingweibo.interview.order;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 冒泡排序O(N²)最慢
 * 交换次数O(N²)
 * 比较次数O(N²)
 * 选最大或最小的放在序列最右端
 * 冒泡排序（有序值放在最右边）
 * 外层控制长度
 * 内层控制从首位开始对比
 * 通过hashCode进行冒泡排序
 * @author pingweibo
 *
 */
public class MaoPaoOrder {
	
	private List<?> maoPaoList;
	
	private Object[] maoPao;
	
	private Set<?> maoPaoSet;
	
	private Map<?, ?> maoPaoMap;
	
	private String type;
	
	private TheMap mapOrderBy;
	
	private int size = 0;
	
	public MaoPaoOrder(List<?> list) {
		this.type = "list";
		this.size = list.size();
		this.maoPaoList = list;
	}
	
	public MaoPaoOrder(Object[] object) {
		this.type = "object";
		this.maoPao = object;
	}
	
	public MaoPaoOrder(Set<?> set) {
		this.type = "set";
		this.size = set.size();
		this.maoPaoSet = set;
	}
	
	public MaoPaoOrder(Map<?, ?> map,TheMap orderBy) {
		this.type = "map";
		this.size = map.size();
		this.mapOrderBy = orderBy;
		this.maoPaoMap = map;
	}
	
	//map未实现
	public void Desc() {
		Iterator<?> it = this.genertObject();
		for(int i = this.maoPao.length-1;i>1;i--) {
			for(int j = 0;j<i;j++) {
				if(this.maoPao[i].hashCode()>this.maoPao[j].hashCode()) {
					Object temp = this.maoPao[j];
					this.maoPao[j] = this.maoPao[i];
					this.maoPao[i] = temp;
				};
			}
		}
		this.genertResult(it);
	}
	
	//map未实现
	public void Asc() {
		Iterator<?> it = this.genertObject();
		for(int i = this.maoPao.length-1;i>1;i--) {
			for(int j = 0;j<i;j++) {
				if(this.maoPao[i].hashCode()<this.maoPao[j].hashCode()) {
					Object temp = this.maoPao[j];
					this.maoPao[j] = this.maoPao[i];
					this.maoPao[i] = temp;
				};
			}
		}
		this.genertResult(it);
	}
	
	private Iterator<?> genertObject() {
		Iterator<?> it = null;
		switch(this.type) {
		case "list" :
			it = this.maoPaoList.iterator();
			break;
		case "object" :
			break;
		case "set" :
			it = this.maoPaoSet.iterator();
			break;
		case "map" :
			switch (this.mapOrderBy) {
			case mapKey:
				it = this.maoPaoMap.keySet().iterator();
				break;
			case mapValue:
				it = this.maoPaoMap.entrySet().iterator();
				break;
			}
			break;
		}
		this.toObject(it);
		return it;
	}
	
	private void toObject(Iterator<?> it) {
		if(it!=null) {
			this.maoPao = new Object[this.size];
			int i=0;
			while(it.hasNext()) {
				this.maoPao[i] = it.next();
				i++;
			}
		}
	}
	
	private void genertResult(Iterator<?> it) {
		switch(this.type) {
		case "list" :
			List<Object> tempList = new ArrayList<Object>();
			for (Object tempValue : this.maoPao) {
				tempList.add(tempValue);
			}
			this.maoPaoList = tempList;
			break;
		case "object" :
			break;
		case "set" :
			Set<Object> tempSet = new HashSet<Object>();
			for (Object tempValue : this.maoPao) {
				tempSet.add(tempValue);
			}
			this.maoPaoSet = tempSet;
			break;
		case "map" :
			//未实现
			break;
		}
	}

	/**
	 * @return the maoPaoList
	 */
	public List<?> getMaoPaoList() {
		return maoPaoList;
	}

	/**
	 * @return the maoPao
	 */
	public Object[] getMaoPao() {
		return maoPao;
	}

	/**
	 * @return the maoPaoSet
	 */
	public Set<?> getMaoPaoSet() {
		return maoPaoSet;
	}

	/**
	 * @return the maoPaoMap
	 */
	public Map<?, ?> getMaoPaoMap() {
		return maoPaoMap;
	}

}
