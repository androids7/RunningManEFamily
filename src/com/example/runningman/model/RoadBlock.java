package com.example.runningman.model;

import com.example.runningman.util.BitmapLoader;

/**
 * ��·��
 * @author ����ΰ
 * @version 2.0
 *
 */
public class RoadBlock extends GameObj{

	public RoadBlock() {
		  initBitmap();
	}

	@Override
	protected void initBitmap() {
		// TODO Auto-generated method stub
		bitmap=BitmapLoader.b10;
		
		setObjWidth(bitmap.getWidth());
		setObjHeight(bitmap.getHeight());
	}

}
