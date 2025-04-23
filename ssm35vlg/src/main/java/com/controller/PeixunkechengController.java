package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.PeixunkechengEntity;
import com.entity.view.PeixunkechengView;

import com.service.PeixunkechengService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;

/**
 * 培训课程
 * 后端接口
 * @author 
 * @email 
 * @date 2022-05-14 10:59:21
 */
@RestController
@RequestMapping("/peixunkecheng")
public class PeixunkechengController {
    @Autowired
    private PeixunkechengService peixunkechengService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,PeixunkechengEntity peixunkecheng, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yuangong")) {
			peixunkecheng.setYuangonggonghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("bumenzhuguan")) {
			peixunkecheng.setZhuguanzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<PeixunkechengEntity> ew = new EntityWrapper<PeixunkechengEntity>();
		PageUtils page = peixunkechengService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, peixunkecheng), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,PeixunkechengEntity peixunkecheng, 
		HttpServletRequest request){
        EntityWrapper<PeixunkechengEntity> ew = new EntityWrapper<PeixunkechengEntity>();
		PageUtils page = peixunkechengService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, peixunkecheng), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( PeixunkechengEntity peixunkecheng){
       	EntityWrapper<PeixunkechengEntity> ew = new EntityWrapper<PeixunkechengEntity>();
      	ew.allEq(MPUtil.allEQMapPre( peixunkecheng, "peixunkecheng")); 
        return R.ok().put("data", peixunkechengService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(PeixunkechengEntity peixunkecheng){
        EntityWrapper< PeixunkechengEntity> ew = new EntityWrapper< PeixunkechengEntity>();
 		ew.allEq(MPUtil.allEQMapPre( peixunkecheng, "peixunkecheng")); 
		PeixunkechengView peixunkechengView =  peixunkechengService.selectView(ew);
		return R.ok("查询培训课程成功").put("data", peixunkechengView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        PeixunkechengEntity peixunkecheng = peixunkechengService.selectById(id);
        return R.ok().put("data", peixunkecheng);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        PeixunkechengEntity peixunkecheng = peixunkechengService.selectById(id);
        return R.ok().put("data", peixunkecheng);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody PeixunkechengEntity peixunkecheng, HttpServletRequest request){
    	peixunkecheng.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(peixunkecheng);

        peixunkechengService.insert(peixunkecheng);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody PeixunkechengEntity peixunkecheng, HttpServletRequest request){
    	peixunkecheng.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(peixunkecheng);

        peixunkechengService.insert(peixunkecheng);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody PeixunkechengEntity peixunkecheng, HttpServletRequest request){
        //ValidatorUtils.validateEntity(peixunkecheng);
        peixunkechengService.updateById(peixunkecheng);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        peixunkechengService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<PeixunkechengEntity> wrapper = new EntityWrapper<PeixunkechengEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yuangong")) {
			wrapper.eq("yuangonggonghao", (String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("bumenzhuguan")) {
			wrapper.eq("zhuguanzhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = peixunkechengService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}
