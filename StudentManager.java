import java.util.*;

public class StudentManager {
	private Scanner scanner = new Scanner(System.in);
	private ArrayList<Student> dept = new ArrayList<Student>();
	Student std = new Student();
	private void read() {
		System.out.println("�л� �̸�,�а�,�й�,������� �Է��ϼ���.");
		for (int i=0; i<4; i++) {
			System.out.print(">> ");
			String text = scanner.nextLine();
			StringTokenizer st = new StringTokenizer(text, ",");
			
			std.setName(st.nextToken());
			std.setDepartment(st.nextToken());
			std.setId(st.nextToken());
			std.setGrade(Double.parseDouble(st.nextToken()));
			
			System.out.println(std);
			
			// ArrayList�� ����
			dept.add(std);
			
//			System.out.println(std.getName());
//			System.out.println(std.getDepartment());
//			System.out.println(std.getId());
//			System.out.println(std.getGrade());
		}
	}
	
	private void printAll() { // �Ϻη� Iterator�� �ۼ��� ������
		
		System.out.println(dept.get(0));
		Iterator<Student> it = dept.iterator();
		while (it.hasNext()) {
			//�л� ���� ���
			Student stdInfo = it.next();
			System.out.println(stdInfo);
			System.out.println("==================");
		}
	}

	private void processQuery() {
		while(true) {
			System.out.print("�л� �̸� >> ");
			String name = scanner.nextLine(); // �л� �̸� �Է�
			if(name.equals("�׸�"))
				return; // ����
			
			for(int i=0; i<dept.size(); i++) { // dept�� �ִ� ��� �л� �˻�
				
				
				
			} // end of while
		}
	}
	
	public void run() {
		read();
		printAll();
		processQuery();
	}
	
	
}
