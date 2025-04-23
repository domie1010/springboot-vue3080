package com.entity.view;

import com.entity.BumenzhuguanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 部门主管
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-05-14 10:59:21
 */
@TableName("bumenzhuguan")
public class BumenzhuguanView  extends BumenzhuguanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public BumenzhuguanView(){
	}
 
 	public BumenzhuguanView(BumenzhuguanEntity bumenzhuguanEntity){
 	try {
			BeanUtils.copyProperties(this, bumenzhuguanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
