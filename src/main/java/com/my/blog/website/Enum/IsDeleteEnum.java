package com.my.blog.website.Enum;

import com.my.blog.website.utils.Enums.EnumUtils;
import com.my.blog.website.utils.Enums.IEnum;

public enum IsDeleteEnum  implements IEnum<Integer> {

    IS_DELETE(1, "删除"),
    NOT_DELETE(0,  "未删除");

    private int value;
    private String title;

    public static IsDeleteEnum create(Integer value) {
        return EnumUtils.getEnum(IsDeleteEnum.values(), value);
    }

    IsDeleteEnum(int value, String title) {
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