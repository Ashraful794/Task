import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        Employee permanentEmployee1=new PermanentEmployee(1,"Abdur Rahim",1000.0f);
        Employee contractualEmployee1=new ContractualEmployee(2,"Kabir",40000.0f);
        Employee temporaryEmployee1=new TemporaryEmployee(3,"Habib",3000.0f);
        
        List<Employee> employeeList=new ArrayList<>();
        employeeList.add(permanentEmployee1);
        employeeList.add(contractualEmployee1);
        employeeList.add(temporaryEmployee1);

        for(Employee emp:employeeList)
        {
            HelperClass.showEmployeeInfo(emp);
            HelperClass.showEmployeeInfoWithEligibility(emp);
        }




    }
}
