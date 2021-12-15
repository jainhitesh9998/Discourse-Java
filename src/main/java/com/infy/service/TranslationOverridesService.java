/*
 * Copyright 2021 Infosys Ltd.
 * Use of this source code is governed by GNU General Public License version 2
 * that can be found in the LICENSE file or at
 * https://opensource.org/licenses/GPL-2.0
 */

package com.infy.service;

import com.infy.service.dto.TranslationOverridesDTO;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

/**
 * Service Interface for managing {@link com.infy.domain.TranslationOverrides}.
 */
public interface TranslationOverridesService {

    /**
     * Save a translationOverrides.
     *
     * @param translationOverridesDTO the entity to save.
     * @return the persisted entity.
     */
    TranslationOverridesDTO save(TranslationOverridesDTO translationOverridesDTO);

    /**
     * Get all the translationOverrides.
     *
     * @param pageable the pagination information.
     * @return the list of entities.
     */
    Page<TranslationOverridesDTO> findAll(Pageable pageable);


    /**
     * Get the "id" translationOverrides.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    Optional<TranslationOverridesDTO> findOne(Long id);

    /**
     * Delete the "id" translationOverrides.
     *
     * @param id the id of the entity.
     */
    void delete(Long id);
}
