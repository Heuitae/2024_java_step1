package chapter17.treemap;

import java.util.Iterator;
import java.util.TreeMap;

public class MemberTreeMap {
	
	private TreeMap<Integer, String> treeMap;
	
	public MemberTreeMap() {
		treeMap=new TreeMap<Integer, String>();
	}
	
	public void addMember(MemberTree member) {
		
		treeMap.put(member.getMemberId(), member.getMemberName());
		
	}
	
	//removeMember
    public boolean removeMember(int memberId) {
       
       while(treeMap.containsKey(memberId)) {
          treeMap.remove(memberId);
             return true;
          }
       System.out.println(memberId+"가 존재하지 않습니다");
       return false;
   }
   
   //showAllMember
    public void showAllMember() {
       
       Iterator<Integer> ir=treeMap.keySet().iterator();//Key
      while(ir.hasNext()) {
         int key=ir.next();
         String member=treeMap.get(key);//value
         System.out.println(member);
      }
      System.out.println();
   }

}
