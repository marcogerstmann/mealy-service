package com.marcogerstmann.mealy.propellants;

import com.marcogerstmann.mealy.common.exception.StiBusinessException;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.transaction.Transactional;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Transactional
public class PropellantServiceImpl implements PropellantService {

    private final String baseUri = "https://us-central1-propellant-markt-inc-api.cloudfunctions.net";

    @Override
    public List<PropellantListItemVo> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        PropellantListItemVo[] result = restTemplate.getForObject(baseUri + "/propellants", PropellantListItemVo[].class);
        return Optional.ofNullable(result)
                .map(Arrays::asList)
                .orElseThrow(() -> new StiBusinessException("Error fetching list of propellants"));
    }

    @Override
    public PropellantVo findById(Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        PropellantVo result = restTemplate.getForObject(baseUri + "/propellants/" + id, PropellantVo.class);
        return Optional.ofNullable(result)
                .orElseThrow(() -> new StiBusinessException("Error fetching a single propellant"));
    }

    @Override
    public List<PropellantVo> findAllDetails() {
        return findAll().parallelStream()
                .map(p -> findById(p.getId()))
                .collect(Collectors.toList());
    }

}
