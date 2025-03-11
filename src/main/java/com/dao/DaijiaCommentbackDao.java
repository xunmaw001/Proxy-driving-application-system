package com.dao;

import com.entity.DaijiaCommentbackEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.DaijiaCommentbackView;

/**
 * 代驾司机评价 Dao 接口
 *
 * @author 
 */
public interface DaijiaCommentbackDao extends BaseMapper<DaijiaCommentbackEntity> {

   List<DaijiaCommentbackView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
