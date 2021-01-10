package test25;

/* Map <-- 배열같은게 2개 있음, 왜? 키와 밸류를 저장해야되니까
 * put
 * get
 * 
 * ArrayList <-- 배열의 확장판
 * List l = new ArrayList();
 * l.add(1);
 */
public class MapTest {
	private int size = 0;
	private String[] keys = new String[size];
	private String[] values = new String[size];
	
	String put(String key, String value) {
		size ++;
		String[] tmp = keys;
		keys = new String[size];
		for(int i=0;i<tmp.length;i++) {
			keys[i] = tmp[i];
		}
		keys[size-1] = key;
		
		tmp = values;
		values = new String[size];
		for(int i=0;i<tmp.length;i++) {
			values[i] = tmp[i];
		}
		values[size-1] = value;
		return key;
	}
	int size() {
		return size;
	}
	int indexOf(String key) {
		for(int i=0;i<keys.length;i++) {
			if(keys[i].equals(key)) {
				return i;
			}
		}
		return -1;
	}
	String get(String key) {
		int idx = indexOf(key);
		if(idx==-1) {
			return null;
		}
		return values[idx];
	}
	public static void main(String[] args) {
		MapTest mt = new MapTest();
		mt.put("이름", "홍길동");
		mt.put("나이", "33");
		mt.put("나이1", "1");
		mt.put("나이2", "2");
		mt.put("나이3", "3");
		mt.put("나이4", "4");
		mt.put("나이5", "5");
		mt.put("나이6", "6");
		System.out.println(mt.size());
		System.out.println(mt.get("이름"));
		System.out.println(mt.get("나이"));
		System.out.println(mt.get("나이1"));
		System.out.println(mt.get("나이2"));
		System.out.println(mt.get("나이3"));
		System.out.println(mt.get("나이4"));
		System.out.println(mt.get("나이5"));
		System.out.println(mt.get("나이6"));
		
	}
}



