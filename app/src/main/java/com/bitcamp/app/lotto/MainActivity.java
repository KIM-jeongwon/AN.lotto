package com.bitcamp.app.lotto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView num = findViewById(R.id.number);

        findViewById(R.id.create_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               int lotto[] = new int[6];
                String result="";
            for(int i=0; i<lotto.length; i++){
                lotto[i]=(int)(Math.random()*44)+1;
                for(int j=0; j<i; j++){
                    if(lotto[i]==(lotto[j])){
                        i--;
                    }
                  }

               }
                Arrays.sort(lotto);
                for(int a =0; a<6; a++){
                    result +=lotto[a]+" ";
                }
                num.setText(result);
            }
        });
    }
}
