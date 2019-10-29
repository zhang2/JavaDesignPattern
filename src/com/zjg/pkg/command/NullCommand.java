package com.zjg.pkg.command;

public class NullCommand implements Command {

	/**
	 * 没有任何命令， 省掉对空的判断
	 *  
	 */
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		
	}

	
}
