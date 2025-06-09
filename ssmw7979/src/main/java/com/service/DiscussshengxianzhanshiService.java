package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussshengxianzhanshiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussshengxianzhanshiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussshengxianzhanshiView;


/**
 * 生鲜展示评论表
 *
 * @author 
 * @email 
 * @date 2021-01-12 22:31:57
 */
public interface DiscussshengxianzhanshiService extends IService<DiscussshengxianzhanshiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussshengxianzhanshiVO> selectListVO(Wrapper<DiscussshengxianzhanshiEntity> wrapper);
   	
   	DiscussshengxianzhanshiVO selectVO(@Param("ew") Wrapper<DiscussshengxianzhanshiEntity> wrapper);
   	
   	List<DiscussshengxianzhanshiView> selectListView(Wrapper<DiscussshengxianzhanshiEntity> wrapper);
   	
   	DiscussshengxianzhanshiView selectView(@Param("ew") Wrapper<DiscussshengxianzhanshiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussshengxianzhanshiEntity> wrapper);
   	
}

