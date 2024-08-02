package org.example.design_patterns_demo.template;

import com.google.common.collect.Lists;
import org.example.design_patterns_demo.template.dto.TiktokDTO;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * shein轨迹推送
 * @author shaoke
 * @desc AbstracbTracePush
 * @since 2024/6/12
 */

@Service
public  class TiktokTracePushTemplateProcessor extends AbstractTracePushTemplateProcessor<TiktokDTO> {


    @Override
    public List<String> queryTrace(TiktokDTO dto) {
        return Lists.newArrayList("tiktok1","tiktok2","tiktok3");
    }
}
