package Part2;

public class GradeList { // GradeNode ��ü�� ���Ḯ��Ʈ�� ������ Ŭ����

	GradeNode head; // ���Ḯ��Ʈ�� ù ���
	
	public GradeList() // �⺻ �����ڴ� head ��带 null�� �ʱ�ȭ
	{ 
		head = null;
	}
	
	public GradeList(GradeList gradeList) // ���ڷ� ���� gradeList ���Ḯ��Ʈ�� �����ϴ� Copy Constructor ������
	{
		
		if (gradeList == null) // ���ڷ� ���� ���Ḯ��Ʈ�� �������� ���� ���
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
		
		/* ���ڷ� ���� gradeList ���Ḯ��Ʈ�� ���� (�� ����� �������� ���� ����, ���� ���� X) */
		
	}
	
	public void addNode(Assignment assignment, Answer answer, String score) // ���ڷ� ���� ���� �� ��ü��� ������ ��带 ���Ḯ��Ʈ�� �߰��ϴ� �޼ҵ�
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
	
	public void printList() // ���Ḯ��Ʈ ��� �޼ҵ�
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
