package Part2;

public class GradeList { // GradeNode 객체로 연결리스트를 생성할 클래스

	GradeNode head; // 연결리스트의 첫 노드
	
	public GradeList() // 기본 생성자는 head 노드를 null로 초기화
	{ 
		head = null;
	}
	
	public GradeList(GradeList gradeList) // 인자로 받은 gradeList 연결리스트를 복사하는 Copy Constructor 생성자
	{
		
		if (gradeList == null) // 인자로 받은 연결리스트가 존재하지 않을 경우
		{ 
			System.out.println("Nothing to copy");
			return;
		}
		
		if (head == null)
			head = gradeList.head;
		
		GradeNode temp = head;
		while(temp.nextNode != null) {
			temp = temp.nextNode;
			temp = new GradeNode(gradeList.head.nextNode.assignment, gradeList.head.nextNode.answer, gradeList.head.nextNode.getScore());
		}
		
		/* 인자로 받은 gradeList 연결리스트를 복사 (각 노드의 변수들을 전부 복사, 참조 복사 X) */
		
	}
	
	public void addNode(Assignment assignment, Answer answer, String score) // 인자로 받은 변수 및 객체들로 생성한 노드를 연결리스트에 추가하는 메소드
	{ 
		if(head == null)
			head = new GradeNode(assignment, answer, score);
		
		else {
			GradeNode temp = head;
			while(temp.nextNode != null) {
				temp = temp.nextNode;
			}
			
			temp.nextNode = new GradeNode(assignment, answer, score);
		}
	}
	
	public void printList() // 연결리스트 출력 메소드
	{ 
		GradeNode temp = head;
		while(temp != null) {
			System.out.println(temp.assignment);
			System.out.println(temp.answer);
			System.out.println("Grade: " + temp.getScore());
			temp = temp.nextNode;
		}
		System.out.println();
	}
	
}
