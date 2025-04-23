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


import com.dao.PeixunkechengDao;
import com.entity.PeixunkechengEntity;
import com.service.PeixunkechengService;
import com.entity.vo.PeixunkechengVO;
import com.entity.view.PeixunkechengView;

@Service("peixunkechengService")
public class PeixunkechengServiceImpl extends ServiceImpl<PeixunkechengDao, PeixunkechengEntity> implements PeixunkechengService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<PeixunkechengEntity> page = this.selectPage(
                new Query<PeixunkechengEntity>(params).getPage(),
                new EntityWrapper<PeixunkechengEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<PeixunkechengEntity> wrapper) {
		  Page<PeixunkechengView> page =new Query<PeixunkechengView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<PeixunkechengVO> selectListVO(Wrapper<PeixunkechengEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public PeixunkechengVO selectVO(Wrapper<PeixunkechengEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<PeixunkechengView> selectListView(Wrapper<PeixunkechengEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public PeixunkechengView selectView(Wrapper<PeixunkechengEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
