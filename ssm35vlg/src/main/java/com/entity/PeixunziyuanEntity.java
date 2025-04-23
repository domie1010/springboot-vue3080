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
 * 培训资源
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-05-14 10:59:21
 */
@TableName("peixunziyuan")
public class PeixunziyuanEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public PeixunziyuanEntity() {
		
	}
	
	public PeixunziyuanEntity(T t) {
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
	 * 培训资料
	 */
					
	private String peixunziliao;
	
	/**
	 * 培训设施
	 */
					
	private String peixunsheshi;
	
	
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
