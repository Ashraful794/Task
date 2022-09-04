public class HelperClass {


    // Show employee information with bonus and provident-fund
    public static void showEmployeeInfo(Employee employee)
    {
        String info="Employee ID: "+employee.id+" Employee Name : "
                    +employee.name+" Employee Bonus : " +employee.getBonusAndProvidentFundInfo();
        System.out.println(info);
    }

    // Show employee information with provident-fund eligibility
    public static  void showEmployeeInfoWithEligibility(Employee employee)
    {
        String info="Employee ID: "+employee.id+" Employee Name : "
                    +employee.name+" Employee is eligible for Provient Fund : "
                    +employee.getBonusAndProvidentFundEligibility();
        System.out.println(info);
    }

}
