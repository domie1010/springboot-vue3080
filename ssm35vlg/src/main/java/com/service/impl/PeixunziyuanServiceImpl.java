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


import com.dao.PeixunziyuanDao;
import com.entity.PeixunziyuanEntity;
import com.service.PeixunziyuanService;
import com.entity.vo.PeixunziyuanVO;
import com.entity.view.PeixunziyuanView;

@Service("peixunziyuanService")
public class PeixunziyuanServiceImpl extends ServiceImpl<PeixunziyuanDao, PeixunziyuanEntity> implements PeixunziyuanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<PeixunziyuanEntity> page = this.selectPage(
                new Query<PeixunziyuanEntity>(params).getPage(),
                new EntityWrapper<PeixunziyuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<PeixunziyuanEntity> wrapper) {
		  Page<PeixunziyuanView> page =new Query<PeixunziyuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<PeixunziyuanVO> selectListVO(Wrapper<PeixunziyuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public PeixunziyuanVO selectVO(Wrapper<PeixunziyuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<PeixunziyuanView> selectListView(Wrapper<PeixunziyuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public PeixunziyuanView selectView(Wrapper<PeixunziyuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
