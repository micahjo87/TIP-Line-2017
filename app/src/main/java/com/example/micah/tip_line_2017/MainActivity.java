package com.example.micah.tip_line_2017;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button textTipButton;
    private Button tipCallButton;
    private Button voiceButton;
    private Button photoButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textTipButton = (Button) findViewById(R.id.buttonTipText);
        textTipButton.setOnClickListener(this);
        voiceButton = (Button) findViewById(R.id.buttonTipVoice);
        voiceButton.setOnClickListener(this);
        photoButton = (Button) findViewById(R.id.buttonTipCamera);
        photoButton.setOnClickListener(this);
        tipCallButton = (Button) findViewById(R.id.buttonTipCall);
        tipCallButton.setOnClickListener(this);
    }

    @Override
    //tip options if clicked execute
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.buttonTipText:
                Intent textTipPage = new Intent(MainActivity.this, TextTip.class);
                this.startActivity(textTipPage);
                break;

            case R.id.buttonTipCall:
                Intent myIntent = new Intent(MainActivity.this, TipCall.class);
                this.startActivity(myIntent);
                break;

            case R.id.buttonTipVoice:
                Intent audioIntent = new Intent(MainActivity.this, AudioTip.class);
                this.startActivity(audioIntent);
                break;

            case R.id.buttonTipCamera:
                Intent cameraIntent = new Intent(MainActivity.this, CameraTip.class);
                this.startActivity(cameraIntent);
                break;

            default:
                break;
        }
    }
}
