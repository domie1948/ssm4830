package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShengxianxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShengxianxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShengxianxinxiView;


/**
 * 生鲜信息
 *
 * @author 
 * @email 
 * @date 2021-01-12 22:31:57
 */
public interface ShengxianxinxiService extends IService<ShengxianxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShengxianxinxiVO> selectListVO(Wrapper<ShengxianxinxiEntity> wrapper);
   	
   	ShengxianxinxiVO selectVO(@Param("ew") Wrapper<ShengxianxinxiEntity> wrapper);
   	
   	List<ShengxianxinxiView> selectListView(Wrapper<ShengxianxinxiEntity> wrapper);
   	
   	ShengxianxinxiView selectView(@Param("ew") Wrapper<ShengxianxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShengxianxinxiEntity> wrapper);
   	
}

