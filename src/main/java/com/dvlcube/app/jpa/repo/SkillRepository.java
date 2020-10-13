package com.dvlcube.app.jpa.repo;

import org.springframework.stereotype.Repository;

import com.dvlcube.app.manager.data.SkillBean;
import com.dvlcube.app.jpa.BasicRepository;
import com.dvlcube.app.jpa.DvlRepository;

/**
 * @since 4 de jun de 2019
 * @author Ulisses Lima
 */
@Repository
public interface SkillRepository extends DvlRepository<SkillBean, Long>, BasicRepository<SkillBean, Long> {
  
  public List<SkillBean> findAllByOrderName(Sort sort);

	public List<SkillBean> findAll(Map<String, String> params, String group);

	public List<SkillBean> findAll(Map<String, String> params);

	public List<SkillBean> findAllByName(String name);


}
