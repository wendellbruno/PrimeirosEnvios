package application;

import entites.Employees;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Employees> list = new ArrayList<>();

        System.out.print("Quantidade de funcionarios : ");
        Integer aux = scan.nextInt();

        for (int i = 0; i < aux ; i++) {
            System.out.println("Funcionario " + (i+1) );
            System.out.print(" ID : ");
            int id = scan.nextInt();
            while(noId(list, id)){
                System.out.println("ID já cadastrado, tente novamente ");
                id = scan.nextInt();
            }
            System.out.print(" Nome : ");
            scan.nextLine();
            String name = scan.nextLine();
            System.out.print(" Salario : ");
            double salary = scan.nextDouble();
            list.add(new Employees(name, id, salary));
        }
             System.out.println();
          for ( Employees x : list ) {
            System.out.println(x);
        }
           System.out.print(" ID do funcionario que vai receber aumento : ");
           int idSalary = scan.nextInt();
           Employees busca = list.stream().filter(x->x.getId()==idSalary).findFirst().orElse(null);
           //Integer busca = buscarId(list,idSalary);
           if(busca == null){
               System.out.println("ID não encontrado");
           }else{
               System.out.print(" Porcentagem de aumento :");
               double percent = scan.nextDouble();
               busca.addSalary(percent);
           }
        System.out.println();
        System.out.println("Lista de funcionarios atualizada : ");
        for(Employees emp : list){
            System.out.println(emp);
        }
    }

     public static boolean noId(ArrayList<Employees> list, int id){
        Employees emp = list.stream().filter(x->x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }

    //metodo normal de busca :
    /*public static Integer buscarId(ArrayList<Employees> list, int id) {
          for (int i = 0; i < list.size() ; i++) {
              if(list.get(i).getId() == id){
                  return i;
              }
               }return null;*/
    }



