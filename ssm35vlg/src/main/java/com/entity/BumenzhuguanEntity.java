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
 * 部门主管
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-05-14 10:59:21
 */
@TableName("bumenzhuguan")
public class BumenzhuguanEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public BumenzhuguanEntity() {
		
	}
	
	public BumenzhuguanEntity(T t) {
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
	 * 主管账号
	 */
					
	private String zhuguanzhanghao;
	
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
