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


import com.dao.DiscussshengxianzhanshiDao;
import com.entity.DiscussshengxianzhanshiEntity;
import com.service.DiscussshengxianzhanshiService;
import com.entity.vo.DiscussshengxianzhanshiVO;
import com.entity.view.DiscussshengxianzhanshiView;

@Service("discussshengxianzhanshiService")
public class DiscussshengxianzhanshiServiceImpl extends ServiceImpl<DiscussshengxianzhanshiDao, DiscussshengxianzhanshiEntity> implements DiscussshengxianzhanshiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussshengxianzhanshiEntity> page = this.selectPage(
                new Query<DiscussshengxianzhanshiEntity>(params).getPage(),
                new EntityWrapper<DiscussshengxianzhanshiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussshengxianzhanshiEntity> wrapper) {
		  Page<DiscussshengxianzhanshiView> page =new Query<DiscussshengxianzhanshiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussshengxianzhanshiVO> selectListVO(Wrapper<DiscussshengxianzhanshiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussshengxianzhanshiVO selectVO(Wrapper<DiscussshengxianzhanshiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussshengxianzhanshiView> selectListView(Wrapper<DiscussshengxianzhanshiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussshengxianzhanshiView selectView(Wrapper<DiscussshengxianzhanshiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
