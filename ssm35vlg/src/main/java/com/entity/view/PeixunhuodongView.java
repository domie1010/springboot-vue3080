package com.entity.view;

import com.entity.PeixunhuodongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 培训活动
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-05-14 10:59:21
 */
@TableName("peixunhuodong")
public class PeixunhuodongView  extends PeixunhuodongEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public PeixunhuodongView(){
	}
 
 	public PeixunhuodongView(PeixunhuodongEntity peixunhuodongEntity){
 	try {
			BeanUtils.copyProperties(this, peixunhuodongEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
