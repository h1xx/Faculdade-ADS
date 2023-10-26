package aula20231025.aula.poo;

import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
	
	private static List<Task> records = new ArrayList<Task>();
	private static Integer nextCode = 1;
	
	public Task findByCode(final Integer code) {
		return records.stream().filter((current)-> 
		current.getCode().equals(code)).findFirst().orElse(null);
	}
	public List<Task>findAll(){
		return records;
	}
	
	public void insert (Task task) {
		task.setCode(nextCode++);
		records.add(task);
	}
	public void update (Task task) {
		records = records.stream().map((current)-> {
			return current.getCode().equals(task.getCode()) ? task: current;
		}).toList();
	}
	
	public void delete (Integer code) {
		records = records.stream().filter((current)->
			!current.getCode().equals(code)).toList();
	}
}
