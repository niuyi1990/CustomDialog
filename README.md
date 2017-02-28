# CustomDialog
封装可以展示任意布局的自定义dialog，支持设置触摸是否消失和返回键是否消失
使用举例:

 

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
