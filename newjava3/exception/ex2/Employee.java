package newjava3.exception.ex2;

/**
 * @Auther: zhangkaiming
 * @Date: 2018/8/13
 * @Description:
 *
 * 编写如下异常类：
 * 空异常(NullException ，年龄低异常(LowAgeException)，年龄高异常(HeightAgeException)，
 * 工资低异常(LowSalaryException)，工资高异常(HighSalaryException)，身份证非法异常(IdCardException)
 * 编写一个员工类，
 * (1) 有属性：
 * 编号，姓名，年龄，工资，身份证号码，员工人数（10），员工工资总额（10000）
 * (2) 有构造器：
 * 构造器1：设置编号，年龄，姓名；如果年龄小于18，抛出年龄低异常；如果年龄大于60
 * 抛出年龄高异常，如果姓名为null或为空字符串，抛出空异常。
 * 构造器2：设置工资，设置身份证号码；如果工资低于600，抛出工资低异常。
 * 如果身份证不是18位，抛出身份证非法异常。
 * (3) 有方法
 * 增加工资 addSalary(double addSalary)，抛出工资高异常，当增加后的工资大于员工工资总额时，抛出此异常。
 * 减少工资 minusSalary(double minusSalary), 抛出工资低异常，当减少后的工资低于政府最低工资时，抛出工资低异常。
 * 显示员工工资总额方法：showTotalSalary(),抛出空异常，当工资总额为0时，抛出此异常。
 * 显示员工人数：voidshowTotalEmployee（），抛出空异常。当员工人数为0时，抛出此异常
 * 编写main主测试类
 * 生成员工，测试构造方法的异常抛出。
 * 每个员工分别增加，减少工资，测试方法的异常。
 * 显示员工的人数和工资总额。
 */
public class Employee {

    private String id;//编号
    private String name;
    private Integer age;
    private String idCard;//身份证

    private Integer totalEmployee;//员工人数
    private Double totalSalary;//员工工资



}
