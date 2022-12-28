package com.adsc.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 情景数据表(scenario)实体类
 *
 * @author Joseph
 * @since 2022-12-27 15:30:08
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("scenario")
public class Scenario {
    private String name;
    private String description;
    private String strategy;
}
