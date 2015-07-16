package com.example.runningman.model;

import android.graphics.Bitmap;

/**
 * @author ����ΰ
 * @version 1.0
 */
	
public abstract class GameObj {
	protected int currentFrame;
	protected int x;
	protected int y;
	protected int objWidth;
	protected int objHeight;
	protected boolean isAlive;
	protected Bitmap bitmap;
	
	public GameObj(){}
	
	/**
	 * ��ʼ��ͼƬ��Դ
	 */
	protected abstract void initBitmap();
	
    /**
     * ������߼�����
     */
	public void logic(){}

	/**
	 * ��ȡ����ĺ�����
	 * @return ����ĺ�����ֵ
	 */
	public int getX() {
		return x;
	}
	
	/**
	 * ���ö���ĺ�����
	 * @param x ������ֵ
	 */
	public void setX(int x) {
		this.x = x;
	}
	
	/**
	 * ��ȡ�����������
	 * @return �����������ֵ
	 */
	public int getY() {
		return y;
	}
	
	/**
	 * ���ö����������
	 * @param y �����������ֵ
	 */
	public void setY(int y) {
		this.y = y;
	}
	public int getObjWidth() {
		return objWidth;
	}
	public void setObjWidth(int objWidth) {
		this.objWidth = objWidth;
	}
	public int getObjHeight() {
		return objHeight;
	}
	public void setObjHeight(int objHeight) {
		this.objHeight = objHeight;
	}
	public boolean isAlive() {
		return isAlive;
	}
	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}
	
	public int getCurrentFrame(){
		return currentFrame;
	}
	
	public void setCurrentFrame(int currentFrame){
	    this.currentFrame=currentFrame;
	}		
	
	/**
	 * ��ȡ�����Bitmap
	 * @return �����Bitmap
	 */
	public Bitmap getBitmap(){
		return bitmap;
	}
	
}
