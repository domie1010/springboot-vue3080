package com.entity.view;

import com.entity.PeixunkechengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 培训课程
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-05-14 10:59:21
 */
@TableName("peixunkecheng")
public class PeixunkechengView  extends PeixunkechengEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public PeixunkechengView(){
	}
 
 	public PeixunkechengView(PeixunkechengEntity peixunkechengEntity){
 	try {
			BeanUtils.copyProperties(this, peixunkechengEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
