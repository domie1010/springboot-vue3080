package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.BumenzhuguanDao;
import com.entity.BumenzhuguanEntity;
import com.service.BumenzhuguanService;
import com.entity.vo.BumenzhuguanVO;
import com.entity.view.BumenzhuguanView;

@Service("bumenzhuguanService")
public class BumenzhuguanServiceImpl extends ServiceImpl<BumenzhuguanDao, BumenzhuguanEntity> implements BumenzhuguanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BumenzhuguanEntity> page = this.selectPage(
                new Query<BumenzhuguanEntity>(params).getPage(),
                new EntityWrapper<BumenzhuguanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BumenzhuguanEntity> wrapper) {
		  Page<BumenzhuguanView> page =new Query<BumenzhuguanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BumenzhuguanVO> selectListVO(Wrapper<BumenzhuguanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BumenzhuguanVO selectVO(Wrapper<BumenzhuguanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BumenzhuguanView> selectListView(Wrapper<BumenzhuguanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BumenzhuguanView selectView(Wrapper<BumenzhuguanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
