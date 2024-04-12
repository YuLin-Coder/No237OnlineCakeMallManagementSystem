package com.dao;

import com.entity.DangaoshangchengEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DangaoshangchengVO;
import com.entity.view.DangaoshangchengView;


/**
 * 蛋糕商城
 * 
 * @author 
 * @email 
 * @date 2022-03-15 18:57:07
 */
public interface DangaoshangchengDao extends BaseMapper<DangaoshangchengEntity> {
	
	List<DangaoshangchengVO> selectListVO(@Param("ew") Wrapper<DangaoshangchengEntity> wrapper);
	
	DangaoshangchengVO selectVO(@Param("ew") Wrapper<DangaoshangchengEntity> wrapper);
	
	List<DangaoshangchengView> selectListView(@Param("ew") Wrapper<DangaoshangchengEntity> wrapper);

	List<DangaoshangchengView> selectListView(Pagination page,@Param("ew") Wrapper<DangaoshangchengEntity> wrapper);
	
	DangaoshangchengView selectView(@Param("ew") Wrapper<DangaoshangchengEntity> wrapper);
	

}
