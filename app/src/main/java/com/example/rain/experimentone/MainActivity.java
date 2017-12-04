package com.example.rain.experimentone;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText mTextClass, mTextGrade, mTextId, mTextName;
    private TextView tvmsg;
    private String msg="学生列表\n";
    private String sex="男";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        InitView();
    }

    private void InitView() {
        mTextClass = (EditText) findViewById(R.id.editxt_class);
        mTextGrade = (EditText) findViewById(R.id.editxt_grade);
        mTextId = (EditText) findViewById(R.id.editxt_id);
        mTextName=(EditText)findViewById(R.id.editxt_name);
        tvmsg=(TextView)findViewById(R.id.studentView);
    }

    public void OnAddClick(View view) {
        String name = mTextName.getText().toString();
        String id = mTextId.getText().toString();
        String classes = mTextClass.getText().toString();
        String grade = mTextGrade.getText().toString();

        msg+="学号:"+id+" 姓名:"+name+" 性别:"+sex+" 班级:"+classes+" 年级:"+grade+"\n";

        tvmsg.setText(msg);

        Toast.makeText(this,"添加成功",Toast.LENGTH_SHORT);

        NomalDialog();
     }

    public void rgclick(View view) {
        if(view.getId()==R.id.rbtWoman)
            sex="女";
    }

    private void NomalDialog() {
        //普通对话框
        AlertDialog dialog;                           //声明对象
        dialog = new AlertDialog.Builder(this)        //绑定当前界面窗口
                .setTitle("提示")             //设置标题
                .setMessage("学生信息添加成功！")         //设置提示信息
                .setIcon(R.mipmap.ic_launcher)       //设置图标
                .setPositiveButton("确定",null )     //添加“确定”按钮
                .setNegativeButton("取消", null)     //添加“取消”按钮
                .create();                          //创建对话框
        dialog.show();                              //显示对话框
    }
}
