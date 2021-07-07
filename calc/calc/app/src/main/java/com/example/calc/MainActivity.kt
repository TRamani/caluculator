package com.example.calculator

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.example.calc.R


class MainActivity :AppCompatActivity() {
        EditText et1,et2;
        Button add,sub,mul,div;
        textview tv;
        override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_main)
            et1=findViewById<>(R.id.et1);
             et2=findViewById(R.id.et2);
             add=findViewById(R.id.add);
             sub=findViewById(R.id.sub);
             mul=findViewById(R.id.mul);
             div=findViewById(R.id.div);
             tv=findViewById(R.id.tv);
             add.setonclicklistner(new view.onclicklistener(){
                     @override
                     public void onclick(view view) {
                             int f, s, a;
                             f = Integer.parseInt(et1.getText().tostring());
                             s = Integer.parseInt(et2.getText().tostring());
                             a = f + s;
                             tv.setText("Result" = +a);

                     }
             }
                     sub.setonclicklistner(new view.onclicklistener()
             {
                     @override
                     public void onclick(view view)
                     {
                             int f, s, a;
                             f = Integer.parseInt(et1.getText().tostring());
                             s = Integer.parseInt(et2.getText().tostring());
                             a = f - s;
                             tv.setText("Result" = a);
                     }
             }
                     mul.setonclicklistner(new view.onclicklistener()
             {
                     @override
                     public void onclick(view view)
                     {
                             int f, s, a;
                             f = Integer.parseInt(et1.getText().tostring());
                             s = Integer.parseInt(et2.getText().tostring());
                             a = f * s;
                             tv.setText("Result" = a);
                     }
             }
                     div.setonclicklistner(new view.onclicklistener()
             {
                     @override
                     public void onclick(view view)
                     {
                             int f, s, a;
                             f = Integer.parseInt(et1.getText().tostring());
                             s = Integer.parseInt(et2.getText().tostring());
                             a = f / s;
                             tv.setText("Result" = a);


                     }
             }




        }
}

