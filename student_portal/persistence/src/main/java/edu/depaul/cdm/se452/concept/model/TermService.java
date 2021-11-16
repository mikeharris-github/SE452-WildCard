package edu.depaul.cdm.se452.concept.model;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

@Service
@ConditionalOnProperty(name = "datasource", havingValue = "se452db")
public class TermService implements ITermService {

  @Autowired
  private TermRepository term;


  @Override
  public List < Term > findAll() {
      return (List<Term>) term.findAll();
  }

}