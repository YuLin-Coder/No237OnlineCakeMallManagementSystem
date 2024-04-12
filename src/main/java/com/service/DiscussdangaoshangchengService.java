package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussdangaoshangchengEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussdangaoshangchengVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussdangaoshangchengView;


/**
 * 蛋糕商城评论表
 *
 * @author 
 * @email 
 * @date 2022-03-15 18:57:07
 */
public interface DiscussdangaoshangchengService extends IService<DiscussdangaoshangchengEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussdangaoshangchengVO> selectListVO(Wrapper<DiscussdangaoshangchengEntity> wrapper);
   	
   	DiscussdangaoshangchengVO selectVO(@Param("ew") Wrapper<DiscussdangaoshangchengEntity> wrapper);
   	
   	List<DiscussdangaoshangchengView> selectListView(Wrapper<DiscussdangaoshangchengEntity> wrapper);
   	
   	DiscussdangaoshangchengView selectView(@Param("ew") Wrapper<DiscussdangaoshangchengEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussdangaoshangchengEntity> wrapper);
   	

}

