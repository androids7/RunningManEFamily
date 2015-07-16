package com.example.runningman.factory;

import com.example.runningman.model.Player;
import com.example.runningman.util.RunnerType;

/**
 * �����������������ң������������
 * @author ���۸�
 *@version 1.0
 */
public class PlayerGenerator {
	
	 private RunnerType rt;
     
	 public PlayerGenerator( RunnerType rt){
		 this.rt=rt;
	 }
	 
	 public Player createPlayer(){
		 return new Player(rt);
	 }
}
