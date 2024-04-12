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


import com.dao.DangaoshangchengDao;
import com.entity.DangaoshangchengEntity;
import com.service.DangaoshangchengService;
import com.entity.vo.DangaoshangchengVO;
import com.entity.view.DangaoshangchengView;

@Service("dangaoshangchengService")
public class DangaoshangchengServiceImpl extends ServiceImpl<DangaoshangchengDao, DangaoshangchengEntity> implements DangaoshangchengService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DangaoshangchengEntity> page = this.selectPage(
                new Query<DangaoshangchengEntity>(params).getPage(),
                new EntityWrapper<DangaoshangchengEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DangaoshangchengEntity> wrapper) {
		  Page<DangaoshangchengView> page =new Query<DangaoshangchengView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DangaoshangchengVO> selectListVO(Wrapper<DangaoshangchengEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DangaoshangchengVO selectVO(Wrapper<DangaoshangchengEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DangaoshangchengView> selectListView(Wrapper<DangaoshangchengEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DangaoshangchengView selectView(Wrapper<DangaoshangchengEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
