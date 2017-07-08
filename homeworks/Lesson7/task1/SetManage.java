package task1;

import java.util.HashSet;
import java.util.Set;

public class SetManage {
	Set<Integer> unionSet = new HashSet<Integer>();
	Set<Integer> intersectSet = new HashSet<Integer>();
	
	public Set<Integer> union(Set<Integer> set1, Set<Integer> set2) {
		this.unionSet.clear();
		this.unionSet.addAll(set1);
		this.unionSet.addAll(set2);
		return this.unionSet;
	}
	public Set<Integer> intersect (Set<Integer> set1, Set<Integer> set2) {
		this.intersectSet.clear();
		this.intersectSet.addAll(set1);
		this.intersectSet.retainAll(set2);
		return this.intersectSet;
	}

}
