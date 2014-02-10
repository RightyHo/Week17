public class TaskStatus {
	private boolean[] taskComplete;

	public TaskStatus(){
		taskComplete = new boolean[10];
		for(int i=0;i<10;i++){
			taskComplete[i] = false;
		}
	}
	public void setTaskComplete(int index){
		taskComplete[index] = true;
		notifyAll();
	}
	public boolean getTaskComplete(int index){
		return taskComplete[index];
	}
}