import java.util.ArrayList;


public class Storage2 {
	public class Storage {
	
		private static ArrayList<Task> allTasks = new ArrayList<Task>();
		 	
		public void addTask(Task taskFromLogic){
			 
		allTasks.add(taskFromLogic);	
						
		}
		public int deleteTask(Task taskFromLogic){
			for(int i = 0 ; i < allTasks.size() ; i++){
			  if( allTasks.get(i).toString().equals(taskFromLogic.toString())){  // how to check 2 tasks are equal? should have a toString() in Task to check?
			  		allTasks.remove(i);
			 		return 1;
			  	}
			  }
			  
			  		return 0;   //means no such task found
			 
		}
		
		public int updateTask(Task taskA,Task taskB){
		//Overwrite taskA with taskB
		  for(int i = 0 ; i < allTasks.size() ; i++){
		  if( allTasks.get(i).toString().equals(taskA.toString() )){		//check with toString()
		  		allTasks.set(i,taskB);
		  		return 1;
		  	}
		  	return 0 ; // no such task found to update
		  }
		  
		
		}
		public ArrayList<String> searchTask(String keyWords){
			
		ArrayList<Task> searchedTasks = new ArrayList<Task>;
		  
		  for (int i = 0; i < allTasks.size() ; i++){
		  		if(allTasks.get(i).getDiscription.contains(keyWord)){
		   		searchedTasks.add(allTasks.get(i));
		   }
		   }
		   
		   return searchedTasks;
		 
		}
		
		public ArrayList<Task> getTasks(){
			// need to figure out how to sort them
			// maybe can have the default display as Sort by Importance display.	
			   	 return allTasks;
			 
		}
		
		public void sortByImportance(){
			boolean swapped = true;
		      int j = 0;
		      int tmp;
		      while (swapped) {
		            swapped = false;
		            j++;
		            for (int i = 0; i < allTasks.size()- j; i++) {                                       
		                  if (allTasks.get(i).getImportance() < allTasks.get(i + 1).getImportance()) {                          
		                        tmp = allTasks.get(i);
		                        allTasks.set(i,allTasks.get(i+1));
		                        allTasks.set(i+1, tmp);
		                        swapped = true;
		                  }
		            }                
		      }
		}
		
		public void sortByTime(){
			
		}
		
		
	}

}
