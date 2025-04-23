package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.PeixunziyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.PeixunziyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.PeixunziyuanView;


/**
 * 培训资源
 *
 * @author 
 * @email 
 * @date 2022-05-14 10:59:21
 */
public interface PeixunziyuanService extends IService<PeixunziyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<PeixunziyuanVO> selectListVO(Wrapper<PeixunziyuanEntity> wrapper);
   	
   	PeixunziyuanVO selectVO(@Param("ew") Wrapper<PeixunziyuanEntity> wrapper);
   	
   	List<PeixunziyuanView> selectListView(Wrapper<PeixunziyuanEntity> wrapper);
   	
   	PeixunziyuanView selectView(@Param("ew") Wrapper<PeixunziyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<PeixunziyuanEntity> wrapper);
   	

}

