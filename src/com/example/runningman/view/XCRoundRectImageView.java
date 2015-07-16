package com.example.runningman.view;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Paint.Style;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;

public class XCRoundRectImageView extends ImageView{

    private Paint paint;
    private int bc=Color.rgb(0, 0, 0);
    
    public XCRoundRectImageView(Context context) {  
        this(context,null);  
    }  
  
    public XCRoundRectImageView(Context context, AttributeSet attrs) {  
        this(context, attrs,0);  
    }  
  
    public XCRoundRectImageView(Context context, AttributeSet attrs, int defStyle) {  
        super(context, attrs, defStyle); 
        paint  = new Paint();
    }  

    @Override  
    protected void onDraw(Canvas canvas) {  
  
        Drawable drawable = getDrawable();  //����imageView���������ʾͼƬ�Ŀؼ����ͼƬ�����ص���Drawable����
        if (null != drawable) {  
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();  
            Bitmap b = getRoundBitmap(bitmap, 20);  
            final Rect rectSrc = new Rect(0, 0, b.getWidth(), b.getHeight());  
            final Rect rectDest = new Rect(0,0,getWidth(),getHeight());
            paint.reset();  
            canvas.drawBitmap(b, rectSrc, rectDest, paint);  
  
        } else {  
            super.onDraw(canvas);  
        }
        
        //���һ���߿�
        Paint paint=new Paint();
		paint.setColor(bc);
		paint.setAntiAlias(true); //�����
		paint.setDither(true); //ʹͼ���ƽ������
		paint.setStyle(Style.STROKE);  //���
		if(bc==Color.RED)
		  paint.setStrokeWidth(3);
		Path path=new Path();
		path.addRoundRect(new RectF(0, 0, getWidth()-1, getHeight()-1), 10,10,Path.Direction.CW);
		
		canvas.drawPath(path, paint);
    }
    
    public void setBorderColor(int color){
    	this.bc=color;
    	invalidate(); //��֮ǰ�ľɵ�view����UI�̶߳�����pop��
    }
  
    /**
     * ��ȡԲ�Ǿ���ͼƬ����
     * @param bitmap
     * @param roundPx,һ�����ó�14
     * @return Bitmap
     */
    private Bitmap getRoundBitmap(Bitmap bitmap, int roundPx) {  
        Bitmap output = Bitmap.createBitmap(bitmap.getWidth(),  
                bitmap.getHeight(), Config.ARGB_8888);  
        Canvas canvas = new Canvas(output); 
          
        final int color = 0xff424242;
       
        final Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());  
        final RectF rectF = new RectF(rect);
        paint.setAntiAlias(true);  
        canvas.drawARGB(0, 0, 0, 0);
        paint.setColor(color);  
        canvas.drawRoundRect(rectF, roundPx, roundPx, paint);
        paint.setXfermode(new PorterDuffXfermode(Mode.SRC_IN));  
        canvas.drawBitmap(bitmap, rect, rect, paint);  
        return output;  
        
            }  
}  
