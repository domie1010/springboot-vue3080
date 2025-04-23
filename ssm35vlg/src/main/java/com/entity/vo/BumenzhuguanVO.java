package com.entity.vo;

import com.entity.BumenzhuguanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 部门主管
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-05-14 10:59:21
 */
public class BumenzhuguanVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 密码
	 */
	
	private String mima;
		
	/**
	 * 主管姓名
	 */
	
	private String zhuguanxingming;
		
	/**
	 * 部门
	 */
	
	private String bumen;
		
	/**
	 * 主管性别
	 */
	
	private String zhuguanxingbie;
		
	/**
	 * 主管手机
	 */
	
	private String zhuguanshouji;
				
	
	/**
	 * 设置：密码
	 */
	 
	public void setMima(String mima) {
		this.mima = mima;
	}
	
	/**
	 * 获取：密码
	 */
	public String getMima() {
		return mima;
	}
				
	
	/**
	 * 设置：主管姓名
	 */
	 
	public void setZhuguanxingming(String zhuguanxingming) {
		this.zhuguanxingming = zhuguanxingming;
	}
	
	/**
	 * 获取：主管姓名
	 */
	public String getZhuguanxingming() {
		return zhuguanxingming;
	}
				
	
	/**
	 * 设置：部门
	 */
	 
	public void setBumen(String bumen) {
		this.bumen = bumen;
	}
	
	/**
	 * 获取：部门
	 */
	public String getBumen() {
		return bumen;
	}
				
	
	/**
	 * 设置：主管性别
	 */
	 
	public void setZhuguanxingbie(String zhuguanxingbie) {
		this.zhuguanxingbie = zhuguanxingbie;
	}
	
	/**
	 * 获取：主管性别
	 */
	public String getZhuguanxingbie() {
		return zhuguanxingbie;
	}
				
	
	/**
	 * 设置：主管手机
	 */
	 
	public void setZhuguanshouji(String zhuguanshouji) {
		this.zhuguanshouji = zhuguanshouji;
	}
	
	/**
	 * 获取：主管手机
	 */
	public String getZhuguanshouji() {
		return zhuguanshouji;
	}
			
}
