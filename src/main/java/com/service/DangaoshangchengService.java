package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DangaoshangchengEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DangaoshangchengVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DangaoshangchengView;


/**
 * 蛋糕商城
 *
 * @author 
 * @email 
 * @date 2022-03-15 18:57:07
 */
public interface DangaoshangchengService extends IService<DangaoshangchengEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DangaoshangchengVO> selectListVO(Wrapper<DangaoshangchengEntity> wrapper);
   	
   	DangaoshangchengVO selectVO(@Param("ew") Wrapper<DangaoshangchengEntity> wrapper);
   	
   	List<DangaoshangchengView> selectListView(Wrapper<DangaoshangchengEntity> wrapper);
   	
   	DangaoshangchengView selectView(@Param("ew") Wrapper<DangaoshangchengEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DangaoshangchengEntity> wrapper);
   	

}

