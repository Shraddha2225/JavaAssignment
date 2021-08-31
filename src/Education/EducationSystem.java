package Education;

public class EducationSystem {
    public static void main (String args[]){
        Graduation gd = new Graduation();
        gd.streams();
        gd.hscPercentage();
        gd.ageCriteria();


        Engineering eg = new Engineering();
        eg.streams();
        eg.typeOfEngineering();

        ComputerScienceEngg cse = new ComputerScienceEngg();
        cse.hscPercentage();
        cse.subjects();

    }
}
