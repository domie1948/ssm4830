package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShengxianzhanshiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShengxianzhanshiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShengxianzhanshiView;


/**
 * 生鲜展示
 *
 * @author 
 * @email 
 * @date 2021-01-12 22:31:57
 */
public interface ShengxianzhanshiService extends IService<ShengxianzhanshiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShengxianzhanshiVO> selectListVO(Wrapper<ShengxianzhanshiEntity> wrapper);
   	
   	ShengxianzhanshiVO selectVO(@Param("ew") Wrapper<ShengxianzhanshiEntity> wrapper);
   	
   	List<ShengxianzhanshiView> selectListView(Wrapper<ShengxianzhanshiEntity> wrapper);
   	
   	ShengxianzhanshiView selectView(@Param("ew") Wrapper<ShengxianzhanshiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShengxianzhanshiEntity> wrapper);
   	
}

