public abstract class Employee implements IEmployee {
    protected int id;
    protected String name;
    protected float salary;

    public void setId(int id)
    {
        this.id=id;
    }
    public int getId()
    {
        return this.id;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName()
    {
        return this.name;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public float getSalary() {
        return salary;
    }

}
