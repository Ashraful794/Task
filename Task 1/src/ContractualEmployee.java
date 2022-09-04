public class ContractualEmployee extends Employee {

    public ContractualEmployee() {}
    public ContractualEmployee(int id,String name)
    {
        this.id=id;
        this.name=name;
    }
    public ContractualEmployee(int id,String name,float salary)
    {
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    @Override
    public float getBonusAndProvidentFundInfo() {
        return 0;
    }

    @Override
    public boolean getBonusAndProvidentFundEligibility() {
        return false;
    }
}
