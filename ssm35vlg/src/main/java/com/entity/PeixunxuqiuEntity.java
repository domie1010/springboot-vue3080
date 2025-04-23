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
 * 培训需求
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-05-14 10:59:21
 */
@TableName("peixunxuqiu")
public class PeixunxuqiuEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public PeixunxuqiuEntity() {
		
	}
	
	public PeixunxuqiuEntity(T t) {
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
