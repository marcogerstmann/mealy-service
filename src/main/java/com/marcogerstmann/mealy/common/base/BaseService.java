package com.marcogerstmann.mealy.common.base;

import com.marcogerstmann.mealy.common.enums.StiEntity;
import org.springframework.stereotype.Service;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public interface BaseService<V extends BaseVo> {

    @Nonnull
    List<V> findAll();

    @Nonnull
    Optional<V> findById(UUID id);

    @Nonnull
    V create(V vo);

    @Nonnull
    V updateById(UUID id, V vo);

    void deleteById(UUID id);

    V createOrUpdate(StiEntity entity, V vo, @Nullable UUID id);
}
