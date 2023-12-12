package com.hei.rojotiana.repository;

import com.hei.rojotiana.PojaGenerated;
import com.hei.rojotiana.repository.model.Dummy;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@PojaGenerated
@Repository
public interface DummyRepository extends JpaRepository<Dummy, String> {

  @Override
  List<Dummy> findAll();
}
