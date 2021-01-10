package test20;

public class ArrayUtil {

	static Food[] add(Food[] fs, String name) {
		Food[] tmpFs = fs;
		fs = new Food[fs.length+1];
		for(int i=0;i<tmpFs.length;i++) {
			fs[i] = tmpFs[i];
		}
		fs[fs.length-1] = new Food();
		fs[fs.length-1].name = name;
		return fs;
	}
}
