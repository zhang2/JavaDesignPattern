/**
 * 
 */
package com.zjg.builderPattern;

/**
 * @author apple
 *
 */
public class Actor {
	// 角色类型
	private String type;
	// 角色性别
	private String sex;
	// 角色发饰
	private String hairStyle;
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * @return the sex
	 */
	public String getSex() {
		return sex;
	}
	/**
	 * @param sex the sex to set
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}
	/**
	 * @return the hairStyle
	 */
	public String getHairStyle() {
		return hairStyle;
	}
	/**
	 * @param hairStyle the hairStyle to set
	 */
	public void setHairStyle(String hairStyle) {
		this.hairStyle = hairStyle;
	}
	
	public Actor() {
		
	}
	@Override
	public String toString() {
		return "Actor 的属性 [type=" + type + ", sex=" + sex + ", hairStyle=" + hairStyle + "]";
	}
	
	
}
