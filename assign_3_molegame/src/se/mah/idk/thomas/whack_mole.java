package se.mah.idk.thomas;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

public class whack_mole extends Activity implements OnClickListener{
    /** Called when the activity is first created. */
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        Mole testmole = (Mole) findViewById(R.id.button1);
        testmole.setOnClickListener(this);
    }

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Mole testmole = (Mole) findViewById(R.id.button1);
		testmole.setImage();
	}
}