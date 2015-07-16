package com.example.runningman.model;

import java.util.ArrayList;

import android.graphics.Bitmap;

import com.example.runningman.util.BitmapLoader;
import com.example.runningman.util.Constants;

/**
 * ������
 * @author ����ΰ
 * @version 1.0
 *
 */
public class Food extends GameObj {
	
	private int type;
	private ArrayList<Bitmap> bitmaps;
	private int rotate;
	private boolean up;

	public Food() {
		// TODO Auto-generated constructor stub
		this(0);
	}
	
	public Food(int type){
		this.type=type;
		bitmaps=new ArrayList<Bitmap>();
		rotate=0;
		up=true;
		initBitmap();
	}

	@Override
	protected void initBitmap() {
		// TODO Auto-generated method stub
		switch(type){
		case 0:  
	//		bitmaps.add(BitmapLoader.b11);
	//		bitmaps.add(BitmapLoader.b12);
			bitmap=BitmapLoader.b11; break;        //С�Ͳ��Ͷ����ʵ������+50
		case 1:  
	//		bitmaps.add(BitmapLoader.b13);
	//		bitmaps.add(BitmapLoader.b14);
			bitmap=BitmapLoader.b13; break;         //���Ͳ��Ͷ����ʵ������+100
		case 2:
	//		bitmaps.add(BitmapLoader.b15);
	//		bitmaps.add(BitmapLoader.b16);
			bitmap=BitmapLoader.b15; break;         //���Ͳ��Ͷ����ʵ������+200
		case 3:
	//		bitmaps.add(BitmapLoader.b17);
	//		bitmaps.add(BitmapLoader.b18);
			bitmap=BitmapLoader.b17; break;         //����ҩˮ�����Դ�Խ�ϰ����ʱ��
		case 4:
			bitmaps.add(BitmapLoader.b19);
			bitmaps.add(BitmapLoader.b19);
			bitmaps.add(BitmapLoader.b20);
			bitmaps.add(BitmapLoader.b20);            //������֡һ������Ϊ���û��ܿ�����������ת��Ч��
			bitmap=BitmapLoader.b19; break;         //�����ѣ����������Ϸɣ���ʱ��
		}
		
		setObjWidth(bitmap.getWidth());
		setObjHeight(bitmap.getHeight());
	}
	
	public int getType(){
		return type;
	}
	
	public int getRotate(){
		int tmp=rotate;
		if(up&&rotate<45){
			rotate+=Constants.rotateSpeed;
		}
		else if(up&&rotate==45){
			up=false;
		}
		else if(!up&&rotate>-45){
			rotate-=Constants.rotateSpeed;
		}
		else if(!up&&rotate==-45){
			up=true;
		}
		return tmp;
	}
	
	public ArrayList<Bitmap> getBitmaps(){
		return bitmaps;
	}
}
