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


import com.dao.DiscussshengxianxinxiDao;
import com.entity.DiscussshengxianxinxiEntity;
import com.service.DiscussshengxianxinxiService;
import com.entity.vo.DiscussshengxianxinxiVO;
import com.entity.view.DiscussshengxianxinxiView;

@Service("discussshengxianxinxiService")
public class DiscussshengxianxinxiServiceImpl extends ServiceImpl<DiscussshengxianxinxiDao, DiscussshengxianxinxiEntity> implements DiscussshengxianxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussshengxianxinxiEntity> page = this.selectPage(
                new Query<DiscussshengxianxinxiEntity>(params).getPage(),
                new EntityWrapper<DiscussshengxianxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussshengxianxinxiEntity> wrapper) {
		  Page<DiscussshengxianxinxiView> page =new Query<DiscussshengxianxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussshengxianxinxiVO> selectListVO(Wrapper<DiscussshengxianxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussshengxianxinxiVO selectVO(Wrapper<DiscussshengxianxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussshengxianxinxiView> selectListView(Wrapper<DiscussshengxianxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussshengxianxinxiView selectView(Wrapper<DiscussshengxianxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
