package ming.com.viewpagerindicator;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private CircleIndicatorView mView;
int mPos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button) findViewById(R.id.btn);
        btn.setOnClickListener(this);
        mView = (CircleIndicatorView) findViewById(R.id.ttt);
        mView.setOnClickListener(this);
       mView.setRadius(30);
       mView.setGap(20);
       mView.setCount(5);
    }

    @Override
    public void onClick(View v) {
        Log.i("###","onClick v = " + v);
        if(v.getId() == R.id.ttt){

        } else if(v.getId() == R.id.btn) {
            if(mPos < 5){
                mView.setSelectedIndex(mPos);
            }
            mPos++;
        }
    }
}
