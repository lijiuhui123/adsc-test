package com.adsc.mapper;

import com.adsc.domain.Menu;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;


import java.util.List;

/**
 * @Author Joseph
 */
public interface MenuMapper extends BaseMapper<Menu> {
    List<String> selectPermsByUserId(Long id);
}
