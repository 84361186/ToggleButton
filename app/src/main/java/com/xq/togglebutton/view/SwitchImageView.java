package com.xq.togglebutton.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

import com.xq.togglebutton.R;

public class SwitchImageView extends ImageView {
	private boolean switchStatue = true;//默认开关打开

	public SwitchImageView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
	}

	public SwitchImageView(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	public SwitchImageView(Context context) {
		super(context);
	}

	/**
	 * 获取开关状态
	 * @return 开关状态
     */
	public boolean getSwitchStatue() {
		return switchStatue;
	}

	/**
	 * 设置开关状态
	 * @param switchStatue true开 false关
     */
	public void setSwitchStatue(boolean switchStatue) {
		this.switchStatue = switchStatue;
		if(switchStatue){
			setBackgroundResource(R.drawable.toggle_on);
		}else{
			setBackgroundResource(R.drawable.toggle_off);
		}
	}

	/**
	 * 改变状态
	 */
	public void changeSwitchStatue(){
		setSwitchStatue(!switchStatue);
	}
	
	

}
