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


import com.dao.ShengxianjinhuoDao;
import com.entity.ShengxianjinhuoEntity;
import com.service.ShengxianjinhuoService;
import com.entity.vo.ShengxianjinhuoVO;
import com.entity.view.ShengxianjinhuoView;

@Service("shengxianjinhuoService")
public class ShengxianjinhuoServiceImpl extends ServiceImpl<ShengxianjinhuoDao, ShengxianjinhuoEntity> implements ShengxianjinhuoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShengxianjinhuoEntity> page = this.selectPage(
                new Query<ShengxianjinhuoEntity>(params).getPage(),
                new EntityWrapper<ShengxianjinhuoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShengxianjinhuoEntity> wrapper) {
		  Page<ShengxianjinhuoView> page =new Query<ShengxianjinhuoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShengxianjinhuoVO> selectListVO(Wrapper<ShengxianjinhuoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShengxianjinhuoVO selectVO(Wrapper<ShengxianjinhuoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShengxianjinhuoView> selectListView(Wrapper<ShengxianjinhuoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShengxianjinhuoView selectView(Wrapper<ShengxianjinhuoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
