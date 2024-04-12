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


import com.dao.DangaozhongleiDao;
import com.entity.DangaozhongleiEntity;
import com.service.DangaozhongleiService;
import com.entity.vo.DangaozhongleiVO;
import com.entity.view.DangaozhongleiView;

@Service("dangaozhongleiService")
public class DangaozhongleiServiceImpl extends ServiceImpl<DangaozhongleiDao, DangaozhongleiEntity> implements DangaozhongleiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DangaozhongleiEntity> page = this.selectPage(
                new Query<DangaozhongleiEntity>(params).getPage(),
                new EntityWrapper<DangaozhongleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DangaozhongleiEntity> wrapper) {
		  Page<DangaozhongleiView> page =new Query<DangaozhongleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DangaozhongleiVO> selectListVO(Wrapper<DangaozhongleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DangaozhongleiVO selectVO(Wrapper<DangaozhongleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DangaozhongleiView> selectListView(Wrapper<DangaozhongleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DangaozhongleiView selectView(Wrapper<DangaozhongleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
