package newhash;

public class test {
	public static void main(String[] args) {
		hashtable ha = new hashtable();
		
		ha.insert(new hash("a", "张三"));
		ha.insert(new hash("ct", "李四"));
		ha.insert(new hash("cba", "王五"));
		ha.insert(new hash("acb", "赵六"));
		ha.insert(new hash("zhangsanzhangsan", "陈七"));
		
		System.out.println(ha.find("a").getName());
		System.out.println(ha.find("ct").getName());
		System.out.println(ha.find("cba").getName());
		System.out.println(ha.find("acb").getName());
		System.out.println(ha.find("zhangsanzhangsan").getName());
		
		hashtable.delete("acb");
		System.out.println(ha.find("acb").getName());
	}
}
