package OOPs.Association.Composition;

class College{
    private String collName;
    private int estYear;
    private final Department dept;
    College(String collName,int estYear,String deptName,String hodName){
        this.collName=collName;
        this.estYear=estYear;
        dept=new Department(deptName,hodName);
    }
    private class Department{
         private String deptName;
         private String hodName;
         public Department(String deptName,String hodName){
             this.deptName=deptName;
             this.hodName=hodName;
         }

         public String toString(){
             return "DepartName name:"+this.deptName +",Hod Name :"+this.hodName;
         }
    }

    public void showDetails(){
        System.out.println("College Name:"+this.collName+",Estabishment Year:"+this.estYear);
        System.out.println("Department Details:"+dept);
    }
}

public class TestCompo {
    static void main() {
         College coll=new College("IIT Delhi",1993,"CSE","Mr.Kumar");
         coll.showDetails();
    }
}
