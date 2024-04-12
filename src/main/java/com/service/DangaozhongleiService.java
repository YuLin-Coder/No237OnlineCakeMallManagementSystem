package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DangaozhongleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DangaozhongleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DangaozhongleiView;


/**
 * 蛋糕种类
 *
 * @author 
 * @email 
 * @date 2022-03-15 18:57:07
 */
public interface DangaozhongleiService extends IService<DangaozhongleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DangaozhongleiVO> selectListVO(Wrapper<DangaozhongleiEntity> wrapper);
   	
   	DangaozhongleiVO selectVO(@Param("ew") Wrapper<DangaozhongleiEntity> wrapper);
   	
   	List<DangaozhongleiView> selectListView(Wrapper<DangaozhongleiEntity> wrapper);
   	
   	DangaozhongleiView selectView(@Param("ew") Wrapper<DangaozhongleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DangaozhongleiEntity> wrapper);
   	

}

