//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.my.blog.website.utils.Enums;


import com.fasterxml.jackson.databind.util.StdConverter;

public class EnumResponseConverter extends StdConverter<IEnum, String> {
    public EnumResponseConverter() {
    }

    public String convert(IEnum iEnum) {
        return null == iEnum?"":iEnum.getTitle();
    }
}
