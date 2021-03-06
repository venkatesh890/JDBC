import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.student.manage.Student;
import com.student.manage.StudentDao;

public class Start {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		System.out.println("Welcome");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			System.out.println("Press 1 to Add Student");
			System.out.println("Press 2 to Remove Student");
			System.out.println("Press 3 to Display Student");
			System.out.println("Press 4 to Exit Student");
			int c=Integer.parseInt(br.readLine());
			
			if(c==1) {
				//add
				System.out.println("enter user name : ");
				String name=br.readLine();
				System.out.println("enter phone : ");
				String phone=br.readLine();
				System.out.println("enter city : ");
				String city=br.readLine();
				
				//create obj. to store in db
				Student st=new Student(name, phone, city);
				boolean answer=StudentDao.insertStudentDB(st);
				if(answer) {
					System.out.println("added student");
				}else {
					System.out.println("error something");
				}
				System.out.println(st);
				
			}else if (c==2) {
				//delete
				System.out.println("enter id to delete");
				int userId=Integer.parseInt(br.readLine());
				boolean f=StudentDao.deleteStudent(userId);
				if(f) {
					System.out.println("deleted");
				}else {
					System.out.println("anything wrong");
				}
			}else if (c==3) {
				//display
				StudentDao.showAllStudent();
			}else if (c==4) {
				//exit
				break;
			}else {
				
			}
		}
		System.out.println("Thank You");
		System.out.println("Visit Again");
	}

}
