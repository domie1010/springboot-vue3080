package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.PeixunhuodongEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.PeixunhuodongVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.PeixunhuodongView;


/**
 * 培训活动
 *
 * @author 
 * @email 
 * @date 2022-05-14 10:59:21
 */
public interface PeixunhuodongService extends IService<PeixunhuodongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<PeixunhuodongVO> selectListVO(Wrapper<PeixunhuodongEntity> wrapper);
   	
   	PeixunhuodongVO selectVO(@Param("ew") Wrapper<PeixunhuodongEntity> wrapper);
   	
   	List<PeixunhuodongView> selectListView(Wrapper<PeixunhuodongEntity> wrapper);
   	
   	PeixunhuodongView selectView(@Param("ew") Wrapper<PeixunhuodongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<PeixunhuodongEntity> wrapper);
   	

}

