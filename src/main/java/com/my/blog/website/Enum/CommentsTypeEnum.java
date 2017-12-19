package com.my.blog.website.Enum;

import com.my.blog.website.utils.Enums.EnumUtils;
import com.my.blog.website.utils.Enums.IEnum;

public enum CommentsTypeEnum implements IEnum<Integer> {

    TYPE_1(0, "村镇服务"),
    TYPE_2(1,  "政务头条");

    private int value;
    private String title;

    public static CommentsTypeEnum create(Integer value) {
        return EnumUtils.getEnum(CommentsTypeEnum.values(), value);
    }

    CommentsTypeEnum(int value, String title) {
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