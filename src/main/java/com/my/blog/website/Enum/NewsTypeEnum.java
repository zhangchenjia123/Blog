package com.my.blog.website.Enum;

import com.my.blog.website.utils.Enums.EnumUtils;
import com.my.blog.website.utils.Enums.IEnum;

public enum NewsTypeEnum implements IEnum<Integer> {

    is_use(0, "使用"),
    not_use(1,  "未使用");

    private int value;
    private String title;

    public static NewsTypeEnum create(Integer value) {
        return EnumUtils.getEnum(NewsTypeEnum.values(), value);
    }

    NewsTypeEnum(int value, String title) {
        this.value = value;
        this.title = title;
    }

    @Override
    public Integer getValue() {
        return value;
    }

    public String getTitle() {
        return title;
    }

    public String toString() {
        return EnumUtils.toJSONString(this);
    }
}