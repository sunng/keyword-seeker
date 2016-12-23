package self.sunng.keyword.seeker;

import self.sunng.keyword.seeker.entity.Keyword;
import self.sunng.keyword.seeker.fragment.StartFragment;

public class Demo {
    public static void main(String[] args) {
        KWSeeker kw1 = KWSeeker.getInstance(new Keyword("test1"), new Keyword("tes2"));
        // 添加一个词
        kw1.addWord(new Keyword("test3"));
        // 使用默认的高亮方式将文本中含有上面指定的所有词显示出来！
        // kw1.highlight("这是tes1,要注意哦！");
        // 使用HTML页面加粗的高亮方式将文本中含有上面指定的所有词显示出来！
        // kw1.highlight("这是tes1,要注意哦！", new HTMLFragment("<b>", "</b>"));
        // 找出文本中所有含有上面词库中的词！
        System.out.println(kw1.isContain("这是test1,要注意哦！"));
        // 使用指定的processor（如：WordFinder找出文本中所有含有上面词库中的词）对文本进行处理！
        // System.out.println(kw1.process(new WordFinder(), "这是tes1,要注意哦！", null));

        System.out.println(kw1.highlight("这是test1,要注意哦！"));
        System.out.println(kw1.highlight("这是test1,要注意哦！", new StartFragment()));
    }
}
