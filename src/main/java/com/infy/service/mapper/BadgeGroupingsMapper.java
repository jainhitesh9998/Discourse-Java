/*
 * Copyright 2021 Infosys Ltd.
 * Use of this source code is governed by GNU General Public License version 2
 * that can be found in the LICENSE file or at
 * https://opensource.org/licenses/GPL-2.0
 */

package com.infy.service.mapper;


import com.infy.domain.*;
import com.infy.service.dto.BadgeGroupingsDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity {@link BadgeGroupings} and its DTO {@link BadgeGroupingsDTO}.
 */
@Mapper(componentModel = "spring", uses = {})
public interface BadgeGroupingsMapper extends EntityMapper<BadgeGroupingsDTO, BadgeGroupings> {



    default BadgeGroupings fromId(Long id) {
        if (id == null) {
            return null;
        }
        BadgeGroupings badgeGroupings = new BadgeGroupings();
        badgeGroupings.setId(id);
        return badgeGroupings;
    }
}
