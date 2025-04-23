package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 培训课程
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-05-14 10:59:21
 */
@TableName("peixunkecheng")
public class PeixunkechengEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public PeixunkechengEntity() {
		
	}
	
	public PeixunkechengEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 培训课程
	 */
					
	private String peixunkecheng;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：培训课程
	 */
	public void setPeixunkecheng(String peixunkecheng) {
		this.peixunkecheng = peixunkecheng;
	}
	/**
	 * 获取：培训课程
	 */
	public String getPeixunkecheng() {
		return peixunkecheng;
	}
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
