package com.my.blog.website.Enum;

import com.my.blog.website.utils.Enums.EnumUtils;
import com.my.blog.website.utils.Enums.IEnum;

public enum RecommendStatusEnum implements IEnum<Integer> {

    RECOMMEND(0, "不推荐"),
    NOT_RECOMMEND(1,  "推荐");

    private int value;
    private String title;

    public static RecommendStatusEnum create(Integer value) {
        return EnumUtils.getEnum(RecommendStatusEnum.values(), value);
    }

    RecommendStatusEnum(int value, String title) {
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