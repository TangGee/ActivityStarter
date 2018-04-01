package com.tlinux.fuck;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

/**
 * Created by tlinux on 18-3-31.
 */

public class StartController  implements View.OnClickListener{

    private Activity context;
    private CheckBox newTask;
    private CheckBox newDoc;
    private CheckBox muiltTask;
    private CheckBox cleanTop;
    private CheckBox cleanTask;
    private CheckBox singleTop;
    private CheckBox startForResult;
    private Button ba;
    private Button bb;
    private Button bc;
    private Button bd;
    private Button be;
    private Button bf;
    private Button b1;
    private Button b2;
    private Button b3;
    private Button setResult;

    public StartController(View view,Activity context){
        this.context = context;
        newTask = view.findViewById(R.id.new_task);
        newDoc = view.findViewById(R.id.new_doc);
        muiltTask = view.findViewById(R.id.mult_task);
        cleanTask = view.findViewById(R.id.clean_task);
        cleanTop = view.findViewById(R.id.clean_top);
        singleTop = view.findViewById(R.id.single_top);
        startForResult = view.findViewById(R.id.start_forResult);


        ba = view.findViewById(R.id.button_a);
        bb = view.findViewById(R.id.button_b);
        bc = view.findViewById(R.id.button_c);
        bd = view.findViewById(R.id.button_d);
        be = view.findViewById(R.id.button_e);
        bf = view.findViewById(R.id.button_f);
        b1 = view.findViewById(R.id.button_1);
        b2 = view.findViewById(R.id.button_2);
        b3 = view.findViewById(R.id.button_3);
        setResult = view.findViewById(R.id.setResult);

        ba.setOnClickListener(this);
        bb.setOnClickListener(this);
        bc.setOnClickListener(this);
        bd.setOnClickListener(this);
        be.setOnClickListener(this);
        bf.setOnClickListener(this);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent();
        if (newDoc.isChecked()){
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_DOCUMENT);
        }
        if (newTask.isChecked()){
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        }
        if (muiltTask.isChecked()){
            intent.addFlags(Intent.FLAG_ACTIVITY_MULTIPLE_TASK);
        }
        if (cleanTask.isChecked()){
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        }
        if (cleanTop.isChecked()){
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        }

        if (singleTop.isChecked()){
            intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
        }

        switch (v.getId()){
            case R.id.button_a:
                intent.setClass(context,MainActivity.class);
                break;
            case R.id.button_b:
                intent.setClass(context,SecondActivity.class);
                break;
            case R.id.button_c:
                intent.setClass(context,ThridActivity.class);
                break;
            case R.id.button_d:
                intent.setClass(context,FourthActivity.class);
                break;
            case R.id.button_e:
                intent.setClass(context,FiveActivity.class);
                break;
            case R.id.button_f:
                intent.setClass(context,ThridActivity.class);
                break;
            case R.id.button_1:
                intent.setComponent(new ComponentName("com.tlinux.myapplication","com.tlinux.myapplication.MainActivity"));
                break;
            case R.id.button_2:
                intent.setComponent(new ComponentName("com.tlinux.myapplication","com.tlinux.myapplication.SecondActivity"));
                break;
            case R.id.button_3:
                intent.setComponent(new ComponentName("com.tlinux.myapplication","com.tlinux.myapplication.ThridActivity"));
                break;
            case R.id.setResult:
                context.setResult(1000);
                break;
        }
        if (startForResult.isChecked()){
            context.startActivityForResult(intent,10086);
        } else {
            context.startActivity(intent);
        }
    }
}
