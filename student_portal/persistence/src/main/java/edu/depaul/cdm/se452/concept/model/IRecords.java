package edu.depaul.cdm.se452.concept.model;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface IRecords {
    public List<Records> findAll();
}

