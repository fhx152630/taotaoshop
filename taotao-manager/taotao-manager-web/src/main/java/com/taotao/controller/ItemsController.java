package com.taotao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.taotao.common.pojo.EasyUiDataGridResult;
import com.taotao.common.pojo.EasyUiTreeNode;
import com.taotao.service.ItemsCatService;
import com.taotao.service.ItemsService;

@Controller
@RequestMapping("/items")
public class ItemsController {

	@Autowired
	private ItemsService itemsService;

	/**
	 * 查询商品列表
	 */
	@RequestMapping("/list")
	public @ResponseBody EasyUiDataGridResult getItemsResult(Integer page, Integer rows){
		EasyUiDataGridResult result = itemsService.getItemsResult(page,rows);
		return result;
	}
}
