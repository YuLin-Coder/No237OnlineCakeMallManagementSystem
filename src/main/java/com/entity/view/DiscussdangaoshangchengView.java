package com.entity.view;

import com.entity.DiscussdangaoshangchengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 蛋糕商城评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-15 18:57:07
 */
@TableName("discussdangaoshangcheng")
public class DiscussdangaoshangchengView  extends DiscussdangaoshangchengEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussdangaoshangchengView(){
	}
 
 	public DiscussdangaoshangchengView(DiscussdangaoshangchengEntity discussdangaoshangchengEntity){
 	try {
			BeanUtils.copyProperties(this, discussdangaoshangchengEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
