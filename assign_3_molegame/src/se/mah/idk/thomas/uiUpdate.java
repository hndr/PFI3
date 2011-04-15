package se.mah.idk.thomas;

import android.os.Handler;
import android.util.Log;

public class uiUpdate extends Thread{
	private Handler _ui;
	private boolean _running =true;
	
	public void stopCountDown (){
		_running = false;
	} 
	public uiUpdate(Handler ui){
		_ui = ui; 
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		
		while (_running){
			try {
					Log.i("k3", "Thread Running");
					_ui.sendEmptyMessage(NORM_PRIORITY);
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					Log.i("k3", e.getMessage());
				}
		}
		
	}
	
	

}
