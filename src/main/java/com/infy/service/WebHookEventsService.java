/*
 * Copyright 2021 Infosys Ltd.
 * Use of this source code is governed by GNU General Public License version 2
 * that can be found in the LICENSE file or at
 * https://opensource.org/licenses/GPL-2.0
 */

package com.infy.service;

import com.infy.service.dto.WebHookEventsDTO;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

/**
 * Service Interface for managing {@link com.infy.domain.WebHookEvents}.
 */
public interface WebHookEventsService {

    /**
     * Save a webHookEvents.
     *
     * @param webHookEventsDTO the entity to save.
     * @return the persisted entity.
     */
    WebHookEventsDTO save(WebHookEventsDTO webHookEventsDTO);

    /**
     * Get all the webHookEvents.
     *
     * @param pageable the pagination information.
     * @return the list of entities.
     */
    Page<WebHookEventsDTO> findAll(Pageable pageable);


    /**
     * Get the "id" webHookEvents.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    Optional<WebHookEventsDTO> findOne(Long id);

    /**
     * Delete the "id" webHookEvents.
     *
     * @param id the id of the entity.
     */
    void delete(Long id);
}
