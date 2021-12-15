/*
 * Copyright 2021 Infosys Ltd.
 * Use of this source code is governed by GNU General Public License version 2
 * that can be found in the LICENSE file or at
 * https://opensource.org/licenses/GPL-2.0
 */

package com.infy.service.mapper;


import com.infy.domain.*;
import com.infy.service.dto.StylesheetCacheDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity {@link StylesheetCache} and its DTO {@link StylesheetCacheDTO}.
 */
@Mapper(componentModel = "spring", uses = {})
public interface StylesheetCacheMapper extends EntityMapper<StylesheetCacheDTO, StylesheetCache> {



    default StylesheetCache fromId(Long id) {
        if (id == null) {
            return null;
        }
        StylesheetCache stylesheetCache = new StylesheetCache();
        stylesheetCache.setId(id);
        return stylesheetCache;
    }
}
