package com.taotao.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.taotao.common.pojo.EasyUiDataGridResult;
import com.taotao.common.pojo.EasyUiTreeNode;
import com.taotao.mapper.ItemMapper;
import com.taotao.pojo.Item;
import com.taotao.pojo.ItemExample;
import com.taotao.service.ItemsService;
@Service
public class ItemsServiceImpl implements ItemsService{

	@Autowired
	ItemMapper itemMapper;
	@Override
	public EasyUiDataGridResult getItemsResult(Integer page, Integer rows) {
		PageHelper.startPage(page, rows);
		ItemExample itemExample = new ItemExample();
		List<Item> list = itemMapper.selectByExample(itemExample);
		PageInfo<Item> pageInfo = new PageInfo<>(list);
		EasyUiDataGridResult result = new EasyUiDataGridResult();
		result.setTotal(pageInfo.getTotal());
		result.setRows(list);
		return result;
	}
	

}
