package org.example.design_patterns_demo.template;

import com.google.common.collect.Lists;
import org.example.design_patterns_demo.template.dto.SheinDTO;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * shein轨迹推送
 * @author shaoke
 * @desc AbstracbTracePush
 * @since 2024/6/12
 */
@Service
public  class SheinTracePushTemplateProcessor extends AbstractTracePushTemplateProcessor<SheinDTO> {


    @Override
    public List<String> queryTrace(SheinDTO dto) {
        return Lists.newArrayList("shein1","shein2","shein3");
    }
}
