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


import com.dao.PeixunhuodongDao;
import com.entity.PeixunhuodongEntity;
import com.service.PeixunhuodongService;
import com.entity.vo.PeixunhuodongVO;
import com.entity.view.PeixunhuodongView;

@Service("peixunhuodongService")
public class PeixunhuodongServiceImpl extends ServiceImpl<PeixunhuodongDao, PeixunhuodongEntity> implements PeixunhuodongService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<PeixunhuodongEntity> page = this.selectPage(
                new Query<PeixunhuodongEntity>(params).getPage(),
                new EntityWrapper<PeixunhuodongEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<PeixunhuodongEntity> wrapper) {
		  Page<PeixunhuodongView> page =new Query<PeixunhuodongView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<PeixunhuodongVO> selectListVO(Wrapper<PeixunhuodongEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public PeixunhuodongVO selectVO(Wrapper<PeixunhuodongEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<PeixunhuodongView> selectListView(Wrapper<PeixunhuodongEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public PeixunhuodongView selectView(Wrapper<PeixunhuodongEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
