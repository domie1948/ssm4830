package com.entity.view;

import com.entity.DiscussshengxianzhanshiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 生鲜展示评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-01-12 22:31:57
 */
@TableName("discussshengxianzhanshi")
public class DiscussshengxianzhanshiView  extends DiscussshengxianzhanshiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussshengxianzhanshiView(){
	}
 
 	public DiscussshengxianzhanshiView(DiscussshengxianzhanshiEntity discussshengxianzhanshiEntity){
 	try {
			BeanUtils.copyProperties(this, discussshengxianzhanshiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
