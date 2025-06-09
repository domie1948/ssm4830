package com.dao;

import com.entity.ShengxianjinhuoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShengxianjinhuoVO;
import com.entity.view.ShengxianjinhuoView;


/**
 * 生鲜进货
 * 
 * @author 
 * @email 
 * @date 2021-01-12 22:31:57
 */
public interface ShengxianjinhuoDao extends BaseMapper<ShengxianjinhuoEntity> {
	
	List<ShengxianjinhuoVO> selectListVO(@Param("ew") Wrapper<ShengxianjinhuoEntity> wrapper);
	
	ShengxianjinhuoVO selectVO(@Param("ew") Wrapper<ShengxianjinhuoEntity> wrapper);
	
	List<ShengxianjinhuoView> selectListView(@Param("ew") Wrapper<ShengxianjinhuoEntity> wrapper);

	List<ShengxianjinhuoView> selectListView(Pagination page,@Param("ew") Wrapper<ShengxianjinhuoEntity> wrapper);
	
	ShengxianjinhuoView selectView(@Param("ew") Wrapper<ShengxianjinhuoEntity> wrapper);
	
}
