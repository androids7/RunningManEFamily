package com.example.runningman.util;

import com.example.runningman.R;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

/**
 * ͼƬ��������
 * ���ฺ��һ���Լ�������ͼƬ���ڴ棬
 * �ӿ���Ϸ�ٶȡ�<br>
 * ʹ���˼�����֮���������಻��Ҫ����bitmap��
 * ��Ϸ��������Loader���л��ա�
 * @author ��½��
 *
 */
public class BitmapLoader {
	
	public Context context;
    public static Bitmap b1, b2, b3, b4, b5;  //�ϰ���
    public static Bitmap b6, b7, b8, b9; //����
    public static Bitmap b22, b23, b24, b25; //��ҳº�
    public static Bitmap b26, b27, b28, b29; //���Baby
    public static Bitmap b30, b31, b32, b33; //��ҵ˳�
    public static Bitmap b34, b35, b36, b37; //���֣��
    public static Bitmap b38, b39, b40, b41; //���������
    public static Bitmap b42, b43, b44, b45; //�������ǿ
    public static Bitmap b10; //·��
    public static Bitmap b11; //С�Ͳ��Ͷ����ʵ
    public static Bitmap b13; //���Ͳ��Ͷ����ʵ
    public static Bitmap b15; //���Ͳ��Ͷ����ʵ
    public static Bitmap b17; //����ҩˮ
    public static Bitmap b19, b20; //������
    public static Bitmap b21; //͸��֡
    
  //  public static int scale;
    
    public BitmapLoader(Context context){
    	this.context=context;
   // 	scale =(int)context.getResources().getDisplayMetrics().density; 
    }
    
	/**
	 * һ�μ�������ͼƬ��Դ��<br>
	 * ʹ��ʱ����ֱ�Ӵ��ڴ��ȡ��<br>
	 * �ӿ���Ϸ�����ٶ�
	 */
	public void loadBitmaps(){
		b1=BitmapFactory.decodeResource(context.getResources(), R.drawable.box1);
		b2=BitmapFactory.decodeResource(context.getResources(), R.drawable.box2);
		b3=BitmapFactory.decodeResource(context.getResources(), R.drawable.box3);
		b4=BitmapFactory.decodeResource(context.getResources(), R.drawable.box4);
		b5=BitmapFactory.decodeResource(context.getResources(), R.drawable.box5);
		
		b6=BitmapFactory.decodeResource(context.getResources(), R.drawable.lc_r0);
		b7=BitmapFactory.decodeResource(context.getResources(), R.drawable.lc_r1);
		b8=BitmapFactory.decodeResource(context.getResources(), R.drawable.lc_r2);
		b9=BitmapFactory.decodeResource(context.getResources(), R.drawable.lc_r3);
		
		b10=BitmapFactory.decodeResource(context.getResources(), R.drawable.ground);
		
		b11=BitmapFactory.decodeResource(context.getResources(), R.drawable.radish);
		
		b13=BitmapFactory.decodeResource(context.getResources(), R.drawable.apple);
		
		b15=BitmapFactory.decodeResource(context.getResources(), R.drawable.grape);
		
		b17=BitmapFactory.decodeResource(context.getResources(), R.drawable.wine);
		
		b19=BitmapFactory.decodeResource(context.getResources(), R.drawable.fly);
		b20=BitmapFactory.decodeResource(context.getResources(), R.drawable.fly2);
		
		b21=BitmapFactory.decodeResource(context.getResources(), R.drawable.r5);
		
		b22=BitmapFactory.decodeResource(context.getResources(), R.drawable.chh_r0);
		b23=BitmapFactory.decodeResource(context.getResources(), R.drawable.chh_r1);
		b24=BitmapFactory.decodeResource(context.getResources(), R.drawable.chh_r2);
		b25=BitmapFactory.decodeResource(context.getResources(), R.drawable.chh_r3);
		
		b26=BitmapFactory.decodeResource(context.getResources(), R.drawable.bb_r0);
		b27=BitmapFactory.decodeResource(context.getResources(), R.drawable.bb_r1);
		b28=BitmapFactory.decodeResource(context.getResources(), R.drawable.bb_r2);
		b29=BitmapFactory.decodeResource(context.getResources(), R.drawable.bb_r3);
		
		b30=BitmapFactory.decodeResource(context.getResources(), R.drawable.dc_r0);
		b31=BitmapFactory.decodeResource(context.getResources(), R.drawable.dc_r1);
    	b32=BitmapFactory.decodeResource(context.getResources(), R.drawable.dc_r2);
		b33=BitmapFactory.decodeResource(context.getResources(), R.drawable.dc_r3);
		
		b34=BitmapFactory.decodeResource(context.getResources(), R.drawable.zk_r0);
		b35=BitmapFactory.decodeResource(context.getResources(), R.drawable.zk_r1);
		b36=BitmapFactory.decodeResource(context.getResources(), R.drawable.zk_r2);
		b37=BitmapFactory.decodeResource(context.getResources(), R.drawable.zk_r3);

		b38=BitmapFactory.decodeResource(context.getResources(), R.drawable.wzl_r0);
		b39=BitmapFactory.decodeResource(context.getResources(), R.drawable.wzl_r1);
		b40=BitmapFactory.decodeResource(context.getResources(), R.drawable.wzl_r2);
		b41=BitmapFactory.decodeResource(context.getResources(), R.drawable.wzl_r3);

		b42=BitmapFactory.decodeResource(context.getResources(), R.drawable.wbq_r0);
		b43=BitmapFactory.decodeResource(context.getResources(), R.drawable.wbq_r1);
		b44=BitmapFactory.decodeResource(context.getResources(), R.drawable.wbq_r2);
		b45=BitmapFactory.decodeResource(context.getResources(), R.drawable.wbq_r3);

	}

}
