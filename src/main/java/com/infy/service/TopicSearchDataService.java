/*
 * Copyright 2021 Infosys Ltd.
 * Use of this source code is governed by GNU General Public License version 2
 * that can be found in the LICENSE file or at
 * https://opensource.org/licenses/GPL-2.0
 */

package com.infy.service;

import com.infy.service.dto.TopicSearchDataDTO;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

/**
 * Service Interface for managing {@link com.infy.domain.TopicSearchData}.
 */
public interface TopicSearchDataService {

    /**
     * Save a topicSearchData.
     *
     * @param topicSearchDataDTO the entity to save.
     * @return the persisted entity.
     */
    TopicSearchDataDTO save(TopicSearchDataDTO topicSearchDataDTO);

    /**
     * Get all the topicSearchData.
     *
     * @param pageable the pagination information.
     * @return the list of entities.
     */
    Page<TopicSearchDataDTO> findAll(Pageable pageable);


    /**
     * Get the "id" topicSearchData.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    Optional<TopicSearchDataDTO> findOne(Long id);

    /**
     * Delete the "id" topicSearchData.
     *
     * @param id the id of the entity.
     */
    void delete(Long id);
}
