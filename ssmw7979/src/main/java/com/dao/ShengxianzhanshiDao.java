package com.dao;

import com.entity.ShengxianzhanshiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShengxianzhanshiVO;
import com.entity.view.ShengxianzhanshiView;


/**
 * 生鲜展示
 * 
 * @author 
 * @email 
 * @date 2021-01-12 22:31:57
 */
public interface ShengxianzhanshiDao extends BaseMapper<ShengxianzhanshiEntity> {
	
	List<ShengxianzhanshiVO> selectListVO(@Param("ew") Wrapper<ShengxianzhanshiEntity> wrapper);
	
	ShengxianzhanshiVO selectVO(@Param("ew") Wrapper<ShengxianzhanshiEntity> wrapper);
	
	List<ShengxianzhanshiView> selectListView(@Param("ew") Wrapper<ShengxianzhanshiEntity> wrapper);

	List<ShengxianzhanshiView> selectListView(Pagination page,@Param("ew") Wrapper<ShengxianzhanshiEntity> wrapper);
	
	ShengxianzhanshiView selectView(@Param("ew") Wrapper<ShengxianzhanshiEntity> wrapper);
	
}
