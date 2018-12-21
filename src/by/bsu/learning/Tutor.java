package by.bsu.learning;

import java.util.List;

public class Tutor extends Thread{
	private Integer idTutor;
	private List<Student> list;
	public Tutor() {
		this.list = list;
	}
	public Integer getIdTutor() {
		return idTutor;
	}
	
	public void setIdTutor(Integer id) {
		this.idTutor = id;
	}
	
	public void run() {
		for (Student st: list) {
			//проверить выданы ли студенту задания
			List<Task> tasks = st.getTaskList();
			
		}
		
	}
}
