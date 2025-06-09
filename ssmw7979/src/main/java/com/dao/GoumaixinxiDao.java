package com.dao;

import com.entity.GoumaixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GoumaixinxiVO;
import com.entity.view.GoumaixinxiView;


/**
 * 购买信息
 * 
 * @author 
 * @email 
 * @date 2021-01-12 22:31:57
 */
public interface GoumaixinxiDao extends BaseMapper<GoumaixinxiEntity> {
	
	List<GoumaixinxiVO> selectListVO(@Param("ew") Wrapper<GoumaixinxiEntity> wrapper);
	
	GoumaixinxiVO selectVO(@Param("ew") Wrapper<GoumaixinxiEntity> wrapper);
	
	List<GoumaixinxiView> selectListView(@Param("ew") Wrapper<GoumaixinxiEntity> wrapper);

	List<GoumaixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<GoumaixinxiEntity> wrapper);
	
	GoumaixinxiView selectView(@Param("ew") Wrapper<GoumaixinxiEntity> wrapper);
	
}
