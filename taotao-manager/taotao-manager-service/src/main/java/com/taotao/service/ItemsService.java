package com.taotao.service;

import java.util.List;

import com.taotao.common.pojo.EasyUiDataGridResult;
import com.taotao.common.pojo.EasyUiTreeNode;

public interface ItemsService {

	EasyUiDataGridResult getItemsResult(Integer page, Integer rows);


	
}
