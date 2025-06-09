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


import com.dao.ShengxianzhanshiDao;
import com.entity.ShengxianzhanshiEntity;
import com.service.ShengxianzhanshiService;
import com.entity.vo.ShengxianzhanshiVO;
import com.entity.view.ShengxianzhanshiView;

@Service("shengxianzhanshiService")
public class ShengxianzhanshiServiceImpl extends ServiceImpl<ShengxianzhanshiDao, ShengxianzhanshiEntity> implements ShengxianzhanshiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShengxianzhanshiEntity> page = this.selectPage(
                new Query<ShengxianzhanshiEntity>(params).getPage(),
                new EntityWrapper<ShengxianzhanshiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShengxianzhanshiEntity> wrapper) {
		  Page<ShengxianzhanshiView> page =new Query<ShengxianzhanshiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShengxianzhanshiVO> selectListVO(Wrapper<ShengxianzhanshiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShengxianzhanshiVO selectVO(Wrapper<ShengxianzhanshiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShengxianzhanshiView> selectListView(Wrapper<ShengxianzhanshiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShengxianzhanshiView selectView(Wrapper<ShengxianzhanshiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
