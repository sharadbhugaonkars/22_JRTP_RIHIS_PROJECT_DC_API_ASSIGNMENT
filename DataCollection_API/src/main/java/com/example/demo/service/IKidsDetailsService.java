package com.example.demo.service;

import com.example.demo.entity.KidsDetails;
import java.lang.Long;
import java.util.List;


public interface IKidsDetailsService {
	String saveKidsDetails(KidsDetails kidsdetails);

	void updateKidsDetails(KidsDetails kidsdetails);

	void deleteKidsDetails(Long id);

	KidsDetails getOneKidsDetails(Long id);

	List<KidsDetails> getAllKidsDetailss();
}
