
public class outer {
    int nums[];  
	outer(int n[]){
    	  nums = n;
      }
	void analyze() {
		inner inob = new inner();
		System.out.println("Minimun ="+ inob.min());
		System.out.println("Maximun ="+ inob.max());
		System.out.println("Average ="+ inob.avg());
	}
	class inner{
		int min() {
			int m = nums[0];
			for(int i=0; i<nums.length; i++)
				if(nums[i] < m)
					m = nums[i];
			return m;
		}
		int max() {
			int m = nums[0];
			for(int i=0; i<nums.length; i++)
				if(nums[i] > m)
					m = nums[i];
			return m;
		}
		int avg() {
			int a =0;
			for(int i=0; i<nums.length; i++)
				a = a+nums[i];
			return a/nums.length;
		}
	}
}
