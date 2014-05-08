/**
 * @(#)Lab2_5CTB.java
 *
 *
 * @author 
 * @version 1.00 2013/11/12
 */

import java.util.*;

public class Lab2_5CTB {

    public static void main(String[] args){
    	Random random = new Random();
    	int fn,sn;
    	
    	fn = random.nextInt(6)+1;
    	sn = random.nextInt(6)+1;
    	
    	GetInfo.showMessage("1:\nThe first die you rolled was " + fn + "\n The second die you rolled was " + sn + "\n The sum of the two dice that were rolled is " + (fn+sn));
    	fn = random.nextInt(6)+1;
    	sn = random.nextInt(6)+1;
    	
    	GetInfo.showMessage("2:\nThe first die you rolled was " + fn + "\n The second die you rolled was " + sn + "\n The sum of the two dice that were rolled is " + (fn+sn));
    	fn = random.nextInt(6)+1;
    	sn = random.nextInt(6)+1;
    	
    	GetInfo.showMessage("3:\nThe first die you rolled was " + fn + "\n The second die you rolled was " + sn + "\n The sum of the two dice that were rolled is " + (fn+sn));
    	fn = random.nextInt(6)+1;
    	sn = random.nextInt(6)+1;
    	
    	GetInfo.showMessage("4:\nThe first die you rolled was " + fn + "\n The second die you rolled was " + sn + "\n The sum of the two dice that were rolled is " + (fn+sn));
    	fn = random.nextInt(6)+1;
    	sn = random.nextInt(6)+1;
    	
    	GetInfo.showMessage("5:\nThe first die you rolled was " + fn + "\n The second die you rolled was " + sn + "\n The sum of the two dice that were rolled is " + (fn+sn));
    	fn = random.nextInt(6)+1;
    	sn = random.nextInt(6)+1;
    	
    	GetInfo.showMessage("6:\nThe first die you rolled was " + fn + "\n The second die you rolled was " + sn + "\n The sum of the two dice that were rolled is " + (fn+sn));
    }
    
    
}