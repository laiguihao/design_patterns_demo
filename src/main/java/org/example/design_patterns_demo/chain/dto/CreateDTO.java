package org.example.design_patterns_demo.chain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author shaoke
 * @desc ValidDTO
 * @since 2024/6/12
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateDTO {
    private String chainName;
}
