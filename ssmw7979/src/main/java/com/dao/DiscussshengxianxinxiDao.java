package com.dao;

import com.entity.DiscussshengxianxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussshengxianxinxiVO;
import com.entity.view.DiscussshengxianxinxiView;


/**
 * 生鲜信息评论表
 * 
 * @author 
 * @email 
 * @date 2021-01-12 22:31:57
 */
public interface DiscussshengxianxinxiDao extends BaseMapper<DiscussshengxianxinxiEntity> {
	
	List<DiscussshengxianxinxiVO> selectListVO(@Param("ew") Wrapper<DiscussshengxianxinxiEntity> wrapper);
	
	DiscussshengxianxinxiVO selectVO(@Param("ew") Wrapper<DiscussshengxianxinxiEntity> wrapper);
	
	List<DiscussshengxianxinxiView> selectListView(@Param("ew") Wrapper<DiscussshengxianxinxiEntity> wrapper);

	List<DiscussshengxianxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussshengxianxinxiEntity> wrapper);
	
	DiscussshengxianxinxiView selectView(@Param("ew") Wrapper<DiscussshengxianxinxiEntity> wrapper);
	
}
