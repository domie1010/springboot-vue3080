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


import com.dao.PeixunxuqiuDao;
import com.entity.PeixunxuqiuEntity;
import com.service.PeixunxuqiuService;
import com.entity.vo.PeixunxuqiuVO;
import com.entity.view.PeixunxuqiuView;

@Service("peixunxuqiuService")
public class PeixunxuqiuServiceImpl extends ServiceImpl<PeixunxuqiuDao, PeixunxuqiuEntity> implements PeixunxuqiuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<PeixunxuqiuEntity> page = this.selectPage(
                new Query<PeixunxuqiuEntity>(params).getPage(),
                new EntityWrapper<PeixunxuqiuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<PeixunxuqiuEntity> wrapper) {
		  Page<PeixunxuqiuView> page =new Query<PeixunxuqiuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<PeixunxuqiuVO> selectListVO(Wrapper<PeixunxuqiuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public PeixunxuqiuVO selectVO(Wrapper<PeixunxuqiuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<PeixunxuqiuView> selectListView(Wrapper<PeixunxuqiuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public PeixunxuqiuView selectView(Wrapper<PeixunxuqiuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
