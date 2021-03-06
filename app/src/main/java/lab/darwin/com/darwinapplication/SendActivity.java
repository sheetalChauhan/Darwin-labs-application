package lab.darwin.com.darwinapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class SendActivity extends AppCompatActivity implements View.OnClickListener {
@InjectView(R.id.back)
    Button back;
    @InjectView(R.id.button1)
    Button button1;
    @InjectView(R.id.button2)
    Button button2;
    @InjectView(R.id.button3)
    Button button3;
    @InjectView(R.id.button4)
    Button button4;
    @InjectView(R.id.button5)
    Button button5;
    @InjectView(R.id.button6)
    Button button6;
    @InjectView(R.id.button7)
    Button button7;
    @InjectView(R.id.button8)
    Button button8;
    @InjectView(R.id.button9)
    Button button9;
    @InjectView(R.id.point)
    Button point;
    @InjectView(R.id.zero)
    Button zero;
    @InjectView(R.id.cross)
    Button cross;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send);
        ButterKnife.inject(this);
        button1.setOnClickListener(SendActivity.this);
        button2.setOnClickListener(SendActivity.this);
        button3.setOnClickListener(SendActivity.this);
        button4.setOnClickListener(SendActivity.this);
        button5.setOnClickListener(SendActivity.this);
        button6.setOnClickListener(SendActivity.this);
        button7.setOnClickListener(SendActivity.this);
        button8.setOnClickListener(SendActivity.this);
        button9.setOnClickListener(SendActivity.this);
        zero.setOnClickListener(SendActivity.this);
        point.setOnClickListener(SendActivity.this);
        cross.setOnClickListener(SendActivity.this);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SendActivity.this,MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(intent);
                finish();
            }
        });
    }


    @Override
    public void onClick(View view) {
        switch(view.getId())
        {
            case R.id.button1:
                Button b1 = (Button)view;
                String buttonText1 = b1.getText().toString();

                Toast.makeText(getApplicationContext(),buttonText1,Toast.LENGTH_SHORT).show();
                break;

            case R.id.button2:
                // Code for button 2 click
                Button b2 = (Button)view;
                String buttonText2 = b2.getText().toString();

                Toast.makeText(getApplicationContext(),buttonText2,Toast.LENGTH_SHORT).show();
                break;

            case R.id.button3:
                // Code for button 3 click
                Button b3 = (Button)view;
                String buttonText3 = b3.getText().toString();

                Toast.makeText(getApplicationContext(),buttonText3,Toast.LENGTH_SHORT).show();
                break;
            case R.id.button4:
                // Code for button 3 click
                Button b4 = (Button)view;
                String buttonText4 = b4.getText().toString();

                Toast.makeText(getApplicationContext(),buttonText4,Toast.LENGTH_SHORT).show();

                break;
            case R.id.button5:
                // Code for button 3 click
                Button b5 = (Button)view;
                String buttonText5 = b5.getText().toString();

                Toast.makeText(getApplicationContext(),buttonText5,Toast.LENGTH_SHORT).show();

                break;
            case R.id.button6:
                // Code for button 3 click
                Button b6 = (Button)view;
                String buttonText6 = b6.getText().toString();

                Toast.makeText(getApplicationContext(),buttonText6,Toast.LENGTH_SHORT).show();

                break;
            case R.id.button7:
                // Code for button 3 click
                Button b7 = (Button)view;
                String buttonText7 = b7.getText().toString();

                Toast.makeText(getApplicationContext(),buttonText7,Toast.LENGTH_SHORT).show();

                break;
            case R.id.button8:
                // Code for button 3 click
                Button b8 = (Button)view;
                String buttonText8 = b8.getText().toString();

                Toast.makeText(getApplicationContext(),buttonText8,Toast.LENGTH_SHORT).show();

                break;
            case R.id.button9:
                // Code for button 3 click
                Button b9 = (Button)view;
                String buttonText9 = b9.getText().toString();

                Toast.makeText(getApplicationContext(),buttonText9,Toast.LENGTH_SHORT).show();

                break;
            case R.id.cross:
                // Code for button 3 click

                Toast.makeText(getApplicationContext(),"cross",Toast.LENGTH_SHORT).show();

                break;

            case R.id.zero:
                // Code for button 3 click
                Button zero1 = (Button)view;
                String buttonTextzero = zero1.getText().toString();

                Toast.makeText(getApplicationContext(),buttonTextzero,Toast.LENGTH_SHORT).show();

                break;

            case R.id.point:
                // Code for button 3 click
                Button point1 = (Button)view;
                String buttonTextpoint = point1.getText().toString();

                Toast.makeText(getApplicationContext(),buttonTextpoint,Toast.LENGTH_SHORT).show();

                break;

        }
    }
}
