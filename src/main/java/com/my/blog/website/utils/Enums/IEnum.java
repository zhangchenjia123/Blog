//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.my.blog.website.utils.Enums;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
@JsonSerialize(
        converter = EnumResponseConverter.class
)
public interface IEnum<T> {
    T getValue();

    String getTitle();
}
