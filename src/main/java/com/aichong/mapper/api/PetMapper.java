package com.aichong.mapper.api;

import com.aichong.model.Pet;

public interface PetMapper {
    int deleteByPrimaryKey(String id);

    int insert(Pet record);

    int insertSelective(Pet record);

    Pet selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Pet record);

    int updateByPrimaryKey(Pet record);
}