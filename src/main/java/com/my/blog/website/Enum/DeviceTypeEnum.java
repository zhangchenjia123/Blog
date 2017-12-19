package com.my.blog.website.Enum;

import com.my.blog.website.utils.Enums.EnumUtils;
import com.my.blog.website.utils.Enums.IEnum;

/**
 * 设备类型
 */
public enum DeviceTypeEnum implements IEnum<Integer> {

    TYPE_1(0, "未知"),
    TYPE_2(2, "浏览器"),
    TYPE_3(3, "android"),
    TYPE_4(4, "ios");

    private int value;
    private String title;

    public static DeviceTypeEnum create(Integer value) {
        return EnumUtils.getEnum(DeviceTypeEnum.values(), value);
    }

    DeviceTypeEnum(int value, String title) {
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