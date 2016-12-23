/*
 * Copyright 2011 Focus Technology, Co., Ltd. All rights reserved.
 */
package self.sunng.keyword.seeker.fragment;


import self.sunng.keyword.seeker.entity.Keyword;

/**
 * 高亮方式的片段。
 *
 * @author taofucheng
 */
public abstract class AbstractFragment {
    /**
     * 将指定的字符串用该格式化器进行格式化操作！
     *
     * @param word 预处理的内容
     * @return 返回处理过的内容
     */
    public abstract String format(Keyword word);
}
