package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.PeixunxuqiuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.PeixunxuqiuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.PeixunxuqiuView;


/**
 * 培训需求
 *
 * @author 
 * @email 
 * @date 2022-05-14 10:59:21
 */
public interface PeixunxuqiuService extends IService<PeixunxuqiuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<PeixunxuqiuVO> selectListVO(Wrapper<PeixunxuqiuEntity> wrapper);
   	
   	PeixunxuqiuVO selectVO(@Param("ew") Wrapper<PeixunxuqiuEntity> wrapper);
   	
   	List<PeixunxuqiuView> selectListView(Wrapper<PeixunxuqiuEntity> wrapper);
   	
   	PeixunxuqiuView selectView(@Param("ew") Wrapper<PeixunxuqiuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<PeixunxuqiuEntity> wrapper);
   	

}

