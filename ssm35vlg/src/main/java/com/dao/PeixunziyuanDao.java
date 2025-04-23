package com.dao;

import com.entity.PeixunziyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.PeixunziyuanVO;
import com.entity.view.PeixunziyuanView;


/**
 * 培训资源
 * 
 * @author 
 * @email 
 * @date 2022-05-14 10:59:21
 */
public interface PeixunziyuanDao extends BaseMapper<PeixunziyuanEntity> {
	
	List<PeixunziyuanVO> selectListVO(@Param("ew") Wrapper<PeixunziyuanEntity> wrapper);
	
	PeixunziyuanVO selectVO(@Param("ew") Wrapper<PeixunziyuanEntity> wrapper);
	
	List<PeixunziyuanView> selectListView(@Param("ew") Wrapper<PeixunziyuanEntity> wrapper);

	List<PeixunziyuanView> selectListView(Pagination page,@Param("ew") Wrapper<PeixunziyuanEntity> wrapper);
	
	PeixunziyuanView selectView(@Param("ew") Wrapper<PeixunziyuanEntity> wrapper);
	

}
