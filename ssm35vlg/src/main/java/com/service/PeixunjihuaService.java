package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.PeixunjihuaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.PeixunjihuaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.PeixunjihuaView;


/**
 * 培训计划
 *
 * @author 
 * @email 
 * @date 2022-05-14 10:59:21
 */
public interface PeixunjihuaService extends IService<PeixunjihuaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<PeixunjihuaVO> selectListVO(Wrapper<PeixunjihuaEntity> wrapper);
   	
   	PeixunjihuaVO selectVO(@Param("ew") Wrapper<PeixunjihuaEntity> wrapper);
   	
   	List<PeixunjihuaView> selectListView(Wrapper<PeixunjihuaEntity> wrapper);
   	
   	PeixunjihuaView selectView(@Param("ew") Wrapper<PeixunjihuaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<PeixunjihuaEntity> wrapper);
   	

}

