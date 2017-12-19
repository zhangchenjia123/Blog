package com.my.blog.website.Enum;

import com.my.blog.website.utils.Enums.EnumUtils;
import com.my.blog.website.utils.Enums.IEnum;

public enum IsUseEnum implements IEnum<Integer> {

    IS_USE(0, "使用"),
    NOT_USE(1,  "未使用");

    private int value;
    private String title;

    public static IsUseEnum create(Integer value) {
        return EnumUtils.getEnum(IsUseEnum.values(), value);
    }

    IsUseEnum(int value, String title) {
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