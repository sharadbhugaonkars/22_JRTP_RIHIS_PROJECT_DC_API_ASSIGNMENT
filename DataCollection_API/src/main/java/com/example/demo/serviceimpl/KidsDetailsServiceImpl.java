package com.example.demo.serviceimpl;

import com.example.demo.entity.KidsDetails;
import com.example.demo.repo.KidsDetailsRepository;
import com.example.demo.service.IKidsDetailsService;
import java.lang.Long;
import java.lang.Override;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class KidsDetailsServiceImpl implements IKidsDetailsService {
  @Autowired
  private KidsDetailsRepository repo;

  @Override
  @Transactional
  public String saveKidsDetails(KidsDetails kidsdetails) {
     repo.save(kidsdetails);
     
     return "Kids Details Saved";
  }

  @Override
  @Transactional
  public void updateKidsDetails(KidsDetails kidsdetails) {
    repo.save(kidsdetails);
  }

  @Override
  @Transactional
  public void deleteKidsDetails(Long id) {
    repo.deleteById(id);
  }

  @Override
  @Transactional(
      readOnly = true
  )
  public KidsDetails getOneKidsDetails(Long id) {
    return repo.findById(id).get();
  }

  @Override
  @Transactional(
      readOnly = true
  )
  public List<KidsDetails> getAllKidsDetailss() {
    return repo.findAll();
  }
}
