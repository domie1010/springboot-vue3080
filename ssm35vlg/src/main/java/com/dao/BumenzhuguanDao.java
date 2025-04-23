package com.dao;

import com.entity.BumenzhuguanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BumenzhuguanVO;
import com.entity.view.BumenzhuguanView;


/**
 * 部门主管
 * 
 * @author 
 * @email 
 * @date 2022-05-14 10:59:21
 */
public interface BumenzhuguanDao extends BaseMapper<BumenzhuguanEntity> {
	
	List<BumenzhuguanVO> selectListVO(@Param("ew") Wrapper<BumenzhuguanEntity> wrapper);
	
	BumenzhuguanVO selectVO(@Param("ew") Wrapper<BumenzhuguanEntity> wrapper);
	
	List<BumenzhuguanView> selectListView(@Param("ew") Wrapper<BumenzhuguanEntity> wrapper);

	List<BumenzhuguanView> selectListView(Pagination page,@Param("ew") Wrapper<BumenzhuguanEntity> wrapper);
	
	BumenzhuguanView selectView(@Param("ew") Wrapper<BumenzhuguanEntity> wrapper);
	

}
