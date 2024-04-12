package com.dao;

import com.entity.DiscussdangaoshangchengEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussdangaoshangchengVO;
import com.entity.view.DiscussdangaoshangchengView;


/**
 * 蛋糕商城评论表
 * 
 * @author 
 * @email 
 * @date 2022-03-15 18:57:07
 */
public interface DiscussdangaoshangchengDao extends BaseMapper<DiscussdangaoshangchengEntity> {
	
	List<DiscussdangaoshangchengVO> selectListVO(@Param("ew") Wrapper<DiscussdangaoshangchengEntity> wrapper);
	
	DiscussdangaoshangchengVO selectVO(@Param("ew") Wrapper<DiscussdangaoshangchengEntity> wrapper);
	
	List<DiscussdangaoshangchengView> selectListView(@Param("ew") Wrapper<DiscussdangaoshangchengEntity> wrapper);

	List<DiscussdangaoshangchengView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussdangaoshangchengEntity> wrapper);
	
	DiscussdangaoshangchengView selectView(@Param("ew") Wrapper<DiscussdangaoshangchengEntity> wrapper);
	

}
