package com.dao;

import com.entity.ShengxianxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShengxianxinxiVO;
import com.entity.view.ShengxianxinxiView;


/**
 * 生鲜信息
 * 
 * @author 
 * @email 
 * @date 2021-01-12 22:31:57
 */
public interface ShengxianxinxiDao extends BaseMapper<ShengxianxinxiEntity> {
	
	List<ShengxianxinxiVO> selectListVO(@Param("ew") Wrapper<ShengxianxinxiEntity> wrapper);
	
	ShengxianxinxiVO selectVO(@Param("ew") Wrapper<ShengxianxinxiEntity> wrapper);
	
	List<ShengxianxinxiView> selectListView(@Param("ew") Wrapper<ShengxianxinxiEntity> wrapper);

	List<ShengxianxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<ShengxianxinxiEntity> wrapper);
	
	ShengxianxinxiView selectView(@Param("ew") Wrapper<ShengxianxinxiEntity> wrapper);
	
}
