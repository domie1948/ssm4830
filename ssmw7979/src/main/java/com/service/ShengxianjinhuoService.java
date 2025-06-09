package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShengxianjinhuoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShengxianjinhuoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShengxianjinhuoView;


/**
 * 生鲜进货
 *
 * @author 
 * @email 
 * @date 2021-01-12 22:31:57
 */
public interface ShengxianjinhuoService extends IService<ShengxianjinhuoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShengxianjinhuoVO> selectListVO(Wrapper<ShengxianjinhuoEntity> wrapper);
   	
   	ShengxianjinhuoVO selectVO(@Param("ew") Wrapper<ShengxianjinhuoEntity> wrapper);
   	
   	List<ShengxianjinhuoView> selectListView(Wrapper<ShengxianjinhuoEntity> wrapper);
   	
   	ShengxianjinhuoView selectView(@Param("ew") Wrapper<ShengxianjinhuoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShengxianjinhuoEntity> wrapper);
   	
}

