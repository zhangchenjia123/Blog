package com.my.blog.website.Enum;

import com.my.blog.website.utils.Enums.EnumUtils;
import com.my.blog.website.utils.Enums.IEnum;

public enum SourceEnum implements IEnum<Integer> {

    BELONG_TYPE_1(1, "全国"),
    BELONG_TYPE_2(2, "移动"),
    BELONG_TYPE_3(3, "联通"),
    BELONG_TYPE_4(4, "电信");

    private int value;
    private String title;

    public static SourceEnum create(Integer value) {
        return EnumUtils.getEnum(SourceEnum.values(), value);
    }

    SourceEnum(int value, String title) {
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