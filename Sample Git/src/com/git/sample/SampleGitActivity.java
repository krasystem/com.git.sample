package com.git.sample;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class SampleGitActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Button launch=(Button)findViewById(R.id.button1);
        launch.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				Toast.makeText(SampleGitActivity.this, "Sample GIT Repo", 0).show();
			}
		});
        
    }
}