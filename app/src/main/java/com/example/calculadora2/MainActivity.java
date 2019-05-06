package com.example.calculadora2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.OperationCanceledException;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
     public TextView display;
     public double n1, n2, res;
     String operador;
     int operacion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        display=(TextView)findViewById(R.id.txt_ope);
    }
    public void bt0 (View view)
    {
       String cap=display.getText().toString();
       cap = cap+"0";
       display.setText(cap);

    }
    public void bt1 (View view)
    {
        String cap=display.getText().toString();
        cap = cap+"1";
        display.setText(cap);

    }
    public void bt2 (View view)
    {
        String cap=display.getText().toString();
        cap = cap+"2";
        display.setText(cap);

    }
    public void bt3 (View view)
    {
        String cap=display.getText().toString();
        cap = cap+"3";
        display.setText(cap);

    }
    public void bt4 (View view)
    {
        String cap=display.getText().toString();
        cap = cap+"4";
        display.setText(cap);

    }
    public void bt5 (View view)
    {
        String cap=display.getText().toString();
        cap = cap+"5";
        display.setText(cap);

    }  public void bt6 (View view)
    {
        String cap=display.getText().toString();
        cap = cap+"6";
        display.setText(cap);

    }  public void bt7 (View view)
    {
        String cap=display.getText().toString();
        cap = cap+"7";
        display.setText(cap);

    }  public void bt8 (View view)
    {
        String cap=display.getText().toString();
        cap = cap+"8";
        display.setText(cap);

    }
    public void bt9 (View view)
    {
        String cap=display.getText().toString();
        cap = cap+"9";
        display.setText(cap);

    }
    public void btcoma (View view)
    {
        String cap=display.getText().toString();
        cap = cap+",";
        display.setText(cap);

    }

 public void suma (View view)
 {
     try {
         String signo=display.getText().toString();
         n1 = Double.parseDouble(signo);
     }catch (NumberFormatException nfe){}
     display.setText("");
     operacion=1;
 }
    public void resta (View view) {
        try {
            String signo = display.getText().toString();
            n1 = Double.parseDouble(signo);
        } catch (NumberFormatException nfe) {
        }
        display.setText("");
        operacion = 2;
    }
    public void multi (View view) {
        try {
            String signo = display.getText().toString();
            n1 = Double.parseDouble(signo);
        } catch (NumberFormatException nfe) {
        }
        display.setText("");
        operacion = 3;
    }
    public void divi (View view) {
        try {
            String signo = display.getText().toString();
            n1 = Double.parseDouble(signo);
        } catch (NumberFormatException nfe) {
        }
        display.setText("");
        operacion = 4;
    }
    public void cuadrado (View view) {
        try {
            String signo = display.getText().toString();
            n1 = Double.parseDouble(signo);
        } catch (NumberFormatException nfe) {
        }
        display.setText("");
        operacion = 5;
    }
    public void raiz (View view) {
        try {
            String signo = display.getText().toString();
            n1 = Double.parseDouble(signo);
        } catch (NumberFormatException nfe) {
        }
        display.setText("√("+n1+")");
        operacion = 6;
    }
    public void porcentaje (View view) {
        try {
            String signo = display.getText().toString();
            n1 = Double.parseDouble(signo);
        } catch (NumberFormatException nfe) {
        }
        display.setText("");
        operacion = 7;
    }
    public void igual (View view) {
        try {
            String signo2 = display.getText().toString();
            n2 = Double.parseDouble(signo2);
        } catch (NumberFormatException nfe) {
        }
        display.setText("");
        if(operacion==1)
        {
            res = n1+n2;
        }else if(operacion==2)
        {
            res = n1-n2;
        }else
        if (operacion==3)
        {
            res = n1*n2;
        }
        else
        if (operacion==4)
           if(n2==0)
           {
           display.setText("Error");
           }else
        {
            res = n1/n2;
        }
        else
        if (operacion==5)
        {
            res = n1*n1;
        }
        else
        if (operacion==6)
        {
            res=Math.sqrt(n1);
        }
        else
        if (operacion==7)
        {
            res = n2*(n1/100.0);
        }
        display.setText(""+res);
        n1=res;
    }
     public void borrar (View view)
     {
     display.setText("");
     n1=0.0;
     n2=0.0;
     res=0.0;

     }
    public void borrarultnumero (View view) {
        if (!display.getText().toString().equals("")) {
            display.setText(display.getText().subSequence(0, display.getText().length() - 1) + "");
        }
    }
    public void salir (View view)
    {
        finish();
    }




}
