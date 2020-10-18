package com.dvlcube.app.jpa.repo;

import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import com.dvlcube.app.jpa.BasicRepository;
import com.dvlcube.app.jpa.DvlRepository;
import com.dvlcube.app.manager.data.SkillBean;

/**
 * @since 4 de jun de 2019
 * @author Ulisses Lima
 */
@Repository
public interface SkillRepository extends DvlRepository<SkillBean, Long>, BasicRepository<SkillBean, Long> {

	Iterable<SkillBean> findByName(String name);

	boolean existsByName(String name);
	
	public List<SkillBean> findAllByOrderName(Sort sort);
	public List<SkillBean> findAll(Map<String, String> params, String group);
	public List<SkillBean> findAll(Map<String, String> params);
	public List<SkillBean> findAllByName(String name);

}
