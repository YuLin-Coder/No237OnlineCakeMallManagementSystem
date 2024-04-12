package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DiscussdangaoshangchengDao;
import com.entity.DiscussdangaoshangchengEntity;
import com.service.DiscussdangaoshangchengService;
import com.entity.vo.DiscussdangaoshangchengVO;
import com.entity.view.DiscussdangaoshangchengView;

@Service("discussdangaoshangchengService")
public class DiscussdangaoshangchengServiceImpl extends ServiceImpl<DiscussdangaoshangchengDao, DiscussdangaoshangchengEntity> implements DiscussdangaoshangchengService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussdangaoshangchengEntity> page = this.selectPage(
                new Query<DiscussdangaoshangchengEntity>(params).getPage(),
                new EntityWrapper<DiscussdangaoshangchengEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussdangaoshangchengEntity> wrapper) {
		  Page<DiscussdangaoshangchengView> page =new Query<DiscussdangaoshangchengView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussdangaoshangchengVO> selectListVO(Wrapper<DiscussdangaoshangchengEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussdangaoshangchengVO selectVO(Wrapper<DiscussdangaoshangchengEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussdangaoshangchengView> selectListView(Wrapper<DiscussdangaoshangchengEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussdangaoshangchengView selectView(Wrapper<DiscussdangaoshangchengEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
