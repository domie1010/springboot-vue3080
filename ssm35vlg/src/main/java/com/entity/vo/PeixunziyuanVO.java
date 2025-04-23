package com.entity.vo;

import com.entity.PeixunziyuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 培训资源
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-05-14 10:59:21
 */
public class PeixunziyuanVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 培训教师
	 */
	
	private String peixunjiaoshi;
		
	/**
	 * 培训机构
	 */
	
	private String peixunjigou;
		
	/**
	 * 培训资料
	 */
	
	private String peixunziliao;
		
	/**
	 * 培训设施
	 */
	
	private String peixunsheshi;
				
	
	/**
	 * 设置：培训教师
	 */
	 
	public void setPeixunjiaoshi(String peixunjiaoshi) {
		this.peixunjiaoshi = peixunjiaoshi;
	}
	
	/**
	 * 获取：培训教师
	 */
	public String getPeixunjiaoshi() {
		return peixunjiaoshi;
	}
				
	
	/**
	 * 设置：培训机构
	 */
	 
	public void setPeixunjigou(String peixunjigou) {
		this.peixunjigou = peixunjigou;
	}
	
	/**
	 * 获取：培训机构
	 */
	public String getPeixunjigou() {
		return peixunjigou;
	}
				
	
	/**
	 * 设置：培训资料
	 */
	 
	public void setPeixunziliao(String peixunziliao) {
		this.peixunziliao = peixunziliao;
	}
	
	/**
	 * 获取：培训资料
	 */
	public String getPeixunziliao() {
		return peixunziliao;
	}
				
	
	/**
	 * 设置：培训设施
	 */
	 
	public void setPeixunsheshi(String peixunsheshi) {
		this.peixunsheshi = peixunsheshi;
	}
	
	/**
	 * 获取：培训设施
	 */
	public String getPeixunsheshi() {
		return peixunsheshi;
	}
			
}
