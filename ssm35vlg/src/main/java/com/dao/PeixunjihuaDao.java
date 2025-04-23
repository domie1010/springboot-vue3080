package com.dao;

import com.entity.PeixunjihuaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.PeixunjihuaVO;
import com.entity.view.PeixunjihuaView;


/**
 * 培训计划
 * 
 * @author 
 * @email 
 * @date 2022-05-14 10:59:21
 */
public interface PeixunjihuaDao extends BaseMapper<PeixunjihuaEntity> {
	
	List<PeixunjihuaVO> selectListVO(@Param("ew") Wrapper<PeixunjihuaEntity> wrapper);
	
	PeixunjihuaVO selectVO(@Param("ew") Wrapper<PeixunjihuaEntity> wrapper);
	
	List<PeixunjihuaView> selectListView(@Param("ew") Wrapper<PeixunjihuaEntity> wrapper);

	List<PeixunjihuaView> selectListView(Pagination page,@Param("ew") Wrapper<PeixunjihuaEntity> wrapper);
	
	PeixunjihuaView selectView(@Param("ew") Wrapper<PeixunjihuaEntity> wrapper);
	

}
