
public class PermanentEmployee extends Employee {
    public PermanentEmployee() {}
    public PermanentEmployee(int id,String name)
    {
        this.id=id;
        this.name=name;
    }
    public PermanentEmployee(int id,String name,float salary)
    {
        this.id=id;
        this.name=name;
        this.salary=salary;
    }

    @Override
    public float getBonusAndProvidentFundInfo() {
        return (this.salary*50)/100;
    }

    @Override
    public boolean getBonusAndProvidentFundEligibility() {
        return true;
    }
}
