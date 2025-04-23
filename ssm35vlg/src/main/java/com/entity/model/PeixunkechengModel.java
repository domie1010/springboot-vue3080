package com.entity.model;

import com.entity.PeixunkechengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 培训课程
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-05-14 10:59:21
 */
public class PeixunkechengModel  implements Serializable {
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
	 * 课程地点
	 */
	
	private String kechengdidian;
		
	/**
	 * 课程时间
	 */
	
	private String kechengshijian;
		
	/**
	 * 学时
	 */
	
	private String xueshi;
		
	/**
	 * 活动名称
	 */
	
	private String huodongmingcheng;
		
	/**
	 * 员工工号
	 */
	
	private String yuangonggonghao;
		
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
	 * 主管账号
	 */
	
	private String zhuguanzhanghao;
		
	/**
	 * 主管姓名
	 */
	
	private String zhuguanxingming;
				
	
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
	 * 设置：课程地点
	 */
	 
	public void setKechengdidian(String kechengdidian) {
		this.kechengdidian = kechengdidian;
	}
	
	/**
	 * 获取：课程地点
	 */
	public String getKechengdidian() {
		return kechengdidian;
	}
				
	
	/**
	 * 设置：课程时间
	 */
	 
	public void setKechengshijian(String kechengshijian) {
		this.kechengshijian = kechengshijian;
	}
	
	/**
	 * 获取：课程时间
	 */
	public String getKechengshijian() {
		return kechengshijian;
	}
				
	
	/**
	 * 设置：学时
	 */
	 
	public void setXueshi(String xueshi) {
		this.xueshi = xueshi;
	}
	
	/**
	 * 获取：学时
	 */
	public String getXueshi() {
		return xueshi;
	}
				
	
	/**
	 * 设置：活动名称
	 */
	 
	public void setHuodongmingcheng(String huodongmingcheng) {
		this.huodongmingcheng = huodongmingcheng;
	}
	
	/**
	 * 获取：活动名称
	 */
	public String getHuodongmingcheng() {
		return huodongmingcheng;
	}
				
	
	/**
	 * 设置：员工工号
	 */
	 
	public void setYuangonggonghao(String yuangonggonghao) {
		this.yuangonggonghao = yuangonggonghao;
	}
	
	/**
	 * 获取：员工工号
	 */
	public String getYuangonggonghao() {
		return yuangonggonghao;
	}
				
	
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
			
}
