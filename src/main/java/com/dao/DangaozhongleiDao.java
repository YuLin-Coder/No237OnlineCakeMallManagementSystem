package com.dao;

import com.entity.DangaozhongleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DangaozhongleiVO;
import com.entity.view.DangaozhongleiView;


/**
 * 蛋糕种类
 * 
 * @author 
 * @email 
 * @date 2022-03-15 18:57:07
 */
public interface DangaozhongleiDao extends BaseMapper<DangaozhongleiEntity> {
	
	List<DangaozhongleiVO> selectListVO(@Param("ew") Wrapper<DangaozhongleiEntity> wrapper);
	
	DangaozhongleiVO selectVO(@Param("ew") Wrapper<DangaozhongleiEntity> wrapper);
	
	List<DangaozhongleiView> selectListView(@Param("ew") Wrapper<DangaozhongleiEntity> wrapper);

	List<DangaozhongleiView> selectListView(Pagination page,@Param("ew") Wrapper<DangaozhongleiEntity> wrapper);
	
	DangaozhongleiView selectView(@Param("ew") Wrapper<DangaozhongleiEntity> wrapper);
	

}
