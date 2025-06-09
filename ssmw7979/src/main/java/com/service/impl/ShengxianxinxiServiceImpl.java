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


import com.dao.ShengxianxinxiDao;
import com.entity.ShengxianxinxiEntity;
import com.service.ShengxianxinxiService;
import com.entity.vo.ShengxianxinxiVO;
import com.entity.view.ShengxianxinxiView;

@Service("shengxianxinxiService")
public class ShengxianxinxiServiceImpl extends ServiceImpl<ShengxianxinxiDao, ShengxianxinxiEntity> implements ShengxianxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShengxianxinxiEntity> page = this.selectPage(
                new Query<ShengxianxinxiEntity>(params).getPage(),
                new EntityWrapper<ShengxianxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShengxianxinxiEntity> wrapper) {
		  Page<ShengxianxinxiView> page =new Query<ShengxianxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShengxianxinxiVO> selectListVO(Wrapper<ShengxianxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShengxianxinxiVO selectVO(Wrapper<ShengxianxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShengxianxinxiView> selectListView(Wrapper<ShengxianxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShengxianxinxiView selectView(Wrapper<ShengxianxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
