package com.xq.togglebutton;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;

import com.xq.togglebutton.util.ToastUtil;
import com.xq.togglebutton.view.SwitchImageView;

public class MainActivity extends AppCompatActivity {
    private SwitchImageView togglebutton;
    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        togglebutton = (SwitchImageView) findViewById(R.id.togglebutton);
        spinner = (Spinner) findViewById(R.id.spinner);

        togglebutton.setSwitchStatue(false);//初始设置关状态
        togglebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                togglebutton.changeSwitchStatue();
                ToastUtil.showShortToast(getApplicationContext(),togglebutton.getSwitchStatue()?"on":"off");
            }
        });
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String[] data = getResources().getStringArray(R.array.data);
                ToastUtil.showShortToast(getApplicationContext(),data[position]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
    }
}
