package com.entity.view;

import com.entity.PeixunjihuaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 培训计划
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-05-14 10:59:21
 */
@TableName("peixunjihua")
public class PeixunjihuaView  extends PeixunjihuaEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public PeixunjihuaView(){
	}
 
 	public PeixunjihuaView(PeixunjihuaEntity peixunjihuaEntity){
 	try {
			BeanUtils.copyProperties(this, peixunjihuaEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
