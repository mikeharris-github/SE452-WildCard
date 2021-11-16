package edu.depaul.cdm.se452.concept.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

@Service
@ConditionalOnProperty(name = "datasource", havingValue = "se452db")
public class RecordsService implements IRecords{

    @Autowired
    private RecordsRepository recordrepo;

    @Override
    public List<Records> findAll() {
        return (List<Records>) recordrepo.findAll();
    }
   
}
