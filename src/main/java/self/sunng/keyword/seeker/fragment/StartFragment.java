package self.sunng.keyword.seeker.fragment;

import self.sunng.keyword.seeker.entity.Keyword;

/**
 * Created by abc on 15/12/21.
 */
public class StartFragment extends AbstractFragment {
    @Override
    public String format(Keyword word) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < word.getWordLength(); i++) {
            sb.append("*");
        }
        return sb.toString();
    }
}
