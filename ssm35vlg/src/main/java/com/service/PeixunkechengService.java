package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.PeixunkechengEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.PeixunkechengVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.PeixunkechengView;


/**
 * 培训课程
 *
 * @author 
 * @email 
 * @date 2022-05-14 10:59:21
 */
public interface PeixunkechengService extends IService<PeixunkechengEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<PeixunkechengVO> selectListVO(Wrapper<PeixunkechengEntity> wrapper);
   	
   	PeixunkechengVO selectVO(@Param("ew") Wrapper<PeixunkechengEntity> wrapper);
   	
   	List<PeixunkechengView> selectListView(Wrapper<PeixunkechengEntity> wrapper);
   	
   	PeixunkechengView selectView(@Param("ew") Wrapper<PeixunkechengEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<PeixunkechengEntity> wrapper);
   	

}

