import java.util.*;

public class StudentManager {
	private Scanner scanner = new Scanner(System.in);
	private ArrayList<Student> dept = new ArrayList<Student>();
	
	private void read() {
		System.out.println("�л� �̸�,�а�,�й�,������� �Է��ϼ���.");
		for (int i=0; i<4; i++) {
			System.out.print(">> ");
			String text = scanner.nextLine();
			StringTokenizer st = new StringTokenizer(text, ",");
			
			
			// ArrayList�� ����
		}			
	}
	
	private void printAll() { // �Ϻη� Iterator�� �ۼ��� ������
		Iterator<Student> it = dept.iterator();
		while (it.hasNext()) {
			
			//�л� ���� ���
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
