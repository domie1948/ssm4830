package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussshengxianxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussshengxianxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussshengxianxinxiView;


/**
 * 生鲜信息评论表
 *
 * @author 
 * @email 
 * @date 2021-01-12 22:31:57
 */
public interface DiscussshengxianxinxiService extends IService<DiscussshengxianxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussshengxianxinxiVO> selectListVO(Wrapper<DiscussshengxianxinxiEntity> wrapper);
   	
   	DiscussshengxianxinxiVO selectVO(@Param("ew") Wrapper<DiscussshengxianxinxiEntity> wrapper);
   	
   	List<DiscussshengxianxinxiView> selectListView(Wrapper<DiscussshengxianxinxiEntity> wrapper);
   	
   	DiscussshengxianxinxiView selectView(@Param("ew") Wrapper<DiscussshengxianxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussshengxianxinxiEntity> wrapper);
   	
}

