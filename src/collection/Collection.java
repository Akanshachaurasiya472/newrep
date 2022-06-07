package collection;

import java.util.HashSet;
import java.util.Set;


		public class Collection {
			public Set<Integer>subtract(Set<Integer>a,Set<Integer>b){
			Set<Integer> firstSet=new HashSet<Integer>(a);
			Set<Integer> secSet=new HashSet<Integer>(b);
			firstSet.removeAll(secSet);
			return firstSet;
			}
			public Set<Integer>union(Set<Integer>a,Set<Integer>b){
			Set<Integer> firstSet=new HashSet<Integer>(a);
			Set<Integer> secSet=new HashSet<Integer>(b);
			firstSet.addAll(secSet);
			return firstSet;
			}
			public Set<Integer>intersect(Set<Integer>a,Set<Integer>b){
			Set<Integer> firstSet=new HashSet<Integer>(a);
			Set<Integer>secSet=new HashSet<Integer>(b);
			firstSet.retainAll(secSet);
			return firstSet;
			}
			public static void main(String[] args) {
		
			Set<Integer>set1=new HashSet<Integer>();
			set1.add(5);
			set1.add(6);
			set1.add(7);
			set1.add(8);
			Set<Integer>set2=new HashSet<Integer>();
			set2.add(9);
			set2.add(3);
			set2.add(7);
			Collection s=new Collection();
			System.out.println(s.subtract(set1,set2));
			System.out.println(s.union(set1,set2));
			System.out.println(s.intersect(set1,set2));
			}

}


