package by.bsu.conn;

public class ResourceAction {
	public void doAction() {
		SameResource sr = null;
		try {
			//���������� ������ ��������
			sr = new SameResource();
			sr.execute();
			sr.close();
		}finally{
			if(sr != null) {
				sr.close();
			}
		}
		System.out.println("after finaly");
	}
}
