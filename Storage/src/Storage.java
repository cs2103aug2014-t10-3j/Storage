
public class Storage {
	public static int numberOfTasks= 0;
	
	 HashMap<int ,Task> allTasks = new HashMap<int,Task> ();
	 	
	public void addTask(Task taskFromLogic){
		 
	 allTasks.put(numberOfTasks, taskFromLogic);
		numberOfTasks++;
		
					
	}
	public int deleteTask(Task){
		for(int i = 0 ; i < allTasks.size() ; i++){
		  if( allTasks.get(i) is same as task given by Logic){
		  		allTasks.remove(i);
		 		return 1;
		  	}
		  }
		  
		  		return 0;   //means no such task found
		 
	}
	
	public int updateTask(Task taskA,Task taskB){
	//Overwrite taskA with taskB
	  for(int i = 0 ; i < allTasks.size() ; i++){
	  if( allTasks.get(i) is same as task given by taskA){
	  		allTasks.put(i,taskB);
	  		return 1;
	  	}
	  	return 0 ; // no such task found to update
	  }
	  
	
	}
	public ArrayList<String> searchTask(String keyWords{
		
	ArrayList<Task> searchedTasks = new ArrayList<Task>;
	  
	  for (int i = 0; i < allTasks.size() ; i++){
	  		if(allTasks.get(i).getDiscription.contains(keyWord)){
	   		searchedTasks.add(allTasks.get(i));
	   }
	   }
	   
	   return searchedTasks;
	 
	}
	
	public ArrayList<Task> getTasks(){
		// need to figure out how to sort them. 
		 ArrayList<Task> allTaskArrayList<Task>;
		  
		  for(int i = 0; i < allTasks.size() ; i++){
		   allTaskArrayList.add(allTasks.get(i));
		   
		   }
		   
		   return allTaskArrayList;
		 
	}
	
	sort();
}
