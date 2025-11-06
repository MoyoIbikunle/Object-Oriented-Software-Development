public class Student extends Person

{
    private int numCourses;
    private String [] courses = new String [10];
    private int [] grades = new int [10];


    public Student(String name, String address)
    {
        super(name,address);
        
    }

    public void addCourseGrade(String course, int grade)
    {
                courses[numCourses] = course;
                grades[numCourses] = grade;
                numCourses++;
           
        
    }


    public void printGrades()
    {
    
        for(int i = 0; i < numCourses; i++)
        {
            System.out.println( courses[i]+ ":" + grades[i]);
        }
    }

    public double getAverageGrade()
    {
        double avgResult;
        avgResult = 0;

        for(int i=0; i< numCourses; i++)
        {
            avgResult += grades[i];
        }

        avgResult = (avgResult/numCourses);

        return avgResult;
    }

    public String toString()
    {
     
        return "Student:" + super.toString();
        
    }





}

