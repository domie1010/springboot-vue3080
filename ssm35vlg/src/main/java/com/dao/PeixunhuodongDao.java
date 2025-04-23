package com.dao;

import com.entity.PeixunhuodongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.PeixunhuodongVO;
import com.entity.view.PeixunhuodongView;


/**
 * 培训活动
 * 
 * @author 
 * @email 
 * @date 2022-05-14 10:59:21
 */
public interface PeixunhuodongDao extends BaseMapper<PeixunhuodongEntity> {
	
	List<PeixunhuodongVO> selectListVO(@Param("ew") Wrapper<PeixunhuodongEntity> wrapper);
	
	PeixunhuodongVO selectVO(@Param("ew") Wrapper<PeixunhuodongEntity> wrapper);
	
	List<PeixunhuodongView> selectListView(@Param("ew") Wrapper<PeixunhuodongEntity> wrapper);

	List<PeixunhuodongView> selectListView(Pagination page,@Param("ew") Wrapper<PeixunhuodongEntity> wrapper);
	
	PeixunhuodongView selectView(@Param("ew") Wrapper<PeixunhuodongEntity> wrapper);
	

}
