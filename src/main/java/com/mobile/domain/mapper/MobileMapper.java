package com.mobile.domain.mapper;

import com.mobile.domain.po.Mobile;

public interface MobileMapper{
    long insert(Mobile record);

    Mobile selectByPrimaryKey(String id);
}
