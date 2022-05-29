|  | notes |
| --- | --- |
| Recursion | 递归<br>必要条件：basecase基本条件 |
| Primitive Types | 基本类型8种：byte,short,int,long,float,double,boolean,char |
| Reference Types | 1.除8种基本类型外均为reference type引用类型（不论是ArrayList还是自己写的类）<br>2.引用类型的变量被声明时，java分配64bits的空间，这些bits里放null或者64bits<br>的地址信息of a specific instance of that class(returned by new)<br>3.类的实例对象本身字节数可能远远大于64bits，这是两码事<br>4."box and pointer"notation 方框和指针表示法 |
| Parameter Passing | The Golden Rule of Equals: <br> Given variables b to a: b = a means <b>copies<b> all the bits from a into b<br> In parameter passing, copying the bits also called <b><i>pass by value按值传递<i><b>(may be used in interviews) |
| Test Your Understanding of the GRoE | <img width="810" alt="截屏2022-05-29 下午7 28 49" src="https://user-images.githubusercontent.com/37496223/170865773-4d27a52e-8d3c-4414-bd3b-5f121130566e.png"> |
| Instantiaing Arrays | <img width="440" alt="截屏2022-05-29 下午7 14 48" src="https://user-images.githubusercontent.com/37496223/170865278-142483ae-197a-4e4c-b6e5-28243e1d5422.png"> |
| Introduce IntLists | 数组长度固定，list长度可变 |
| IntList size | Using <b>recursion递归<b> to return the size of IntList |
| IntList iterativeSize | Using <b>iteration迭代<b> to return the size of IntList |
| More IntList Exercises | Using <b>recursion递归<b> and <b>iteration迭代<b> to return the ith element of IntList |
  
  
  ```
public class IntList{
  /**Return the size of this IntList*/
    //use recursion递归 
	public int size(){
		if(rest == null){
			return 1;
		}
		return 1+this.rest.size();
	}
	//use iteration迭代
	public int iterationSize(){
		IntList p = this;
		int count = 0;
		while(p != null){
			p = p.rest;
			count++;
		}
		return count;
	}

	/**Return the ith item of this IntList*/
	//use recursion递归 
	public int get(int i){
		//basecase
		if(i == 0){
			return this.first;
		}
		return this.rest.get(i-1);
	}
	//use iteration迭代
	public int iterationGet(int i){
		IntList p = this;
		while(i != 0){
			p = p.rest;
			i--;
		}
		return p.first;
	}
  
	public int first;
	public IntList rest;
	public IntList(int f, IntList r){
		first = f;
		rest = r;
  
  public static void main(String[] args){
		IntList L = new IntList(15,null);
		L = new IntList(10, L);
		L = new IntList(5,L);

		System.out.println(L.iterationSize());
	}
}
  ```













