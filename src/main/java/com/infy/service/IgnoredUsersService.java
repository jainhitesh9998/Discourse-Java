/*
 * Copyright 2021 Infosys Ltd.
 * Use of this source code is governed by GNU General Public License version 2
 * that can be found in the LICENSE file or at
 * https://opensource.org/licenses/GPL-2.0
 */

package com.infy.service;

import com.infy.service.dto.IgnoredUsersDTO;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

/**
 * Service Interface for managing {@link com.infy.domain.IgnoredUsers}.
 */
public interface IgnoredUsersService {

    /**
     * Save a ignoredUsers.
     *
     * @param ignoredUsersDTO the entity to save.
     * @return the persisted entity.
     */
    IgnoredUsersDTO save(IgnoredUsersDTO ignoredUsersDTO);

    /**
     * Get all the ignoredUsers.
     *
     * @param pageable the pagination information.
     * @return the list of entities.
     */
    Page<IgnoredUsersDTO> findAll(Pageable pageable);


    /**
     * Get the "id" ignoredUsers.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    Optional<IgnoredUsersDTO> findOne(Long id);

    /**
     * Delete the "id" ignoredUsers.
     *
     * @param id the id of the entity.
     */
    void delete(Long id);
}
