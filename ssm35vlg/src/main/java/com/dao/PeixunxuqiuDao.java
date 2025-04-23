package com.dao;

import com.entity.PeixunxuqiuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.PeixunxuqiuVO;
import com.entity.view.PeixunxuqiuView;


/**
 * 培训需求
 * 
 * @author 
 * @email 
 * @date 2022-05-14 10:59:21
 */
public interface PeixunxuqiuDao extends BaseMapper<PeixunxuqiuEntity> {
	
	List<PeixunxuqiuVO> selectListVO(@Param("ew") Wrapper<PeixunxuqiuEntity> wrapper);
	
	PeixunxuqiuVO selectVO(@Param("ew") Wrapper<PeixunxuqiuEntity> wrapper);
	
	List<PeixunxuqiuView> selectListView(@Param("ew") Wrapper<PeixunxuqiuEntity> wrapper);

	List<PeixunxuqiuView> selectListView(Pagination page,@Param("ew") Wrapper<PeixunxuqiuEntity> wrapper);
	
	PeixunxuqiuView selectView(@Param("ew") Wrapper<PeixunxuqiuEntity> wrapper);
	

}
