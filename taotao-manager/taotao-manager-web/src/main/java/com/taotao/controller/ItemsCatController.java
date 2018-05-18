package com.taotao.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.taotao.common.pojo.EasyUiTreeNode;
import com.taotao.service.ItemsCatService;

@Controller
@RequestMapping("/items/cat")
public class ItemsCatController {

	@Autowired
	private ItemsCatService itemsCatService;
	
	/**
	 * 查询商品列表
	 */
	@RequestMapping("/list")
	public @ResponseBody List<EasyUiTreeNode> getItemsCatList(@RequestParam(value="id",defaultValue="0") Long parentId){
		List<EasyUiTreeNode> result = itemsCatService.getItemsCatList(parentId);
		return result;
	}
}
