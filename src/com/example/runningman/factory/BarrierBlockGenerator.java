package com.example.runningman.factory;

import java.util.ArrayList;
import java.util.Random;

import com.example.runningman.model.BarrierBlock;
import com.example.runningman.util.Constants;

/**
 * �ϰ����������������ϰ���ĳ��ȣ�����������λ�úͱ任��
 * @author ���۸�
 *
 */
public class BarrierBlockGenerator {
	
	Random random;
	
	public BarrierBlockGenerator(){
		random=new Random();
	}
	
	public ArrayList<BarrierBlock> createBarrierBlocks(){
		int type=random.nextInt(Constants.barrier_types);
		int len=random.nextInt(Constants.barrier_max_len)+1;
		ArrayList<BarrierBlock> blocks=new ArrayList<BarrierBlock>();
		for(int i=0; i<=len-1; i++)
			blocks.add(new BarrierBlock(type));
		return blocks;
	}

}
