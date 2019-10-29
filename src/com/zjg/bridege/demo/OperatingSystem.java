package com.zjg.bridege.demo;

/**
 * 
 * @author apple
 * 
 * 操作系统
 *
 */
public abstract class OperatingSystem {
	// 图片格式类
	private IPictureFormat pictureFormat;
	
	public OperatingSystem(IPictureFormat pictureFormat) {
		super();
		this.pictureFormat = pictureFormat;
	}
	
	/**
	 * 显示操作系统
	 */
	protected void operatingSystemtype() {
		this.pictureFormat.imageFormat();
	}
	
}
