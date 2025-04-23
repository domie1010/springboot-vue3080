package com.entity.model;

import com.entity.PeixunxuqiuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 培训需求
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-05-14 10:59:21
 */
public class PeixunxuqiuModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 员工姓名
	 */
	
	private String yuangongxingming;
		
	/**
	 * 部门
	 */
	
	private String bumen;
		
	/**
	 * 员工手机
	 */
	
	private String yuangongshouji;
		
	/**
	 * 需求原因
	 */
	
	private String xuqiuyuanyin;
		
	/**
	 * 需求内容
	 */
	
	private String xuqiuneirong;
		
	/**
	 * 时间要求
	 */
	
	private String shijianyaoqiu;
		
	/**
	 * 主管账号
	 */
	
	private String zhuguanzhanghao;
		
	/**
	 * 主管姓名
	 */
	
	private String zhuguanxingming;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
				
	
	/**
	 * 设置：员工姓名
	 */
	 
	public void setYuangongxingming(String yuangongxingming) {
		this.yuangongxingming = yuangongxingming;
	}
	
	/**
	 * 获取：员工姓名
	 */
	public String getYuangongxingming() {
		return yuangongxingming;
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
	 * 设置：员工手机
	 */
	 
	public void setYuangongshouji(String yuangongshouji) {
		this.yuangongshouji = yuangongshouji;
	}
	
	/**
	 * 获取：员工手机
	 */
	public String getYuangongshouji() {
		return yuangongshouji;
	}
				
	
	/**
	 * 设置：需求原因
	 */
	 
	public void setXuqiuyuanyin(String xuqiuyuanyin) {
		this.xuqiuyuanyin = xuqiuyuanyin;
	}
	
	/**
	 * 获取：需求原因
	 */
	public String getXuqiuyuanyin() {
		return xuqiuyuanyin;
	}
				
	
	/**
	 * 设置：需求内容
	 */
	 
	public void setXuqiuneirong(String xuqiuneirong) {
		this.xuqiuneirong = xuqiuneirong;
	}
	
	/**
	 * 获取：需求内容
	 */
	public String getXuqiuneirong() {
		return xuqiuneirong;
	}
				
	
	/**
	 * 设置：时间要求
	 */
	 
	public void setShijianyaoqiu(String shijianyaoqiu) {
		this.shijianyaoqiu = shijianyaoqiu;
	}
	
	/**
	 * 获取：时间要求
	 */
	public String getShijianyaoqiu() {
		return shijianyaoqiu;
	}
				
	
	/**
	 * 设置：主管账号
	 */
	 
	public void setZhuguanzhanghao(String zhuguanzhanghao) {
		this.zhuguanzhanghao = zhuguanzhanghao;
	}
	
	/**
	 * 获取：主管账号
	 */
	public String getZhuguanzhanghao() {
		return zhuguanzhanghao;
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
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
			
}
