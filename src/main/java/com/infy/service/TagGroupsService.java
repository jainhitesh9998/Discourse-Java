/*
 * Copyright 2021 Infosys Ltd.
 * Use of this source code is governed by GNU General Public License version 2
 * that can be found in the LICENSE file or at
 * https://opensource.org/licenses/GPL-2.0
 */

package com.infy.service;

import com.infy.service.dto.TagGroupsDTO;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

/**
 * Service Interface for managing {@link com.infy.domain.TagGroups}.
 */
public interface TagGroupsService {

    /**
     * Save a tagGroups.
     *
     * @param tagGroupsDTO the entity to save.
     * @return the persisted entity.
     */
    TagGroupsDTO save(TagGroupsDTO tagGroupsDTO);

    /**
     * Get all the tagGroups.
     *
     * @param pageable the pagination information.
     * @return the list of entities.
     */
    Page<TagGroupsDTO> findAll(Pageable pageable);


    /**
     * Get the "id" tagGroups.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    Optional<TagGroupsDTO> findOne(Long id);

    /**
     * Delete the "id" tagGroups.
     *
     * @param id the id of the entity.
     */
    void delete(Long id);
}
