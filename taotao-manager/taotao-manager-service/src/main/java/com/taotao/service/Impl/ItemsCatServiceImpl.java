package com.taotao.service.Impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taotao.common.pojo.EasyUiTreeNode;
import com.taotao.mapper.ItemCatMapper;
import com.taotao.pojo.ItemCat;
import com.taotao.pojo.ItemCatExample;
import com.taotao.service.ItemsCatService;
@Service
public class ItemsCatServiceImpl implements ItemsCatService {

	@Autowired
	private ItemCatMapper itemCatMapper;
	@Override
	public List<EasyUiTreeNode> getItemsCatList(long parentId) {

		ItemCatExample example= new ItemCatExample();
		ItemCatExample.Criteria criteria = example.createCriteria();
		criteria.andParentIdEqualTo(parentId);
		List<ItemCat> list = itemCatMapper.selectByExample(example);
		List<EasyUiTreeNode> result = new ArrayList<EasyUiTreeNode>();
		for (ItemCat itemCat : list) {
			EasyUiTreeNode node = new EasyUiTreeNode();
			node.setId(itemCat.getId());
			node.setText(itemCat.getName());
			node.setState(itemCat.getIsParent()? "closed":"open");
			result.add(node);
		}
		return result;
	}

}
