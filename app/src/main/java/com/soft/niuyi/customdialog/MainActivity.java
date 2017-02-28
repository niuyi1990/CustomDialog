package com.soft.niuyi.customdialog;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_show).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog();
            }
        });
    }

    CustomDialog dialog;

    private void showDialog() {
        CustomDialog.Builder builder = new CustomDialog.Builder(this);
        dialog = builder
                .style(R.style.Dialog)
                .heightDimenRes(R.dimen.dialog_height)
                .widthDimenRes(R.dimen.dialog_width)
                .cancelBackPress(false)
                .cancelTouchout(true)
                .view(R.layout.dialog_layout)
                .addViewOnclick(R.id.btn_cancel, listener)
                .addViewOnclick(R.id.btn_confirm, listener)
                .build();

        dialog.show();
    }

    View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.btn_cancel:
                    Toast.makeText(MainActivity.this, "取消按钮", Toast.LENGTH_SHORT).show();
                    dialog.dismiss();
                case R.id.btn_confirm:
                    Toast.makeText(MainActivity.this, "确定按钮", Toast.LENGTH_SHORT).show();
                    dialog.dismiss();
            }
        }
    };
}
