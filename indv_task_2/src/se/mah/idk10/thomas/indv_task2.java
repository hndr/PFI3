package se.mah.idk10.thomas;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class indv_task2 extends Activity implements OnClickListener {
    private static final OnClickListener OnClickListener = null;
    
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        // Set Click Listener on the Toast Button

        Button submit = (Button) findViewById(R.id.button1);
        submit.setOnClickListener(this);
        
 }
    
    	@Override
		public void onClick(View view) {

    	// the toast button

        if (view == findViewById(R.id.button1)) {
        	EditText editText = (EditText) findViewById(R.id.editText2);
        	EditText editText2 = (EditText) findViewById(R.id.editText1);

        	String message = editText.getText().toString();
        	String tag = editText2.getText().toString();
           
        	// display Toast Pop-up Message
             Toast.makeText(this, tag + " - " + message, Toast.LENGTH_SHORT).show();
             editText.setText("");
             editText2.setText(""); 
             
        }
    }
}