package newjava2.ex02.ex2;

/**
 * 2.	假设有Car的一个类，其中包含的属性为车名和时速，要求用户创建出兰博基尼车，时速为200公里/小时，
 * 宝马车，时速为160公里/小时，别克车，时速为120公里/每 小时，并分别求得 假设 从A地到B地一共是20000公里，
 * 分别算出兰博基尼车，宝马，别克，需要开多少才能到达目的地，使用构造器！
 */
public class Car {

	private String name;
	private double speed;

	public Car(String name, double speed) {
		this.name = name;
		this.speed = speed;
	}

	public String getName() {
		return name;
	}

	public double getSpeed() {
		return speed;
	}
}
