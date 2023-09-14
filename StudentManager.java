import java.util.*;

public class StudentManager {
	private Scanner scanner = new Scanner(System.in);
	private ArrayList<Student> dept = new ArrayList<Student>();
	Student std = new Student();
	private void read() {
		System.out.println("학생 이름,학과,학번,학점평균 입력하세요.");
		for (int i=0; i<4; i++) {
			System.out.print(">> ");
			String text = scanner.nextLine();
			StringTokenizer st = new StringTokenizer(text, ",");
			
			std.setName(st.nextToken());
			std.setDepartment(st.nextToken());
			std.setId(st.nextToken());
			std.setGrade(Double.parseDouble(st.nextToken()));
			
			System.out.println(std);
			
			// ArrayList에 저장
			dept.add(std);
			
//			System.out.println(std.getName());
//			System.out.println(std.getDepartment());
//			System.out.println(std.getId());
//			System.out.println(std.getGrade());
		}
	}
	
	private void printAll() { // 일부러 Iterator로 작성해 보았음
		
		System.out.println(dept.get(0));
		Iterator<Student> it = dept.iterator();
		while (it.hasNext()) {
			//학생 정보 출력
			Student stdInfo = it.next();
			System.out.println(stdInfo);
			System.out.println("==================");
		}
	}

	private void processQuery() {
		while(true) {
			System.out.print("학생 이름 >> ");
			String name = scanner.nextLine(); // 학생 이름 입력
			if(name.equals("그만"))
				return; // 종료
			
			for(int i=0; i<dept.size(); i++) { // dept에 있는 모든 학생 검색
				
				
				
			} // end of while
		}
	}
	
	public void run() {
		read();
		printAll();
		processQuery();
	}
	
	
}
