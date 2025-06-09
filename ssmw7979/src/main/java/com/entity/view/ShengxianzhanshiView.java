package com.entity.view;

import com.entity.ShengxianzhanshiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 生鲜展示
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-01-12 22:31:57
 */
@TableName("shengxianzhanshi")
public class ShengxianzhanshiView  extends ShengxianzhanshiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShengxianzhanshiView(){
	}
 
 	public ShengxianzhanshiView(ShengxianzhanshiEntity shengxianzhanshiEntity){
 	try {
			BeanUtils.copyProperties(this, shengxianzhanshiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
