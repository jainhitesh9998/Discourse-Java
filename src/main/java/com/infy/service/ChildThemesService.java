/*
 * Copyright 2021 Infosys Ltd.
 * Use of this source code is governed by GNU General Public License version 2
 * that can be found in the LICENSE file or at
 * https://opensource.org/licenses/GPL-2.0
 */

package com.infy.service;

import com.infy.service.dto.ChildThemesDTO;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

/**
 * Service Interface for managing {@link com.infy.domain.ChildThemes}.
 */
public interface ChildThemesService {

    /**
     * Save a childThemes.
     *
     * @param childThemesDTO the entity to save.
     * @return the persisted entity.
     */
    ChildThemesDTO save(ChildThemesDTO childThemesDTO);

    /**
     * Get all the childThemes.
     *
     * @param pageable the pagination information.
     * @return the list of entities.
     */
    Page<ChildThemesDTO> findAll(Pageable pageable);


    /**
     * Get the "id" childThemes.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    Optional<ChildThemesDTO> findOne(Long id);

    /**
     * Delete the "id" childThemes.
     *
     * @param id the id of the entity.
     */
    void delete(Long id);
}
