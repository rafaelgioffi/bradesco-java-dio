package employee;

public class Main {
    public static void main(String[] args) {
        //Employee employee = new Employee(); Employee não pode ser instanciado pois é abstrato.
        printEmployee(new Manager());
        printEmployee(new Salesman());
    }

    public static void printEmployee(Employee employee) {
        System.out.printf("=======%s=======\n",employee.getClass().getCanonicalName());
//        if (employee instanceof Manager manager) {
//        }
        switch (employee) {
            case Manager manager -> {
                manager.setCode("10000101");
                manager.setName("Isaias Barros");
                manager.setSalary(12500);
                manager.setLogin("isaias.barros");
                manager.setPassword("123456");
                manager.setComission(3200);

                System.out.println("Chapa: " + manager.getCode());
                System.out.println("Nome completo: " + manager.getName());
                System.out.println("Salário base: R$" + manager.getSalary());
                System.out.println("Login: " + manager.getLogin());
                System.out.println("Senha: " + manager.getPassword());
                System.out.println("Comissão: R$" + manager.getComission());
                System.out.println("Salários + Extras: R$" + manager.getFullSalary(500));
            }
            case Salesman salesman -> {
                salesman.setCode("10000102");
                salesman.setName("Vinicius Araújo");
                salesman.setSalary(4000);
                salesman.setPercentPerSold(10);
                salesman.setSoldAmount(1000);

                System.out.println("Chapa: " + salesman.getCode());
                System.out.println("Nome completo: " + salesman.getName());
                System.out.println("Salário base: R$" + salesman.getSalary());
                System.out.println("Porcentagem de vendas: " + salesman.getPercentPerSold() + "%");
                System.out.println("Vendas do mês: " + salesman.getSoldAmount());
            }
        }
        System.out.println("Salário final: R$" + employee.getFullSalary());
        System.out.println("==============");
    }
}
