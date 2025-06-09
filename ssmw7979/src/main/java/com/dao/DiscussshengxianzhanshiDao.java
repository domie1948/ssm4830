package com.dao;

import com.entity.DiscussshengxianzhanshiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussshengxianzhanshiVO;
import com.entity.view.DiscussshengxianzhanshiView;


/**
 * 生鲜展示评论表
 * 
 * @author 
 * @email 
 * @date 2021-01-12 22:31:57
 */
public interface DiscussshengxianzhanshiDao extends BaseMapper<DiscussshengxianzhanshiEntity> {
	
	List<DiscussshengxianzhanshiVO> selectListVO(@Param("ew") Wrapper<DiscussshengxianzhanshiEntity> wrapper);
	
	DiscussshengxianzhanshiVO selectVO(@Param("ew") Wrapper<DiscussshengxianzhanshiEntity> wrapper);
	
	List<DiscussshengxianzhanshiView> selectListView(@Param("ew") Wrapper<DiscussshengxianzhanshiEntity> wrapper);

	List<DiscussshengxianzhanshiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussshengxianzhanshiEntity> wrapper);
	
	DiscussshengxianzhanshiView selectView(@Param("ew") Wrapper<DiscussshengxianzhanshiEntity> wrapper);
	
}
