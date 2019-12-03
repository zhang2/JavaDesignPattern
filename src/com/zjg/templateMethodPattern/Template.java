/**
 * 
 */
package com.zjg.templateMethodPattern;

/**
 * @author apple
 *
 */
abstract public class Template {

	abstract public void  defineName();
	
	abstract public void defineInfo();
	
	abstract public void defineExperience();
	
	abstract public void defineRecommendLetter();
	
	// 是否用推荐信 ,钩子方法
	protected boolean isUseDefineRecommendLetter(){
        return false ;
    }
	
	public void TemplateMethod() {
		defineName();
		defineInfo();
		defineExperience();
		if(isUseDefineRecommendLetter()) {
			defineRecommendLetter();
		}
	}
}
