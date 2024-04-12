package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 蛋糕商城
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-03-15 18:57:07
 */
@TableName("dangaoshangcheng")
public class DangaoshangchengEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public DangaoshangchengEntity() {
		
	}
	
	public DangaoshangchengEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 蛋糕名称
	 */
					
	private String dangaomingcheng;
	
	/**
	 * 蛋糕种类
	 */
					
	private String dangaozhonglei;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	/**
	 * 颜色
	 */
					
	private String yanse;
	
	/**
	 * 口味
	 */
					
	private String kouwei;
	
	/**
	 * 蛋糕尺寸
	 */
					
	private String dangaochicun;
	
	/**
	 * 重量
	 */
					
	private String zhongliang;
	
	/**
	 * 商家名称
	 */
					
	private String shangjiamingcheng;
	
	/**
	 * 商家地址
	 */
					
	private String shangjiadizhi;
	
	/**
	 * 蛋糕详情
	 */
					
	private String dangaoxiangqing;
	
	/**
	 * 最近点击时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date clicktime;
	
	/**
	 * 点击次数
	 */
					
	private Integer clicknum;
	
	/**
	 * 价格
	 */
					
	private Float price;
	
	/**
	 * 单限
	 */
					
	private Integer onelimittimes;
	
	/**
	 * 库存
	 */
					
	private Integer alllimittimes;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：蛋糕名称
	 */
	public void setDangaomingcheng(String dangaomingcheng) {
		this.dangaomingcheng = dangaomingcheng;
	}
	/**
	 * 获取：蛋糕名称
	 */
	public String getDangaomingcheng() {
		return dangaomingcheng;
	}
	/**
	 * 设置：蛋糕种类
	 */
	public void setDangaozhonglei(String dangaozhonglei) {
		this.dangaozhonglei = dangaozhonglei;
	}
	/**
	 * 获取：蛋糕种类
	 */
	public String getDangaozhonglei() {
		return dangaozhonglei;
	}
	/**
	 * 设置：图片
	 */
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
	/**
	 * 设置：颜色
	 */
	public void setYanse(String yanse) {
		this.yanse = yanse;
	}
	/**
	 * 获取：颜色
	 */
	public String getYanse() {
		return yanse;
	}
	/**
	 * 设置：口味
	 */
	public void setKouwei(String kouwei) {
		this.kouwei = kouwei;
	}
	/**
	 * 获取：口味
	 */
	public String getKouwei() {
		return kouwei;
	}
	/**
	 * 设置：蛋糕尺寸
	 */
	public void setDangaochicun(String dangaochicun) {
		this.dangaochicun = dangaochicun;
	}
	/**
	 * 获取：蛋糕尺寸
	 */
	public String getDangaochicun() {
		return dangaochicun;
	}
	/**
	 * 设置：重量
	 */
	public void setZhongliang(String zhongliang) {
		this.zhongliang = zhongliang;
	}
	/**
	 * 获取：重量
	 */
	public String getZhongliang() {
		return zhongliang;
	}
	/**
	 * 设置：商家名称
	 */
	public void setShangjiamingcheng(String shangjiamingcheng) {
		this.shangjiamingcheng = shangjiamingcheng;
	}
	/**
	 * 获取：商家名称
	 */
	public String getShangjiamingcheng() {
		return shangjiamingcheng;
	}
	/**
	 * 设置：商家地址
	 */
	public void setShangjiadizhi(String shangjiadizhi) {
		this.shangjiadizhi = shangjiadizhi;
	}
	/**
	 * 获取：商家地址
	 */
	public String getShangjiadizhi() {
		return shangjiadizhi;
	}
	/**
	 * 设置：蛋糕详情
	 */
	public void setDangaoxiangqing(String dangaoxiangqing) {
		this.dangaoxiangqing = dangaoxiangqing;
	}
	/**
	 * 获取：蛋糕详情
	 */
	public String getDangaoxiangqing() {
		return dangaoxiangqing;
	}
	/**
	 * 设置：最近点击时间
	 */
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
	/**
	 * 设置：点击次数
	 */
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}
	/**
	 * 设置：价格
	 */
	public void setPrice(Float price) {
		this.price = price;
	}
	/**
	 * 获取：价格
	 */
	public Float getPrice() {
		return price;
	}
	/**
	 * 设置：单限
	 */
	public void setOnelimittimes(Integer onelimittimes) {
		this.onelimittimes = onelimittimes;
	}
	/**
	 * 获取：单限
	 */
	public Integer getOnelimittimes() {
		return onelimittimes;
	}
	/**
	 * 设置：库存
	 */
	public void setAlllimittimes(Integer alllimittimes) {
		this.alllimittimes = alllimittimes;
	}
	/**
	 * 获取：库存
	 */
	public Integer getAlllimittimes() {
		return alllimittimes;
	}

}
