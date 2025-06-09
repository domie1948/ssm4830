package com.entity.view;

import com.entity.DiscussshengxianxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 生鲜信息评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-01-12 22:31:57
 */
@TableName("discussshengxianxinxi")
public class DiscussshengxianxinxiView  extends DiscussshengxianxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussshengxianxinxiView(){
	}
 
 	public DiscussshengxianxinxiView(DiscussshengxianxinxiEntity discussshengxianxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, discussshengxianxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
