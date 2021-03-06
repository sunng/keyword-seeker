/*
 * Copyright 2011 Focus Technology, Co., Ltd. All rights reserved.
 */
package self.sunng.keyword.seeker.entity;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 过滤词及一些简单处理
 *
 * @author taofucheng
 */
public class StopCharacter {
    /**
     * 不需要处理的词，如标点符号、空格等
     */
    public static final Set<String> STOP_WORD = new HashSet<String>(Arrays.asList(new String[]{" ", "'", "、", "。",
        "·", "ˉ", "ˇ", "々", "—", "～", "‖", "…", "‘", "’", "“", "”", "〔", "〕", "〈", "〉", "《", "》", "「", "」", "『",
        "』", "〖", "〗", "【", "】", "±", "＋", "－", "×", "÷", "∧", "∨", "∑", "∏", "∪", "∩", "∈", "√", "⊥", "⊙", "∫",
        "∮", "≡", "≌", "≈", "∽", "∝", "≠", "≮", "≯", "≤", "≥", "∞", "∶", "∵", "∴", "∷", "♂", "♀", "°", "′", "〃",
        "℃", "＄", "¤", "￠", "￡", "‰", "§", "☆", "★", "〇", "○", "●", "◎", "◇", "◆", "□", "■", "△", "▽", "⊿", "▲",
        "▼", "◣", "◤", "◢", "◥", "▁", "▂", "▃", "▄", "▅", "▆", "▇", "█", "▉", "▊", "▋", "▌", "▍", "▎", "▏", "▓",
        "※", "→", "←", "↑", "↓", "↖", "↗", "↘", "↙", "〓", "ⅰ", "ⅱ", "ⅲ", "ⅳ", "ⅴ", "ⅵ", "ⅶ", "ⅷ", "ⅸ", "ⅹ", "①",
        "②", "③", "④", "⑤", "⑥", "⑦", "⑧", "⑨", "⑩", "⒈", "⒉", "⒊", "⒋", "⒌", "⒍", "⒎", "⒏", "⒐", "⒑", "⒒", "⒓",
        "⒔", "⒕", "⒖", "⒗", "⒘", "⒙", "⒚", "⒛", "⑴", "⑵", "⑶", "⑷", "⑸", "⑹", "⑺", "⑻", "⑼", "⑽", "⑾", "⑿", "⒀",
        "⒁", "⒂", "⒃", "⒄", "⒅", "⒆", "⒇", "Ⅰ", "Ⅱ", "Ⅲ", "Ⅳ", "Ⅴ", "Ⅵ", "Ⅶ", "Ⅷ", "Ⅸ", "Ⅹ", "Ⅺ", "Ⅻ", "！", "”",
        "＃", "￥", "％", "＆", "’", "（", "）", "＊", "＋", "，", "－", "．", "／", "０", "１", "２", "３", "４", "５", "６", "７",
        "８", "９", "：", "；", "＜", "＝", "＞", "？", "＠", "〔", "＼", "〕", "＾", "＿", "‘", "｛", "｜", "｝", "∏", "Ρ", "∑",
        "Υ", "Φ", "Χ", "Ψ", "Ω", "α", "β", "γ", "δ", "ε", "ζ", "η", "θ", "ι", "κ", "λ", "μ", "ν", "ξ", "ο", "π",
        "ρ", "σ", "τ", "υ", "φ", "χ", "ψ", "ω", "（", "）", "〔", "〕", "＾", "﹊", "﹍", "╭", "╮", "╰", "╯", "", "_",
        "", "^", "（", "^", "：", "！", "/", "\\", "\"", "<", ">", "`", "·", "。", "{", "}", "~", "～", "(", ")", "-",
        "√", "$", "@", "*", "&", "#", "卐", "㎎", "㎏", "㎜", "㎝", "㎞", "㎡", "㏄", "㏎", "㏑", "㏒", "㏕"}));
    /**
     * 在树当中标志一个词的结束！用于处理一个词是另一个长一点词的开头而容易被覆盖的情况
     */
    public static final String TREE_END_TAG = "end";

    /**
     * 判断指定的词是否是需要过滤的词。如果参数为空，则返回true，因为空也属于不处理的字符。
     *
     * @param ch 指定的词
     * @return true:是；false：否
     */
    public static boolean isStopChar(String ch) {
        if (StringUtils.isEmpty(ch)) {
            return true;
        }
        return STOP_WORD.contains(ch);
    }
}
