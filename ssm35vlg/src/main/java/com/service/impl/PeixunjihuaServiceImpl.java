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


import com.dao.PeixunjihuaDao;
import com.entity.PeixunjihuaEntity;
import com.service.PeixunjihuaService;
import com.entity.vo.PeixunjihuaVO;
import com.entity.view.PeixunjihuaView;

@Service("peixunjihuaService")
public class PeixunjihuaServiceImpl extends ServiceImpl<PeixunjihuaDao, PeixunjihuaEntity> implements PeixunjihuaService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<PeixunjihuaEntity> page = this.selectPage(
                new Query<PeixunjihuaEntity>(params).getPage(),
                new EntityWrapper<PeixunjihuaEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<PeixunjihuaEntity> wrapper) {
		  Page<PeixunjihuaView> page =new Query<PeixunjihuaView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<PeixunjihuaVO> selectListVO(Wrapper<PeixunjihuaEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public PeixunjihuaVO selectVO(Wrapper<PeixunjihuaEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<PeixunjihuaView> selectListView(Wrapper<PeixunjihuaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public PeixunjihuaView selectView(Wrapper<PeixunjihuaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
