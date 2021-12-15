/*
 * Copyright 2021 Infosys Ltd.
 * Use of this source code is governed by GNU General Public License version 2
 * that can be found in the LICENSE file or at
 * https://opensource.org/licenses/GPL-2.0
 */

package com.infy.service;

import com.infy.service.dto.UserNotificationSchedulesDTO;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

/**
 * Service Interface for managing {@link com.infy.domain.UserNotificationSchedules}.
 */
public interface UserNotificationSchedulesService {

    /**
     * Save a userNotificationSchedules.
     *
     * @param userNotificationSchedulesDTO the entity to save.
     * @return the persisted entity.
     */
    UserNotificationSchedulesDTO save(UserNotificationSchedulesDTO userNotificationSchedulesDTO);

    /**
     * Get all the userNotificationSchedules.
     *
     * @param pageable the pagination information.
     * @return the list of entities.
     */
    Page<UserNotificationSchedulesDTO> findAll(Pageable pageable);


    /**
     * Get the "id" userNotificationSchedules.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    Optional<UserNotificationSchedulesDTO> findOne(Long id);

    /**
     * Delete the "id" userNotificationSchedules.
     *
     * @param id the id of the entity.
     */
    void delete(Long id);
}
