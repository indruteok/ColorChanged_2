package lt.vtvpmc.ems.zp182.colorchangeer2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private Button buttonRed;
    private Button buttonGreen;
    private Button buttonBlue;
    private Button buttonYellow;
    private TextView vardasPavarde;
    private TextView textForGreenColor;
    private TextView textForBlueColor;
    private TextView textForYellowColor;
    private TextView textForRedColor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vardasPavarde = (TextView) findViewById(R.id.vardasPavarde);
        buttonRed = (Button) findViewById(R.id.buttonRed);
        buttonGreen = (Button) findViewById(R.id.buttonGreen);
        buttonBlue = (Button) findViewById(R.id.buttonBlue);
        buttonYellow = (Button) findViewById(R.id.buttonYellow);
        textForGreenColor = (TextView) findViewById(R.id.text_for_Green_color);
        textForBlueColor = (TextView) findViewById(R.id.text_for_Blue_color);
        textForRedColor = (TextView) findViewById(R.id. text_for_Red_color);
        textForYellowColor= (TextView) findViewById(R.id. text_for_Yellow_color);

        buttonRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.colorRedLayout).setBackgroundColor(getResources().getColor(R.color.colorRed));
                findViewById(R.id.colorBlueLayout).setBackgroundColor(getResources().getColor(R.color.colorWhite));
                findViewById(R.id.colorYellowLayout).setBackgroundColor(getResources().getColor(R.color.colorWhite));
                findViewById(R.id.colorGreenLayout).setBackgroundColor(getResources().getColor(R.color.colorWhite));
                textForRedColor.setText("Color Red");
                textForRedColor.setTextColor(getResources().getColor(R.color.colorWhite));
                textForGreenColor.setTextColor(getResources().getColor(R.color.colorWhite));
                textForYellowColor.setTextColor(getResources().getColor(R.color.colorWhite));
                textForBlueColor.setTextColor(getResources().getColor(R.color.colorWhite));
            }
        });

        buttonGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.colorGreenLayout).setBackgroundColor(getResources().getColor(R.color.colorGreen));
                findViewById(R.id.colorBlueLayout).setBackgroundColor(getResources().getColor(R.color.colorWhite));
                findViewById(R.id.colorYellowLayout).setBackgroundColor(getResources().getColor(R.color.colorWhite));
                findViewById(R.id.colorRedLayout).setBackgroundColor(getResources().getColor(R.color.colorWhite));
                textForGreenColor.setText("Color Green");
                textForGreenColor.setTextColor(getResources().getColor(R.color.colorBlack));
                textForYellowColor.setTextColor(getResources().getColor(R.color.colorWhite));
                textForBlueColor.setTextColor(getResources().getColor(R.color.colorWhite));
                textForRedColor.setTextColor(getResources().getColor(R.color.colorWhite));

            }
        });

        buttonBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.colorBlueLayout).setBackgroundColor(getResources().getColor(R.color.colorBlue));
                findViewById(R.id.colorRedLayout).setBackgroundColor(getResources().getColor(R.color.colorWhite));
                findViewById(R.id.colorYellowLayout).setBackgroundColor(getResources().getColor(R.color.colorWhite));
                findViewById(R.id.colorGreenLayout).setBackgroundColor(getResources().getColor(R.color.colorWhite));
                textForBlueColor.setText("Color Blue");
                textForBlueColor.setTextColor(getResources().getColor(R.color.colorWhite));
                textForGreenColor.setTextColor(getResources().getColor(R.color.colorWhite));
                textForYellowColor.setTextColor(getResources().getColor(R.color.colorWhite));
                textForRedColor.setTextColor(getResources().getColor(R.color.colorWhite));

            }
        });

        buttonYellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.colorYellowLayout).setBackgroundColor(getResources().getColor(R.color.colorYellow));
                findViewById(R.id.colorBlueLayout).setBackgroundColor(getResources().getColor(R.color.colorWhite));
                findViewById(R.id.colorRedLayout).setBackgroundColor(getResources().getColor(R.color.colorWhite));
                findViewById(R.id.colorGreenLayout).setBackgroundColor(getResources().getColor(R.color.colorWhite));
                textForYellowColor.setText("Color Yellow");
                textForYellowColor.setTextColor(getResources().getColor(R.color.colorBlack));
                textForGreenColor.setTextColor(getResources().getColor(R.color.colorWhite));
                textForBlueColor.setTextColor(getResources().getColor(R.color.colorWhite));
                textForRedColor.setTextColor(getResources().getColor(R.color.colorWhite));
            }
        });


    }
}

