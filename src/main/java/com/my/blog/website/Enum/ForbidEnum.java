package com.my.blog.website.Enum;

import com.my.blog.website.utils.Enums.EnumUtils;
import com.my.blog.website.utils.Enums.IEnum;

/**
 * 禁用状态
 */
public enum ForbidEnum implements IEnum<Integer> {

    NORMAL(0, "正常"),
    NOT_NORMAL(1,  "禁用");

    private int value;
    private String title;

    public static ForbidEnum create(Integer value) {
        return EnumUtils.getEnum(ForbidEnum.values(), value);
    }

    ForbidEnum(int value, String title) {
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