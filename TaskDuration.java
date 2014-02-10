public class TaskDuration implements Runnable {
	private TaskStatus status;
	private int taskNumber;
	private int duration;

	public TaskDuration(TaskStatus status,int taskNumber){
		this.status = status;
		this.taskNumber = taskNumber;
	}
	public static void main(String[] args){
		TaskStatus ts = new TaskStatus();
		for(int i=0;i<10;i++){
			TaskDuration tdTask = new TaskDuration(ts,i);
			Thread t = new Thread(tdTask);
			t.start();
		}
	}
	public void run(){
		try{
			System.out.println("enter the duration (in ms) of task " + this.taskNumber + ": ");
			int aux = Integer.parseInt(System.console().readLine());
			this.duration = (long) aux;
			Thread.sleep(duration);
			status.setTaskComplete(this.taskNumber);

		} catch (InterruptedException ex){
			//add code here
		}
	}
	//read the three code examples he gave us...and check out producer consumer examples online
}