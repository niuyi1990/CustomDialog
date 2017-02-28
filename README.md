# CustomDialog
封装可以展示任意布局的自定义dialog，支持设置触摸是否消失和返回键是否消失
使用举例:
  采用bulider模式
  
  CustomDialog.Builder builder = new CustomDialog.Builder(this);
        CustomDialog dialog = builder
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
