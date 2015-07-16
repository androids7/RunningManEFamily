package com.example.runningman.view;

import com.example.runningman.R;
import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * ��Ϸ�����󵯳��Ľ���Ի���
 * @author ��
 *
 */
public class GameOverDialog extends Dialog {
	private String content = "������";
			
	public GameOverDialog(Context context, int theme) {
		super(context, theme);
		this.setGameOverDialog();
	}

	public GameOverDialog(Context context) {
		super(context);
		this.setGameOverDialog();
	}
	
	private void setGameOverDialog() {
		View mView = LayoutInflater.from(getContext()).inflate(R.layout.game_over_layout, null);
		
		TextView tv = (TextView) this.findViewById(R.id.content);
		if(tv != null)
		tv.setText(content);
		super.setContentView(mView);
	}
	
	public void setScore(int score) {
		TextView tv = (TextView) this.findViewById(R.id.content);
		if(tv != null)
		tv.setText(content + score);
	}
	
	public void setReturnListener(android.view.View.OnClickListener onClickListener) {
		Button Return = (Button) this.findViewById(R.id.tomainmenu);
		if(Return != null)
		Return.setOnClickListener(onClickListener);
	}
	
	public void setReGameListener(android.view.View.OnClickListener onClickListener) {
		Button ReGame = (Button) this.findViewById(R.id.regame);
		if(ReGame != null)
		ReGame.setOnClickListener(onClickListener);
	}
}
