package newjava7.ex2.ex7.SetExample;

/**
 * @Auther: zhangkaiming
 * @Date: 2018/8/10
 * @Description:
 */
public class Person implements Comparable{

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("equals...");
        if (this == o) return true;
        //if (o == null || getClass() != o.getClass()) return false;
        /*
        if (!(o instanceof Person)) return false;

        Person person = (Person) o;

        return name.equals(person.name);
        */

        return o instanceof Person &&
                (name.equals(((Person) o).name));

    }

    @Override
    public int hashCode() {
        System.out.println("hashCode...");
        return name.hashCode();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        System.out.println("compareTo...");
        if (this == o) return 0;
        if (o == null) return 0;

        Person person = (Person) o;
        return name.compareTo(person.name);
    }
}
