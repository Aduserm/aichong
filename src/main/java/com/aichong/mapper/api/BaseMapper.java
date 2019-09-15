package com.aichong.mapper.api;

import java.io.Serializable;

/**
 * @author jingji.lin
 */
public interface BaseMapper<T, E extends Serializable> {

  int deleteByPrimaryKey(E id);

  int insert(T record);

  int insertSelective(T record);

  T selectByPrimaryKey(E id);

  int updateByPrimaryKeySelective(T record);

  int updateByPrimaryKey(T record);
}
