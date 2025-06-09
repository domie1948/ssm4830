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

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.DiscussshengxianzhanshiEntity;
import com.entity.view.DiscussshengxianzhanshiView;

import com.service.DiscussshengxianzhanshiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 生鲜展示评论表
 * 后端接口
 * @author 
 * @email 
 * @date 2021-01-12 22:31:57
 */
@RestController
@RequestMapping("/discussshengxianzhanshi")
public class DiscussshengxianzhanshiController {
    @Autowired
    private DiscussshengxianzhanshiService discussshengxianzhanshiService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,DiscussshengxianzhanshiEntity discussshengxianzhanshi, HttpServletRequest request){

        EntityWrapper<DiscussshengxianzhanshiEntity> ew = new EntityWrapper<DiscussshengxianzhanshiEntity>();
		PageUtils page = discussshengxianzhanshiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discussshengxianzhanshi), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,DiscussshengxianzhanshiEntity discussshengxianzhanshi, HttpServletRequest request){
        EntityWrapper<DiscussshengxianzhanshiEntity> ew = new EntityWrapper<DiscussshengxianzhanshiEntity>();
		PageUtils page = discussshengxianzhanshiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discussshengxianzhanshi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( DiscussshengxianzhanshiEntity discussshengxianzhanshi){
       	EntityWrapper<DiscussshengxianzhanshiEntity> ew = new EntityWrapper<DiscussshengxianzhanshiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( discussshengxianzhanshi, "discussshengxianzhanshi")); 
        return R.ok().put("data", discussshengxianzhanshiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(DiscussshengxianzhanshiEntity discussshengxianzhanshi){
        EntityWrapper< DiscussshengxianzhanshiEntity> ew = new EntityWrapper< DiscussshengxianzhanshiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( discussshengxianzhanshi, "discussshengxianzhanshi")); 
		DiscussshengxianzhanshiView discussshengxianzhanshiView =  discussshengxianzhanshiService.selectView(ew);
		return R.ok("查询生鲜展示评论表成功").put("data", discussshengxianzhanshiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        DiscussshengxianzhanshiEntity discussshengxianzhanshi = discussshengxianzhanshiService.selectById(id);
        return R.ok().put("data", discussshengxianzhanshi);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        DiscussshengxianzhanshiEntity discussshengxianzhanshi = discussshengxianzhanshiService.selectById(id);
        return R.ok().put("data", discussshengxianzhanshi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody DiscussshengxianzhanshiEntity discussshengxianzhanshi, HttpServletRequest request){
    	discussshengxianzhanshi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(discussshengxianzhanshi);

        discussshengxianzhanshiService.insert(discussshengxianzhanshi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody DiscussshengxianzhanshiEntity discussshengxianzhanshi, HttpServletRequest request){
    	discussshengxianzhanshi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(discussshengxianzhanshi);

        discussshengxianzhanshiService.insert(discussshengxianzhanshi);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody DiscussshengxianzhanshiEntity discussshengxianzhanshi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(discussshengxianzhanshi);
        discussshengxianzhanshiService.updateById(discussshengxianzhanshi);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        discussshengxianzhanshiService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<DiscussshengxianzhanshiEntity> wrapper = new EntityWrapper<DiscussshengxianzhanshiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = discussshengxianzhanshiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
