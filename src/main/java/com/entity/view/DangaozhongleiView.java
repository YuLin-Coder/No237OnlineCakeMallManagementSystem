package com.entity.view;

import com.entity.DangaozhongleiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 蛋糕种类
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-15 18:57:07
 */
@TableName("dangaozhonglei")
public class DangaozhongleiView  extends DangaozhongleiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DangaozhongleiView(){
	}
 
 	public DangaozhongleiView(DangaozhongleiEntity dangaozhongleiEntity){
 	try {
			BeanUtils.copyProperties(this, dangaozhongleiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
